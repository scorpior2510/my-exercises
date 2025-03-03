# Exercise: Various Stream Exercises

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 7

## ChatGpt Prompt
please generate 7 java exercises practicing streams with increasing difficulty from basic to intermeidate.

## Description

1. Basic - Convert List of Strings to Uppercase
Task:
Write a method that takes a list of strings and returns a new list where all strings are converted to uppercase.
Example Input:
List<String> words = List.of("apple", "banana", "cherry");
Expected Output:
["APPLE", "BANANA", "CHERRY"]
---
2. Basic - Filter Even Numbers from a List
Task:
Write a method that takes a list of integers and returns a list containing only the even numbers.
Example Input:
List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
Expected Output:
[2, 4, 6]
---
3. Basic - Find First Word Starting with a Given Letter
Task:
Write a method that takes a list of words and a character, and returns the first word that starts with that character. If no word is found, return "Not found".
Example Input:
List<String> words = List.of("car", "apple", "dog", "ant");  
char letter = 'a';
Expected Output:
"apple"
---
4. Intermediate - Find the Sum of Squares of Odd Numbers
Task:
Write a method that takes a list of integers and returns the sum of the squares of all odd numbers.
Example Input:
List<Integer> numbers = List.of(1, 2, 3, 4, 5);
Expected Output:
35  // (1*1 + 3*3 + 5*5)
---
5. Intermediate - Count Words of a Certain Length
Task:
Write a method that takes a list of words and an integer n, and returns the count of words with exactly n characters.
Example Input:
List<String> words = List.of("cat", "dog", "elephant", "tiger");  
int n = 3;
Expected Output:
2  // "cat" and "dog" have 3 characters
---
6. Intermediate - Group Words by Their Length
Task:
Write a method that takes a list of words and groups them by their length using a Map<Integer, List<String>>.
Example Input:
List<String> words = List.of("cat", "bat", "apple", "dog", "orange", "ant");
Expected Output:
{
  3 = ["cat", "bat", "dog", "ant"],
  5 = ["apple"],
  6 = ["orange"]
}
---
7. Intermediate - Find the Most Frequent Character in a String
Task:
Write a method that takes a string and returns the character that appears most frequently. If there are multiple characters with the same frequency, return any one of them.
Example Input:
String text = "banana";
Expected Output:
'a'  // appears 3 times
---
These exercises gradually introduce key stream concepts like map(), filter(), findFirst(), reduce(), collect(), and groupingBy(). Let me know if you'd like more challenges or variations! 🚀

## Resources
[Ex7 solution.txt](resources/ex7%20solution.txt)