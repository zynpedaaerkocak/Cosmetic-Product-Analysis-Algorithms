# Cosmetic Product Analysis & Benchmarking

A Java-based performance benchmarking application developed for the Analysis of Algorithms course[cite: 5]. This project implements and compares the runtime efficiencies of various sorting and searching algorithms using a dynamically generated cosmetic products dataset[cite: 5].

## Dataset Structure
The application simulates an e-commerce scenario by generating synthetic data for cosmetic products with the following attributes[cite: 3]:
* **Product ID:** Unique randomized identifiers[cite: 2, 3].
* **Brand:** Simulates top brands (Rare Beauty, Fenty, Rhode, Maybelline, Essence)[cite: 3].
* **Category:** Grouped by product types (Foundation, Mascara, Lipstick, Blush, Concealer)[cite: 3].
* **Metrics:** Evaluates real-time values including dynamic Price, user Rating, and Sales Count[cite: 2, 3].

## Implemented Algorithms
The project benchmarks the execution times of the following core algorithms[cite: 5]:
1. **Selection Sort:** An O(N^2) comparison-based sorting algorithm[cite: 8].
2. **Quick Sort:** A highly efficient O(N log N) divide-and-conquer algorithm[cite: 6].
3. **Radix Sort:** A non-comparative integer sorting algorithm that processes digits[cite: 7].
4. **Interpolation Search:** An optimized search algorithm for uniformly distributed sorted arrays[cite: 4].

## Benchmark Results
Below is the execution time analysis captured for a dataset size of 1,000 items[cite: 5]:

| Algorithm / Operation | Execution Time (Nanoseconds) | Performance Status |
| :--- | :--- | :--- |
| **Selection Sort** | 21,070,100 ns | Slowest (O(N^2)) |
| **Quick Sort** | 8,572,100 ns | Fast (O(N log N)) |
| **Radix Sort** | 7,038,900 ns | Fastest Linear Sort |
| **Interpolation Search** | 5,963,100 ns | Target Located Instantly |

### Sample Output Log
```text
Dataset Size : 1000

Selection Sort Time : 21070100 ns
Quick Sort Time : 8572100 ns
Radix Sort Time : 7038900 ns

Interpolation Search Time : 5963100 ns
Product Found!
CosmeticProduct{productId = 45449, brand = 'Rare Beauty', productName = 'Rare Beauty Product 260', price = 135.9384, rating = 1.28, salesCount = 9248, category = 'Concealer'}