# Day 4 – 12 Linear Search Problems

> Exactly 12 problems, one for each requested topic.  
> Solve using basic loops and Linear Search. Include indices/positions wherever requested.

---

## 1. Search Target in 1D

### Problem

Given an integer array and a target value, search for the target using Linear Search.

- If the target exists, return its **index**.
- If it does not exist, return `-1`.

### Input
```text
arr = [10, 25, 7, 42, 18]
target = 42
```

### Output
```text
3
```

---

## 2. First Occurrence

### Problem

Given an array containing duplicate values and a target, find the **index of the first occurrence** of the target.

Return `-1` if the target does not exist.

### Input
```text
arr = [4, 7, 2, 7, 9, 7]
target = 7
```

### Output
```text
1
```

---

## 3. Last Occurrence

### Problem

Given an array containing duplicate values and a target, find the **index of the last occurrence** of the target.

Return `-1` if the target does not exist.

### Input
```text
arr = [4, 7, 2, 7, 9, 7]
target = 7
```

### Output
```text
5
```

---

## 4. Count Target

### Problem

Given an integer array and a target value, count how many times the target appears in the array.

### Input
```text
arr = [2, 5, 2, 8, 2, 9, 2]
target = 2
```

### Output
```text
4
```

---

## 5. Print / Store All Occurrences

### Problem

Given an array and a target value:

1. Find every occurrence of the target.
2. Print or store the **index of every occurrence**.
3. If the target does not occur, return an empty result.

### Input
```text
arr = [3, 5, 3, 8, 3, 9]
target = 3
```

### Output
```text
[0, 2, 4]
```

---

## 6. Check Multiple Existence

### Problem

Given an array and a target value, determine whether the target occurs **at least two times**.

Return `true` if it occurs two or more times; otherwise, return `false`.

### Input
```text
arr = [4, 8, 2, 8, 9]
target = 8
```

### Output
```text
true
```

---

## 7. Minimum

### Problem

Given an integer array, find the **minimum value and its index** using one linear traversal.

If the minimum occurs multiple times, return the **first index**.

### Input
```text
arr = [18, 5, 27, 3, 14]
```

### Output
```text
Minimum = 3
Index = 3
```

---

## 8. Maximum

### Problem

Given an integer array, find the **maximum value and its index** using one linear traversal.

If the maximum occurs multiple times, return the **first index**.

### Input
```text
arr = [8, 12, 6, 12, 9]
```

### Output
```text
Maximum = 12
Index = 1
```

---

## 9. Min + Max Together

### Problem

Given an integer array, find:

1. The minimum value and its **first index**.
2. The maximum value and its **first index**.

Use a single traversal.

### Input
```text
arr = [12, 5, 18, 3, 18, 9]
```

### Output
```text
Minimum = 3
Minimum Index = 3

Maximum = 18
Maximum Index = 2
```

---

## 10. Search Target in 2D

### Problem

Given a 2D integer array and a target value, search for the target using Linear Search.

- If found, return its **row and column**.
- If not found, indicate that the target does not exist.

Traverse the matrix row by row.

### Input
```text
matrix =
[
  [10, 20, 30],
  [40, 50, 60],
  [70, 80, 90]
]

target = 50
```

### Output
```text
Row = 1
Column = 1
```

---

## 11. Min + Max in 2D

### Problem

Given a 2D integer array, find:

1. The minimum value and its **row and column**.
2. The maximum value and its **row and column**.

Traverse the complete matrix.

### Input
```text
matrix =
[
  [8, 4, 7],
  [3, 9, 2],
  [6, 5, 1]
]
```

### Output
```text
Minimum = 1
Minimum Row = 2
Minimum Column = 2

Maximum = 9
Maximum Row = 1
Maximum Column = 1
```

---

## 12. Count Target + Positions in 2D

### Problem

Given a 2D integer array and a target value:

1. Count how many times the target occurs.
2. Print/store the **row and column of every occurrence**.

Traverse the matrix row by row.

### Input
```text
matrix =
[
  [5, 2, 8],
  [2, 9, 2],
  [4, 7, 6]
]

target = 2
```

### Output
```text
Count = 3

Positions:
(0, 1)
(1, 0)
(1, 2)
```

---

