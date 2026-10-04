# String Data Structure – Question Bank

> **Goal:** Learn Strings from basic level and gradually discover useful problem-solving patterns.
>
> **Approach:** Start with simple loops, character operations, arrays, `StringBuilder`, and basic hashing. Do not assume knowledge of advanced algorithms such as KMP, Rabin-Karp, Z Algorithm, or advanced Sliding Window techniques.

---

## 1. Reverse String

**LeetCode:** [344 - Reverse String](https://leetcode.com/problems/reverse-string/)

### Problem Statement

Given a character array, reverse the characters in the array in-place.

### Sample Input

```text
s = ["h","e","l","l","o"]
```

### Sample Output

```text
["o","l","l","e","h"]
```

### Explanation

The characters are reversed so that the first character becomes the last and the last character becomes the first.

---

## 2. Length of Last Word

**LeetCode:** [58 - Length of Last Word](https://leetcode.com/problems/length-of-last-word/)

### Problem Statement

Given a string containing words separated by spaces, return the length of the last word.

### Sample Input

```text
s = "Hello World"
```

### Sample Output

```text
5
```

### Explanation

The last word is `"World"`, which contains 5 characters.

---

## 3. Score of a String

**LeetCode:** [3110 - Score of a String](https://leetcode.com/problems/score-of-a-string/)

### Problem Statement

Given a string, calculate its score. The score is the sum of the absolute differences between the ASCII values of every pair of adjacent characters.

### Sample Input

```text
s = "hello"
```

### Sample Output

```text
13
```

### Explanation

Calculate the ASCII difference between each pair of neighboring characters and add all the differences.

---

## 4. Valid Palindrome

**LeetCode:** [125 - Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

### Problem Statement

Given a string, determine whether it reads the same forward and backward after ignoring spaces, punctuation, and letter case.

### Sample Input

```text
s = "A man, a plan, a canal: Panama"
```

### Sample Output

```text
true
```

### Explanation

After removing non-alphanumeric characters and ignoring case, the string reads the same in both directions.

---

## 5. Reverse Prefix of Word

**LeetCode:** [2000 - Reverse Prefix of Word](https://leetcode.com/problems/reverse-prefix-of-word/)

### Problem Statement

Given a string and a character, reverse the part of the string from the beginning up to and including the first occurrence of that character.

### Sample Input

```text
word = "abcdefd"
ch = "d"
```

### Sample Output

```text
"dcbaefd"
```

### Explanation

The first `d` occurs at index 3. Reverse `"abcd"` and keep the remaining characters unchanged.

---

# Character Counting and Frequency

## 6. Character Frequency

**GeeksforGeeks:** [Character Frequency](https://www.geeksforgeeks.org/frequency-of-each-character-in-a-string/)

### Problem Statement

Given a string, count how many times each character occurs.

### Sample Input

```text
s = "programming"
```

### Sample Output

```text
p = 1
r = 2
o = 1
g = 2
a = 1
m = 2
i = 1
n = 1
```

### Explanation

Traverse the string and maintain the count of every character.

---

## 7. Find Duplicate Characters

**GeeksforGeeks:** [Find Duplicate Characters](https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/)

### Problem Statement

Given a string, find all characters that occur more than once.

### Sample Input

```text
s = "programming"
```

### Sample Output

```text
r
g
m
```

### Explanation

Count the occurrences of every character and print the characters whose frequency is greater than 1.

---

## 8. First Unique Character in a String

**LeetCode:** [387 - First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)

### Problem Statement

Given a string, find the index of the first character that appears only once.

### Sample Input

```text
s = "leetcode"
```

### Sample Output

```text
0
```

### Explanation

`l` appears only once and is the first unique character, so its index is `0`.

---

## 9. Valid Anagram

**LeetCode:** [242 - Valid Anagram](https://leetcode.com/problems/valid-anagram/)

### Problem Statement

Given two strings, determine whether they contain the same characters with the same frequencies.

### Sample Input

```text
s = "anagram"
t = "nagaram"
```

### Sample Output

```text
true
```

### Explanation

Both strings contain exactly the same characters with identical frequencies.

---

## 10. Count the Number of Consistent Strings

**LeetCode:** [1684 - Count the Number of Consistent Strings](https://leetcode.com/problems/count-the-number-of-consistent-strings/)

### Problem Statement

Given a string containing allowed characters and an array of words, count how many words contain only allowed characters.

### Sample Input

```text
allowed = "ab"
words = ["ad","bd","aaab","baa","badab"]
```

### Sample Output

```text
2
```

### Explanation

Only `"aaab"` and `"baa"` contain characters exclusively from the allowed set.

---

## 11. Find Common Characters

**LeetCode:** [1002 - Find Common Characters](https://leetcode.com/problems/find-common-characters/)

### Problem Statement

Given an array of strings, find all characters that appear in every string, including repeated characters.

### Sample Input

```text
words = ["bella","label","roller"]
```

### Sample Output

```text
["e","l","l"]
```

### Explanation

`e` appears in every word once, while `l` appears in every word at least twice.

---

## 12. Uncommon Words from Two Sentences

**LeetCode:** [884 - Uncommon Words from Two Sentences](https://leetcode.com/problems/uncommon-words-from-two-sentences/)

### Problem Statement

Given two sentences, return words that appear exactly once in the combined sentences.

### Sample Input

```text
s1 = "this apple is sweet"
s2 = "this apple is sour"
```

### Sample Output

```text
["sweet","sour"]
```

### Explanation

`this`, `apple`, and `is` occur more than once. `sweet` and `sour` occur exactly once.

---

# Basic String Comparison and Searching

## 13. String Rotation Check

**GeeksforGeeks:** [Check if One String Is a Rotation of Another](https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/)

### Problem Statement

Given two strings, determine whether the second string can be obtained by rotating the first string.

### Sample Input

```text
s1 = "abcd"
s2 = "cdab"
```

### Sample Output

```text
true
```

### Explanation

Rotating `"abcd"` moves `"ab"` from the beginning to the end, producing `"cdab"`.

---

## 14. Append Characters to Make Subsequence

**LeetCode:** [2486 - Append Characters to String to Make Subsequence](https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/)

### Problem Statement

Given strings `s` and `t`, determine the minimum number of characters that must be appended to `s` so that `t` becomes a subsequence of `s`.

### Sample Input

```text
s = "coaching"
t = "coding"
```

### Sample Output

```text
4
```

### Explanation

Some characters of `t` can already be found in order inside `s`. The remaining characters must be appended.

---

## 15. Check If One String Swap Can Make Strings Equal

**LeetCode:** [1790 - Check if One String Swap Can Make Strings Equal](https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/)

### Problem Statement

Given two strings of equal length, determine whether they can become equal after performing at most one swap of two characters in one string.

### Sample Input

```text
s1 = "bank"
s2 = "kanb"
```

### Sample Output

```text
true
```

### Explanation

Swapping the first and last characters of `"bank"` produces `"kanb"`.

---

## 16. Find the Index of the First Occurrence in a String

**LeetCode:** [28 - Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

### Problem Statement

Given two strings `haystack` and `needle`, find the first index where `needle` occurs in `haystack`.

### Sample Input

```text
haystack = "sadbutsad"
needle = "sad"
```

### Sample Output

```text
0
```

### Explanation

The substring `"sad"` first appears starting at index `0`.

---

## 17. String Matching in an Array

**LeetCode:** [1408 - String Matching in an Array](https://leetcode.com/problems/string-matching-in-an-array/)

### Problem Statement

Given an array of strings, return all strings that are substrings of another string in the same array.

### Sample Input

```text
words = ["mass","as","hero","superhero"]
```

### Sample Output

```text
["as","hero"]
```

### Explanation

`"as"` is part of `"mass"` and `"hero"` is part of `"superhero"`.

---

## 18. Counting Words With a Given Prefix

**LeetCode:** [2185 - Counting Words With a Given Prefix](https://leetcode.com/problems/counting-words-with-a-given-prefix/)

### Problem Statement

Given an array of words and a prefix, count how many words start with that prefix.

### Sample Input

```text
words = ["pay","attention","practice","attend"]
pref = "at"
```

### Sample Output

```text
2
```

### Explanation

`"attention"` and `"attend"` start with `"at"`.

---

## 19. Check If a Word Occurs As a Prefix of Any Word in a Sentence

**LeetCode:** [1455 - Check If a Word Occurs As a Prefix of Any Word in a Sentence](https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/)

### Problem Statement

Given a sentence and a search word, return the position of the first word in the sentence that starts with the search word.

### Sample Input

```text
sentence = "i love eating burger"
searchWord = "burg"
```

### Sample Output

```text
4
```

### Explanation

The fourth word, `"burger"`, starts with `"burg"`.

---

# Basic Palindrome Problems

## 20. Longest Palindrome

**LeetCode:** [409 - Longest Palindrome](https://leetcode.com/problems/longest-palindrome/)

### Problem Statement

Given a string containing uppercase and lowercase letters, determine the maximum possible length of a palindrome that can be built using those characters.

### Sample Input

```text
s = "abccccdd"
```

### Sample Output

```text
7
```

### Explanation

The available characters can be arranged to form a palindrome of length 7.

---

## 21. Palindrome Permutation

**LeetCode:** [266 - Palindrome Permutation](https://leetcode.com/problems/palindrome-permutation/)

### Problem Statement

Given a string, determine whether its characters can be rearranged to form a palindrome.

### Sample Input

```text
s = "code"
```

### Sample Output

```text
false
```

### Explanation

More than one character has an odd frequency, so the characters cannot be rearranged into a palindrome.

---

## 22. Maximum Score After Splitting a String

**LeetCode:** [1422 - Maximum Score After Splitting a String](https://leetcode.com/problems/maximum-score-after-splitting-a-string/)

### Problem Statement

Split a binary string into two non-empty parts. The score is the number of zeroes in the left part plus the number of ones in the right part. Return the maximum score.

### Sample Input

```text
s = "011101"
```

### Sample Output

```text
5
```

### Explanation

Try each valid split and calculate the number of zeroes on the left and ones on the right.

---

# String Manipulation

## 23. String Compression

**LeetCode:** [443 - String Compression](https://leetcode.com/problems/string-compression/)

### Problem Statement

Given an array of characters, compress consecutive repeated characters by storing the character followed by its count.

### Sample Input

```text
chars = ["a","a","b","b","c","c","c"]
```

### Sample Output

```text
["a","2","b","2","c","3"]
```

### Explanation

Two `a` characters become `a2`, two `b` characters become `b2`, and three `c` characters become `c3`.

---

## 24. Add Spaces to a String

**LeetCode:** [2109 - Adding Spaces to a String](https://leetcode.com/problems/adding-spaces-to-a-string/)

### Problem Statement

Given a string and positions where spaces must be inserted, return the resulting string.

### Sample Input

```text
s = "LeetcodeHelpsMeLearn"
spaces = [8,13,15]
```

### Sample Output

```text
"Leetcode Helps Me Learn"
```

### Explanation

Insert spaces before the characters at the given positions.

---

## 25. Make the String Great

**LeetCode:** [1544 - Make The String Great](https://leetcode.com/problems/make-the-string-great/)

### Problem Statement

Remove adjacent pairs of the same alphabetic character when one is uppercase and the other is lowercase. Continue until no such pair remains.

### Sample Input

```text
s = "leEeetcode"
```

### Sample Output

```text
"leetcode"
```

### Explanation

The adjacent `eE` pair cancels out. Continue checking the resulting string until it becomes stable.

---

## 26. Remove Adjacent Duplicates in String

**LeetCode:** [1047 - Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)

### Problem Statement

Repeatedly remove two adjacent equal characters until no adjacent duplicate pair remains.

### Sample Input

```text
s = "abbaca"
```

### Sample Output

```text
"ca"
```

### Explanation

Remove `bb` first, producing `"aaca"`. Then remove `aa`, leaving `"ca"`.

---

# First Pattern Introduction

> These problems are intentionally placed later. You do **not** need to know the pattern name before solving them. First try to solve them using the basic tools you already know. Then learn the pattern that makes the solution faster or cleaner.

## 27. Valid Palindrome II

**LeetCode:** [680 - Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/)

### Problem Statement

Given a string, determine whether it can become a palindrome after deleting at most one character.

### Sample Input

```text
s = "abca"
```

### Sample Output

```text
true
```

### Explanation

Deleting either `b` or `c` produces a palindrome.

---

## 28. Reverse Words in a String

**LeetCode:** [151 - Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)

### Problem Statement

Given a string containing words separated by spaces, return the words in reverse order.

### Sample Input

```text
s = "the sky is blue"
```

### Sample Output

```text
"blue is sky the"
```

### Explanation

The order of the words is reversed while the characters inside each word remain unchanged.

---

## 29. Maximum Number of Vowels in a Substring of Given Length

**LeetCode:** [1456 - Maximum Number of Vowels in a Substring of Given Length](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)

### Problem Statement

Given a string and an integer `k`, find the maximum number of vowels present in any substring of length `k`.

### Sample Input

```text
s = "abciiidef"
k = 3
```

### Sample Output

```text
3
```

### Explanation

The substring `"iii"` has three vowels.

> **Learning goal:** First try a simple solution by checking every substring. After solving it, learn how a fixed-size window can avoid repeated work.

---

# What You Should Learn From This Question Bank

## Stage 1 — String Basics

Learn:

- String indexing
- Character traversal
- `charAt()`
- `length()`
- `substring()`
- `equals()`
- `toCharArray()`
- `StringBuilder`
- `Character` methods

Problems:

- 1–5

---

## Stage 2 — Frequency and Counting

Learn:

- Character counting
- Frequency arrays
- `HashMap`
- `HashSet`
- Comparing frequencies

Problems:

- 6–12

---

## Stage 3 — Searching and Comparison

Learn:

- Character-by-character comparison
- Substrings
- Prefix checking
- Basic nested loops
- `contains()`
- `startsWith()`
- Basic subsequence thinking

Problems:

- 13–19

---

## Stage 4 — Palindrome and String Logic

Learn:

- Forward vs backward comparison
- Character frequencies
- Building palindrome-related logic
- Basic split/prefix counting

Problems:

- 20–22

---

## Stage 5 — String Manipulation

Learn:

- Building strings efficiently
- Consecutive character counting
- Repeated removal
- Basic stack-like thinking using `StringBuilder`

Problems:

- 23–26

---

## Stage 6 — First Pattern Discovery

You do not need to memorize these patterns before solving the problems.

You will naturally encounter:

- Comparing from both ends → **Two-Pointer idea**
- Reusing information from neighboring positions → **Window idea**
- Maintaining characters while removing previous characters → **Stack-like idea**

Problems:

- 27–29

---

# Topics Intentionally Kept for Later

The following are **not included in this beginner String bank** because they require concepts that should be learned separately first:

- Longest Substring Without Repeating Characters
- Minimum Window Substring
- Find All Anagrams in a String
- Permutation in String
- Longest Repeating Character Replacement
- KMP
- Rabin-Karp
- Z Algorithm
- Trie-based String Problems
- Word Break
- Decode String
- Reverse Substrings Between Each Pair of Parentheses
- Palindrome Partitioning
- Longest Palindromic Substring
- Advanced Backtracking
- Advanced Greedy/String + Heap problems

These can be added later as **Intermediate Strings** and **Advanced Strings** after the required patterns and data structures are learned.

---

# Recommended Learning Order

```text
String Basics
      ↓
Character Traversal
      ↓
Frequency / Counting
      ↓
String Comparison
      ↓
Palindrome
      ↓
String Manipulation
      ↓
Basic Searching
      ↓
Two-End Scanning
      ↓
Fixed-Size Window
      ↓
Stack-Based Strings
      ↓
Advanced String Patterns
```

> **Rule:** Do not worry about knowing the pattern before attempting a problem. Try the straightforward solution first. Once you understand the problem, learn the pattern that improves it.
