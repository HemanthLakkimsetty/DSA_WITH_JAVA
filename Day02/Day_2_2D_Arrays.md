# 2D Arrays / Matrix -- DSA Question Bank

# Level 1 -- 2D Array Fundamentals

## Problem 1: Create and Print a Matrix

**LeetCode:** ---

### Problem Statement

Given a 2D integer array (matrix), print all its elements in row-wise
order.

### Sample Input

``` text
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
```

### Sample Output

``` text
1 2 3
4 5 6
7 8 9
```

### Hint / Explanation

Use nested loops. The outer loop handles rows and the inner loop handles
columns.

------------------------------------------------------------------------

## Problem 2: Find Maximum and Minimum in a 2D Array

**LeetCode:** ---

### Problem Statement

Given a 2D integer array, find the maximum and minimum elements present
in the matrix.

### Sample Input

``` text
matrix = [
    [10, 5, 8],
    [2, 15, 6],
    [9, 3, 12]
]
```

### Sample Output

``` text
Minimum = 2
Maximum = 15
```

### Hint / Explanation

Traverse every element once while maintaining `min` and `max` values.

------------------------------------------------------------------------

## Problem 3: Find Row Sum and Column Sum

**LeetCode:** ---

### Problem Statement

Given a 2D matrix, calculate the sum of every row and every column.

### Sample Input

``` text
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
```

### Sample Output

``` text
Row sums:
6
15
24

Column sums:
12
15
18
```

### Hint / Explanation

For row sums, traverse each row separately. For column sums, traverse
each column separately.

------------------------------------------------------------------------

## Problem 4: Find the Row with Maximum Sum

**LeetCode:** ---

### Problem Statement

Given a 2D integer matrix, find the row whose elements have the maximum
sum.

### Sample Input

``` text
matrix = [
    [1, 2, 3],
    [10, 5, 2],
    [4, 6, 1]
]
```

### Sample Output

``` text
17
```

### Hint / Explanation

Calculate the sum of each row and keep track of the largest sum.

------------------------------------------------------------------------

# Level 2 -- Matrix Arithmetic

## Problem 5: Matrix Addition

**LeetCode:** ---

### Problem Statement

Given two matrices of the same dimensions, add them and return the
resulting matrix.

### Sample Input

``` text
A = [
    [1, 2],
    [3, 4]
]

B = [
    [5, 6],
    [7, 8]
]
```

### Sample Output

``` text
[
    [6, 8],
    [10, 12]
]
```

### Hint / Explanation

Add corresponding elements:

``` text
result[i][j] = A[i][j] + B[i][j]
```

------------------------------------------------------------------------

## Problem 6: Matrix Multiplication

**LeetCode:** ---

### Problem Statement

Given two compatible matrices, perform matrix multiplication and return
the resulting matrix.

### Sample Input

``` text
A = [
    [1, 2],
    [3, 4]
]

B = [
    [5, 6],
    [7, 8]
]
```

### Sample Output

``` text
[
    [19, 22],
    [43, 50]
]
```

### Hint / Explanation

Use three nested loops.

The core formula is:

``` text
C[i][j] += A[i][k] * B[k][j]
```

Remember that matrix multiplication requires:

``` text
columns of A = rows of B
```

------------------------------------------------------------------------

# Level 3 -- Diagonals and Triangular Matrices

## Problem 7: Calculate Matrix Diagonal Sum

**LeetCode:** 1572 -- Matrix Diagonal Sum

### Problem Statement

Given a square matrix, calculate the sum of the primary diagonal and
secondary diagonal.

Do not count the center element twice when the matrix has odd
dimensions.

### Sample Input

``` text
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
```

### Sample Output

``` text
25
```

### Hint / Explanation

Primary diagonal:

``` text
matrix[i][i]
```

Secondary diagonal:

``` text
matrix[i][n - 1 - i]
```

The center element should be added only once.

------------------------------------------------------------------------

## Problem 8: Lower Triangular Matrix

**LeetCode:** ---

### Problem Statement

Given a square matrix, print or construct its lower triangular form.

All elements above the main diagonal should be replaced with `0`.

### Sample Input

``` text
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
```

### Sample Output

``` text
[
    [1, 0, 0],
    [4, 5, 0],
    [7, 8, 9]
]
```

### Hint / Explanation

For a lower triangular matrix, keep elements where:

``` text
i >= j
```

------------------------------------------------------------------------

# Level 4 -- Matrix Transformation

## Problem 9: Transpose a Matrix

**LeetCode:** 867 -- Transpose Matrix

### Problem Statement

Given an `m × n` matrix, return its transpose.

The transpose converts rows into columns.

### Sample Input

``` text
matrix = [
    [1, 2, 3],
    [4, 5, 6]
]
```

### Sample Output

``` text
[
    [1, 4],
    [2, 5],
    [3, 6]
]
```

### Hint / Explanation

The element at:

``` text
matrix[i][j]
```

moves to:

``` text
result[j][i]
```

For a square matrix, also learn the in-place transpose technique by
swapping elements across the main diagonal.

------------------------------------------------------------------------

## Problem 10: Flipping an Image

**LeetCode:** 832 -- Flipping an Image

### Problem Statement

Given an `n × n` binary matrix:

1.  Reverse every row.
2.  Invert every element (`0 → 1`, `1 → 0`).

Return the resulting matrix.

### Sample Input

``` text
image = [
    [1, 1, 0],
    [1, 0, 1],
    [0, 0, 0]
]
```

### Sample Output

``` text
[
    [1, 0, 0],
    [0, 1, 0],
    [1, 1, 1]
]
```

### Hint / Explanation

You can combine the reversal and inversion in one traversal using
two-pointer swapping.

------------------------------------------------------------------------

