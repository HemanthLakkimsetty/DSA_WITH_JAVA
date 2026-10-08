# Day 5 – Binary Search: Problems 1–11

> This file contains **only Problems 1 to 11** from the provided Day-5 Binary Search Question Bank.

---

## Problem 1: Binary Search

**LeetCode:** —

### Problem Statement

Given a sorted array of integers and a target value, use Binary Search to find the index of the target. If the target does not exist, return `-1`.

### Sample Input
```text
arr = [2, 4, 6, 8, 10, 12, 14]
target = 10
```

### Sample Output
```text
4
```

### Explanation

The array is sorted in ascending order. Use `low`, `high`, and `mid` to repeatedly divide the search space until the target is found.

---

## Problem 2: Binary Search in Descending Sorted Array

**LeetCode:** —

### Problem Statement

Given an array sorted in **descending order**, find the index of a given target using Binary Search.

### Sample Input
```text
arr = [20, 18, 15, 12, 10, 8, 5]
target = 12
```

### Sample Output
```text
3
```

### Explanation

The Binary Search logic must be modified because the array is sorted from larger to smaller values.

---

## Problem 3: Find the First Occurrence

**LeetCode:** 34 — Find First and Last Position of Element in Sorted Array

### Problem Statement

Given a sorted array containing duplicate values, find the **first occurrence** of the target.

### Sample Input
```text
arr = [1, 2, 2, 2, 3, 4]
target = 2
```

### Sample Output
```text
1
```

### Explanation

When the target is found, do not stop immediately. Continue searching toward the left side to find its first occurrence.

---

## Problem 4: Find the Last Occurrence

**LeetCode:** 34 — Find First and Last Position of Element in Sorted Array

### Problem Statement

Given a sorted array containing duplicate values, find the **last occurrence** of the target.

### Sample Input
```text
arr = [1, 2, 2, 2, 3, 4]
target = 2
```

### Sample Output
```text
3
```

### Explanation

When the target is found, continue searching toward the right side to find the last occurrence.

---

## Problem 5: Count Number of Occurrences

**LeetCode:** —

### Problem Statement

Given a sorted array and a target value, count how many times the target occurs in the array.

### Sample Input
```text
arr = [1, 2, 2, 2, 2, 3, 4]
target = 2
```

### Sample Output
```text
4
```

### Explanation

Use Binary Search to find the first and last occurrence.

```text
count = lastOccurrence - firstOccurrence + 1
```

If the target does not exist, return `0`.

---

## Problem 6: Find Floor of a Number

**LeetCode:** —

### Problem Statement

Given a sorted array and a target value, find the **floor** of the target.

The floor is the **largest element that is less than or equal to the target**.

### Sample Input
```text
arr = [2, 4, 6, 8, 10]
target = 7
```

### Sample Output
```text
6
```

### Explanation

`6` is the largest value in the array that is `<= 7`.

---

## Problem 7: Find Ceil of a Number

**LeetCode:** —

### Problem Statement

Given a sorted array and a target value, find the **ceil** of the target.

The ceil is the **smallest element that is greater than or equal to the target**.

### Sample Input
```text
arr = [2, 4, 6, 8, 10]
target = 7
```

### Sample Output
```text
8
```

### Explanation

`8` is the smallest value in the array that is `>= 7`.

---

## Problem 8: Search Insert Position

**LeetCode:** 35 — Search Insert Position

### Problem Statement

Given a sorted array and a target value, return the index where the target is located. If it does not exist, return the index where it should be inserted to maintain sorted order.

### Sample Input
```text
arr = [1, 3, 5, 6]
target = 4
```

### Sample Output
```text
2
```

### Explanation

`4` should be inserted between `3` and `5`, so its insertion index is `2`.

---

## Problem 9: Find the Smallest Element Greater Than or Equal to Target

**LeetCode:** —

### Problem Statement

Given a sorted array and a target, find the index of the **smallest element greater than or equal to the target**.

If no such element exists, return `-1`.

### Sample Input
```text
arr = [2, 5, 8, 12, 15]
target = 9
```

### Sample Output
```text
3
```

### Explanation

`12` is the smallest element greater than or equal to `9`.

This is a direct application of the **ceil / lower-bound pattern**.

---

## Problem 10: Find the Largest Element Less Than or Equal to Target

**LeetCode:** —

### Problem Statement

Given a sorted array and a target, find the index of the **largest element less than or equal to the target**.

If no such element exists, return `-1`.

### Sample Input
```text
arr = [2, 5, 8, 12, 15]
target = 9
```

### Sample Output
```text
2
```

### Explanation

`8` is the largest element that is less than or equal to `9`.

This is a direct application of the **floor / upper-bound pattern**.

---

## Problem 11: Find the Single Element in a Sorted Array

**LeetCode:** 540 — Single Element in a Sorted Array

### Problem Statement

Given a sorted array where every element appears exactly twice except for one element that appears only once, find the single element.

Solve the problem using Binary Search.

### Sample Input
```text
arr = [1, 1, 2, 3, 3, 4, 4, 5, 5]
```

### Sample Output
```text
2
```

### Explanation

The array is sorted and duplicate elements occur in pairs. Use the position of `mid` and its neighboring element to determine which half contains the single element.

---

# Recommended Order

```text
01 → Basic Binary Search
02 → Descending Binary Search
03 → First Occurrence
04 → Last Occurrence
05 → Count Occurrences
06 → Floor
07 → Ceil
08 → Search Insert Position
09 → Lower Bound
10 → Upper Bound
11 → Single Element
```

# Core Patterns

### First Occurrence

```text
if arr[mid] == target:
    answer = mid
    search left
```

### Last Occurrence

```text
if arr[mid] == target:
    answer = mid
    search right
```

### Count Occurrences

```text
last - first + 1
```

### Floor

```text
largest value <= target
```

### Ceil

```text
smallest value >= target
```

### Binary Search Complexity

```text
Time Complexity:  O(log n)
Space Complexity: O(1)
```
