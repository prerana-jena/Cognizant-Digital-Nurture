# Exercise 3: Sorting Customer Orders

## 1. Understanding Sorting Algorithms

### Bubble Sort
- Repeatedly compares adjacent elements and swaps them if they are in the wrong order.
- Simple to implement but inefficient for large datasets.

### Insertion Sort
- Inserts each element into its correct position in the sorted portion of the array.
- Efficient for small or nearly sorted datasets.

### Quick Sort
- Uses the divide-and-conquer approach by selecting a pivot and partitioning the array.
- One of the fastest sorting algorithms for large datasets.

### Merge Sort
- Divides the array into halves, sorts each half recursively, and merges them.
- Provides consistent performance but requires additional memory.

---

## 2. Setup

Created a Java project named **SortingCustomerOrders**.

Classes:
- Order.java
- Sort.java
- SortTest.java

---

## 3. Implementation

### Order Class

Attributes:
- orderId
- customerName
- totalPrice

### Sorting Algorithms Implemented

- Bubble Sort
- Quick Sort

Orders are sorted based on **totalPrice**.

---

## 4. Analysis

| Algorithm | Best | Average | Worst |
|-----------|------|----------|--------|
| Bubble Sort | O(n) | O(n²) | O(n²) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) |

### Why is Quick Sort preferred?

- Faster for large datasets.
- Average time complexity is **O(n log n)**.
- Requires less memory than Merge Sort because it sorts in place.
- Bubble Sort is mainly useful for learning purposes or very small datasets.
