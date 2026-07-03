# Exercise 1: Inventory Management System

## 1. Understand the Problem

### Why are Data Structures and Algorithms essential in handling large inventories?

Data Structures and Algorithms (DSA) are essential for efficiently storing, organizing, and retrieving inventory data. They improve the speed of operations such as adding, updating, deleting, and searching products. Efficient algorithms reduce processing time and help the system handle large inventories with better performance and scalability.

### Types of Data Structures suitable for this problem

- **ArrayList** – Suitable for small inventories where frequent searching is not required.
- **HashMap** – Provides fast insertion, deletion, updating, and searching using Product ID as the key.
- **TreeMap** – Stores products in sorted order and provides O(log n) operations.
- **LinkedList** – Useful when frequent insertions and deletions are required.

**Chosen Data Structure:** `HashMap<Integer, Product>`

Reason: HashMap provides average O(1) time complexity for add, update, delete, and search operations.

---

## 2. Setup

- Created a Java project named **InventoryManagementSystem**.
- Implemented the following classes:
  - Product.java
  - Inventory.java
  - InventoryManagementTest.java

---

## 3. Implementation

### Product Class

The `Product` class contains the following attributes:

- productId
- productName
- quantity
- price

### Data Structure Used

A `HashMap<Integer, Product>` is used to store products.

The Product ID acts as the key, allowing quick access to product information.

### Operations Implemented

- Add Product
- Update Product
- Delete Product
- Display Products

---

## 4. Analysis

### Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Add Product | O(1) |
| Update Product | O(1) |
| Delete Product | O(1) |
| Search Product | O(1) |
| Display Products | O(n) |

### Optimization

- Using a HashMap allows direct access to products through their Product ID.
- This avoids traversing the entire collection as required in an ArrayList.
- For very large inventories, indexing, caching, or database indexing can further improve performance.
