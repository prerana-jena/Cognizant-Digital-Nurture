# Exercise 2: E-commerce Platform Search Function

## 1. Understand Asymptotic Notation

### What is Big O Notation?

Big O notation measures the time complexity of an algorithm. It describes how the execution time grows as the input size increases. It helps compare algorithms and choose the most efficient one.

### Search Scenarios

**Best Case**
- The element is found immediately.
- Linear Search: O(1)
- Binary Search: O(1)

**Average Case**
- The element is found somewhere in the middle.
- Linear Search: O(n)
- Binary Search: O(log n)

**Worst Case**
- The element is at the end or not present.
- Linear Search: O(n)
- Binary Search: O(log n)

---

## 2. Setup

Created a Java project named **ECommerceSearchSystem**.

Classes:
- Product.java
- Search.java
- SearchTest.java

---

## 3. Implementation

### Product Attributes

- productId
- productName
- category

### Search Algorithms

- Linear Search
- Binary Search

Products are stored in:
- Array for Linear Search
- Sorted Array for Binary Search

---

## 4. Analysis

| Algorithm | Best | Average | Worst |
|-----------|------|----------|--------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

### Which algorithm is better?

Binary Search is more suitable for large e-commerce platforms because it searches much faster than Linear Search. However, it requires the products to be sorted before searching. Linear Search is simpler and suitable for small or unsorted datasets.