## Problem 11: Determine Whether Matrix Can Be Obtained by Rotation

**LeetCode:** 1886 -- Determine Whether Matrix Can Be Obtained By
Rotation

### Problem Statement

Given two square matrices, determine whether the target matrix can be
obtained by rotating the original matrix by:

``` text
0°
90°
180°
270°
```

### Sample Input

``` text
mat = [
    [0, 1],
    [1, 0]
]

target = [
    [1, 0],
    [0, 1]
]
```

### Sample Output

``` text
true
```

### Hint / Explanation

Rotate the matrix repeatedly and compare it with the target.

------------------------------------------------------------------------

# Level 5 -- Matrix Searching

## Problem 12: Search in a 2D Matrix

**LeetCode:** 74 -- Search a 2D Matrix

### Problem Statement

Given an `m × n` matrix where:

-   Each row is sorted in ascending order.
-   The first element of each row is greater than the last element of
    the previous row.

Determine whether a target value exists in the matrix.

### Sample Input

``` text
matrix = [
    [1, 3, 5, 7],
    [10, 11, 16, 20],
    [23, 30, 34, 60]
]

target = 3
```

### Sample Output

``` text
true
```

### Hint / Explanation

First understand the brute-force solution:

``` text
O(m × n)
```

Then solve it using binary search:

``` text
O(log(m × n))
```

Treat the matrix like a sorted one-dimensional array.

------------------------------------------------------------------------

# Level 6 -- Matrix Simulation and Movement

## Problem 13: Snake in Matrix

**LeetCode:** 3248 -- Snake in Matrix

### Problem Statement

Given the size of a square matrix and a sequence of movement commands,
determine the final position of the snake.

### Sample Input

``` text
n = 3

commands = [
    "RIGHT",
    "DOWN",
    "LEFT"
]
```

### Sample Output

``` text
Final position = (1, 0)
```

### Hint / Explanation

Maintain the current row and column.

For example:

``` text
UP    → row--
DOWN  → row++
LEFT  → column--
RIGHT → column++
```

Understand boundary handling and direction simulation.

------------------------------------------------------------------------

# Level 7 -- Matrix Traversal Patterns

## Problem 14: Spiral Matrix

**LeetCode:** 54 -- Spiral Matrix

### Problem Statement

Given an `m × n` matrix, return all elements in spiral order.

### Sample Input

``` text
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
```

### Sample Output

``` text
[1, 2, 3, 6, 9, 8, 7, 4, 5]
```

### Hint / Explanation

Maintain four boundaries:

``` text
top
bottom
left
right
```

Traverse:

``` text
left → right
top → bottom
right → left
bottom → top
```

Then shrink the boundaries.

------------------------------------------------------------------------

## Problem 15: Spiral Matrix II

**LeetCode:** 59 -- Spiral Matrix II

### Problem Statement

Given an integer `n`, generate an `n × n` matrix filled with numbers
from `1` to `n²` in spiral order.

### Sample Input

``` text
n = 3
```

### Sample Output

``` text
[
    [1, 2, 3],
    [8, 9, 4],
    [7, 6, 5]
]
```

### Hint / Explanation

This is the reverse form of Spiral Matrix.

Instead of reading an existing matrix, construct the matrix while moving
around its boundaries.

------------------------------------------------------------------------

# Level 8 -- Matrix Rotation

## Problem 16: Rotate Image

**LeetCode:** 48 -- Rotate Image

### Problem Statement

Given an `n × n` matrix, rotate the matrix 90 degrees clockwise
in-place.

You must modify the matrix without creating another matrix.

### Sample Input

``` text
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
```

### Sample Output

``` text
[
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
]
```

### Hint / Explanation

Use the important matrix rotation pattern:

``` text
Step 1 → Transpose the matrix
Step 2 → Reverse every row
```

Target complexity:

``` text
Time  → O(n²)
Space → O(1)
```

------------------------------------------------------------------------

# Complete Recommended Order

Solve the problems in this exact order:

``` text
1.  Create and Print a Matrix
2.  Find Maximum and Minimum in a 2D Array
3.  Row Sum and Column Sum
4.  Find Row with Maximum Sum
5.  Matrix Addition
6.  Matrix Multiplication
7.  Matrix Diagonal Sum
8.  Lower Triangular Matrix
9.  Transpose a Matrix
10. Flipping an Image
11. Determine Whether Matrix Can Be Obtained by Rotation
12. Search in a 2D Matrix
13. Snake in Matrix
14. Spiral Matrix
15. Spiral Matrix II
16. Rotate Image

```

# Core Patterns You Should Master

Before considering 2D Arrays complete, make sure you understand these
patterns:

``` text
1. Nested-loop traversal
2. Row-wise traversal
3. Column-wise traversal
4. Matrix dimensions: m × n
5. Row/column indexing
6. Finding min/max
7. Row and column sums
8. Matrix addition
9. Matrix multiplication
10. Main and secondary diagonals
11. Triangular matrix conditions
12. Matrix transpose
13. Two-pointer row reversal
14. Binary search on a matrix
15. Direction simulation
16. Boundary traversal
17. Spiral traversal
18. Matrix rotation
19. In-place matrix modification
20. Marker technique
21. Time and space optimization

```

# Complexity Targets

Try to understand the expected complexity rather than only memorizing
solutions.

``` text
Basic traversal
Time  → O(m × n)
Space → O(1)

Matrix addition
Time  → O(m × n)
Space → O(m × n) for result

Transpose
Time  → O(m × n)

Matrix multiplication
Time  → O(m × n × p)

Search in sorted matrix
Brute Force → O(m × n)
Binary Search → O(log(m × n))

Spiral Matrix
Time  → O(m × n)
Space → O(1) excluding output

Rotate Image
Time  → O(n²)
Space → O(1)

```
