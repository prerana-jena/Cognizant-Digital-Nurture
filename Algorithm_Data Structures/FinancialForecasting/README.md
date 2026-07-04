Exercise 7: Financial Forecasting
1. Understand Recursive Algorithms
What is Recursion?

Recursion is a programming technique in which a method calls itself to solve a smaller instance of the same problem. A recursive function must have:

Base Case: Stops the recursion.
Recursive Case: Calls the function with a smaller input.

Recursion simplifies problems that can be divided into smaller, similar subproblems.

Advantages of Recursion
Simple and easy to understand.
Reduces code complexity for recursive problems.
Suitable for mathematical computations, tree traversal, and divide-and-conquer algorithms.
Disadvantages
Uses extra memory due to function call stack.
Can be slower than iterative solutions.
May cause stack overflow for very large inputs.
2. Setup

Create a method to calculate the future value of an investment using recursion.

Formula:

Future Value=Present Value×(1+r)
n

where:

Present Value (PV) = Initial investment
r = Growth rate
n = Number of years

Instead of using the power function, recursion is used to repeatedly apply the growth rate.

4. Analysis
Time Complexity

Each recursive call decreases the number of years by 1.

Number of recursive calls = n

Therefore,

Time Complexity: O(n)

Space Complexity: O(n) (due to the recursion call stack)

Optimization

Although recursion is simple, it creates a new function call for every recursive step.

The solution can be optimized by:

Using an iterative approach, which reduces space complexity to O(1).
Using memoization if recursive calculations involve repeated subproblems.
Using dynamic programming for more complex forecasting problems with overlapping calculations.

For this problem, the recursive solution does not have overlapping subproblems, so memoization is generally unnecessary. An iterative solution is more efficient for large values of years.
