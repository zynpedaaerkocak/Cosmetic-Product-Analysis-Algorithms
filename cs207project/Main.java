package cs207project;


public class Main {
	public static void main(String[] args) {
		int size = 1000;
		CosmeticProduct[] products = DataGenerator.generateProducts(size);
		CosmeticProduct[] selectionArray = products.clone();
		CosmeticProduct[] quickArray = products.clone();
		CosmeticProduct[] radixArray = products.clone();
		
		long selectionTime = Benchmark.measureExecutionTime(()-> SelectionSort.sort(selectionArray));
		long quickTime = Benchmark.measureExecutionTime(()-> QuickSort.sort(quickArray,0,quickArray.length -1));
		long radixTime = Benchmark.measureExecutionTime(()-> RadixSort.sort(radixArray));
		
		System.out.println("Dataset Size : "+ size);
		System.out.println();
		System.out.println("Selection Sort Time : "+ selectionTime + " ns");
		System.out.println("Quick Sort Time : "+ quickTime + " ns");
		System.out.println("Radix Sort Time : "+ radixTime + " ns");
		System.out.println();
		
		int targetId = radixArray[size / 2].getProductId();
		long interpolationTime = Benchmark.measureExecutionTime(() -> InterpolationSearch.search(radixArray, targetId));
		int foundIndex = InterpolationSearch.search(radixArray,targetId);
        System.out.println("Interpolation Search Time : "+ interpolationTime + " ns");

		if (foundIndex != -1) {
            System.out.println("Product Found!");
            System.out.println(radixArray[foundIndex]);
      } else {
            System.out.println("Product not found.");
		}
		
      }
}