package cs207project;

public class InterpolationSearch {
	public static int search(CosmeticProduct[] arr,int targetId) {
		int low = 0;
		int high = arr.length -1;
		while (low <= high &&
                targetId >= arr[low].getProductId() &&
                targetId <= arr[high].getProductId()) {
            if (low == high) {
                if (arr[low].getProductId() == targetId) {
                    return low;
                }
                return -1;
            }
            int position = low + ((targetId - arr[low].getProductId()) * (high - low))/(arr[high].getProductId()- arr[low].getProductId());
            int currentId = arr[position].getProductId();
            if (currentId == targetId) {
            	return position;
            }
            if (currentId < targetId) {
                low = position + 1;
            } else {
                high = position - 1;
            }
        }
        return -1;
    }
}