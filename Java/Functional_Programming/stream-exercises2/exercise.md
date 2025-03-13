# Exercise: Stream Exercises2

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 7

## ChatGpt Prompt
create 7 more exercises like the ones you created here. keep the level just above exercise 6 and below exercise 7.

## Description

### 1. Sort Words by Frequency of Occurrence

Task:
Write a method that takes a list of words and returns a sorted list of words by their frequency in descending order.
Example Input:
List<String> words = List.of("apple", "banana", "apple", "cherry", "banana", "banana");
Expected Output:
["banana", "apple", "cherry"]
(“banana” appears 3 times, “apple” 2 times, and “cherry” 1 time)

### 2. Find the Longest Word in a List
Task:
Write a method that takes a list of words and returns the longest word. If multiple words have the same length, return any one of them.
Example Input:
List<String> words = List.of("apple", "banana", "cherry", "blueberry");
Expected Output:
"blueberry"

### 3. Count Unique Characters in a String
Task:
Write a method that takes a string and returns the number of unique characters in it.
Example Input:
String text = "hello";
Expected Output:
4  // Unique characters: 'h', 'e', 'l', 'o' (since 'l' repeats)

### 4. Merge Two Lists and Remove Duplicates
Task:
Write a method that takes two lists of integers and returns a single list containing all unique elements, sorted in ascending order.
Example Input:
List<Integer> list1 = List.of(3, 1, 4, 1, 5);
List<Integer> list2 = List.of(5, 9, 2, 6, 5, 3);
Expected Output:
[1, 2, 3, 4, 5, 6, 9]

### 5. Find the Most Common Word in a Sentence
Task:
Write a method that takes a sentence (a string) and returns the most frequently occurring word, ignoring case.
Example Input:
String sentence = "Java is great and Java is powerful";
Expected Output:
"java"

### 6. Compute the Average Word Length in a Sentence
Task:
Write a method that takes a sentence and returns the average length of the words in it, rounded to two decimal places.
Example Input:
String sentence = "Java streams are powerful";
Expected Output:
5.33  // (4+7+3+8) / 4 = 22 / 4 = 5.33

### 7. Find All Anagrams in a List of Words
Task:
Write a method that takes a list of words and groups them into sets of anagrams.
Example Input:
List<String> words = List.of("listen", "silent", "enlist", "rat", "tar", "art");
Expected Output:
{
  [listen, silent, enlist],  
  [rat, tar, art]
}

These exercises involve a mix of grouping, filtering, counting, sorting, and mapping in Java Streams. Let me know if you'd like solutions for any of them! 🚀

## ChatGpt Analysis

### 1. Ex1 Analysis:

✅ Correctness (8.5/10)
Handles Frequency Calculation Correctly:

The method correctly counts the occurrences of each word in the input list.
It uses putIfAbsent(word, 0) to ensure words start with a default count of 0 before incrementing.
Correctly Sorts by Frequency in Descending Order:

The sorting function correctly compares occurrences using Integer.compare(entry2.getValue(), entry1.getValue()), ensuring descending order.
Handles Edge Cases:

Works correctly when words appear multiple times.
Works when input contains only one unique word.
Works for an empty list (returns an empty list).
Issues:

Null Input Not Handled: If list is null, the method throws a NullPointerException. A null check should be added.
Could Be More Concise: The frequency map construction is verbose and can be simplified using Collectors.groupingBy().
🎨 Style & Readability (7.5/10)
Overly Verbose Frequency Calculation:

The frequency map construction uses putIfAbsent followed by manual incrementing, which is not the most concise way.
Better Approach:

Map<String, Long> wordFrequency = list.stream()
    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
This approach is cleaner and more idiomatic in Java Streams.
Sorting Could Use Comparator.comparing() for Readability:

Instead of sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue())), use:

.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
This improves clarity.
Class and Method Naming:

The class name FrequencyOfOccurrence is understandable but could be more concise, e.g., WordFrequencySorter.
The method name sortByFrequencyDesc is clear but could be slightly improved, e.g., sortWordsByFrequencyDescending().
Unnecessary Empty Print Statement in Test Class:

The System.out.println(); before the second separator is unnecessary.
🔄 Improved Version (More Concise and Readable)

    public class WordFrequencySorter {
        public static List<String> sortWordsByFrequencyDescending(List<String> list) {
            if (list == null) throw new IllegalArgumentException("Input list cannot be null");
            return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .toList();
        }
    }

This version:
✅ Removes manual frequency calculation (uses Collectors.groupingBy()).
✅ Improves sorting clarity using comparingByValue().reversed().
✅ Adds a null check to avoid NullPointerException.

📊 Final Score: 8/10
✅ Correctness: 8.5/10 (Correct logic, but null input isn't handled).
🎨 Style: 7.5/10 (Verbose frequency calculation and sorting logic could be cleaner).
Would you like me to review the test class as well or suggest improvements? 🚀

---
### 2. Ex2 Analysis:

Stream Efficiency:
The first stream finds maxNumOfCharacters, and the second stream filters and finds the first match.
This is efficient for most cases but iterates the list twice.
Alternative Approach: Using reduce() to find the longest word in one pass:
return list.stream().reduce((w1, w2) -> w1.length() >= w2.length() ? w1 : w2).orElse("");
This avoids storing an extra integer (maxNumOfCharacters) and removes the need for a second stream.

---
### 4. Ex4 Analysis:

Potential Minor Improvements (Optional)
Alternative Sorting:

Instead of Comparator.comparingInt(Integer::intValue), .sorted() could be used directly since integers have a natural order.
Alternative: .sorted() (default natural ordering)
Return Type for Flexibility:

.toList() returns an immutable list (Java 16+). If mutability is required, .collect(Collectors.toList()) could be used instead.
But since there's no requirement for a mutable list, keeping .toList() is fine.

---
### 5. Ex5 Analysis:

Suggested Improvements
Handle Empty Strings Properly:

Add a check:
if (sentence.trim().isEmpty()) {
    throw new IllegalArgumentException("Sentence cannot be empty");
}

Handle Punctuation Correctly:
Instead of split(" "), use a regex that removes punctuation:
String[] words = sentence.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");

Make .max() Safe with .orElseThrow():
.max(Map.Entry.comparingByValue()).orElseThrow(() -> new IllegalArgumentException("Sentence must contain at least one word"))

---
### 7. Ex7 Analysis:

Good Use of Streams, but the Sorting Logic is Hard to Read:

    word.chars().sorted().mapToObj(e -> (char) e).map(String::valueOf).collect(Collectors.joining())

✅ Correct but verbose.
❌ This can be simplified using:

    String sortedWord = word.chars().sorted()
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();

This avoids unnecessary object creation (mapToObj(e -> (char) e) and map(String::valueOf)).