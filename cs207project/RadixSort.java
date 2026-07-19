package cs207project;

public class RadixSort {
    public static void sort(CosmeticProduct[] array) {
        if (array == null || array.length == 0) return;

        int maxId = array[0].getProductId();
        for (CosmeticProduct product : array) {
            if (product.getProductId() > maxId) {
                maxId = product.getProductId();
            }
        }

        for (int exp = 1; maxId / exp > 0; exp *= 10) {
            countingSortByDigit(array, exp);
        }
    }

    private static void countingSortByDigit(CosmeticProduct[] array, int exp) {
        int n = array.length;
        CosmeticProduct[] output = new CosmeticProduct[n];
        int[] count = new int[10];

        for (CosmeticProduct product : array) {
            int digit = (product.getProductId() / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (array[i].getProductId() / exp) % 10;
            output[count[digit] - 1] = array[i];
            count[digit]--;
        }

        System.arraycopy(output, 0, array, 0, n);
    }
}