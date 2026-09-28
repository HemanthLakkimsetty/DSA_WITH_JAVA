# Array Data Structure – Question Bank

## Problems - 1: Find the Largest Element in an Array

**LeetCode:** —

### Problem Statement

Given an array of integers, find and return the largest element present in the array.

### Sample Input

```text
arr = [10, 5, 20, 8, 15]
```

### Sample Output

```text
20
```

### Explanation

Among all the elements in the array, `20` is the largest element.

---

## Problems - 2: Find the Second Largest Element in an Array

**LeetCode:** —

### Problem Statement

Given an array of integers, find the second largest **distinct** element in the array. If a second largest element does not exist, return an appropriate value.

### Sample Input

```text
arr = [10, 5, 20, 8, 15]
```

### Sample Output

```text
15
```

### Explanation

The largest element is `20`. The next largest distinct element is `15`, so the second largest element is `15`.

---

## Problems - 3: Check if an Array is Sorted

**LeetCode:** —

### Problem Statement

Given an array of integers, determine whether the array is sorted in non-decreasing order.

### Sample Input

```text
arr = [1, 2, 2, 4, 5]
```

### Sample Output

```text
true
```

### Explanation

Every element is less than or equal to the element that follows it. Therefore, the array is sorted in non-decreasing order.

### Sample Input - 2

```text
arr = [1, 3, 2, 4]
```

### Sample Output - 2

```text
false
```

### Explanation

`3 > 2`, so the elements are not in non-decreasing order.

---

## Problems - 4: Reverse the Elements of an Array

**LeetCode:** —

### Problem Statement

Given an array of integers, reverse the order of its elements.

### Sample Input

```text
arr = [1, 2, 3, 4, 5]
```

### Sample Output

```text
[5, 4, 3, 2, 1]
```

### Explanation

The first element becomes the last, the second element becomes the second-last, and so on. Thus, the array is reversed.

---

## Problems - 5: Remove Duplicates from an Array

**LeetCode:** —

### Problem Statement

Given an array of integers, remove duplicate elements so that each distinct element appears only once.

### Sample Input

```text
arr = [1, 2, 2, 3, 1, 4, 3]
```

### Sample Output

```text
[1, 2, 3, 4]
```

### Explanation

The duplicate occurrences of `1`, `2`, and `3` are removed. Each distinct element appears only once in the resulting array.

---

## Problems - 6: Remove Duplicates from Sorted Array

**LeetCode Q26:** Remove Duplicates from Sorted Array

### Problem Statement

Given a sorted array of integers, remove the duplicates **in-place** such that each unique element appears only once. Return the number of unique elements.

### Sample Input

```text
arr = [1, 1, 2, 2, 3, 4, 4]
```

### Sample Output

```text
4
```

### Explanation

After removing duplicates, the unique elements are:

```text
[1, 2, 3, 4]
```

There are `4` unique elements, so the answer is `4`.

---

## Problems - 7: Rotate an Array by K Positions

**LeetCode Q189:** Rotate Array

### Problem Statement

Given an integer array, rotate the array to the **right by `k` positions**.

### Sample Input

```text
arr = [1, 2, 3, 4, 5, 6, 7]
k = 3
```

### Sample Output

```text
[5, 6, 7, 1, 2, 3, 4]
```

### Explanation

Rotating the array to the right by `3` positions moves the last three elements `[5, 6, 7]` to the beginning.

---

## Problems - 8: Move Zeros to the End

**LeetCode Q283:** Move Zeroes

### Problem Statement

Given an integer array, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

### Sample Input

```text
arr = [0, 1, 0, 3, 12]
```

### Sample Output

```text
[1, 3, 12, 0, 0]
```

### Explanation

The non-zero elements `1, 3, 12` remain in their original relative order. All zeros are moved to the end.

---

## Problems - 9: Find the Missing Number

**LeetCode Q268:** Missing Number

### Problem Statement

Given an array containing `n` distinct numbers taken from the range `[0, n]`, find the one number that is missing from the array.

### Sample Input

```text
arr = [3, 0, 1]
```

### Sample Output

```text
2
```

### Explanation

For `n = 3`, the expected numbers are:

```text
[0, 1, 2, 3]
```

The number `2` is missing from the array.

---

## Problems - 10: Intersection of Two Arrays

**LeetCode Q349:** Intersection of Two Arrays

### Problem Statement

Given two integer arrays, return their intersection. Each element in the result must be **unique**.

### Sample Input

```text
nums1 = [1, 2, 2, 1]
nums2 = [2, 2]
```

### Sample Output

```text
[2]
```

### Explanation

The common element between both arrays is `2`. Since the result should contain only unique elements, the answer is `[2]`.

---

## Problems - 11: Find the Majority Element

**LeetCode Q169:** Majority Element

### Problem Statement

Given an array of integers of size `n`, find the element that appears **more than `n / 2` times**.

You may assume that the majority element always exists.

### Sample Input

```text
arr = [2, 2, 1, 1, 1, 2, 2]
```

### Sample Output

```text
2
```

### Explanation

The array contains `7` elements.

A majority element must appear more than:

```text
7 / 2 = 3
```

times.

The element `2` appears `4` times, so `2` is the majority element.

---

## Complete Ordered List

| Problem | Topic | LeetCode |
| --- | --- | --- |
| Problems - 1 | Largest Element in an Array | — |
| Problems - 2 | Second Largest Element | — |
| Problems - 3 | Check if Array is Sorted | — |
| Problems - 4 | Reverse an Array | — |
| Problems - 5 | Remove Duplicates from an Array | — |
| Problems - 6 | Remove Duplicates from Sorted Array | Q26 |
| Problems - 7 | Rotate Array by K Positions | Q189 |
| Problems - 8 | Move Zeros to End | Q283 |
| Problems - 9 | Find Missing Number | Q268 |
| Problems - 10 | Intersection of Two Arrays | Q349 |
| Problems - 11 | Majority Element | Q169 |

---

## Note

The questions are kept in the same order as the original question list.

The LeetCode question numbers are mentioned wherever the corresponding LeetCode problem was identified.
