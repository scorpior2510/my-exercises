# Exercise: Various String Exercises

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 15

## ChatGpt Prompt
I finished studying about strings in java from the following resource: https://www.geeksforgeeks.org/strings-in-java/ generate 15 exercises about Strings according to the following specifications: 1. should relate to things mentioned in the article 2. should include some common related things about the subject of strings 3. should be atomic and touch one angle at a time. 4. difficulty of exercises should increase gradually from 4/10 to 6.5/10 5. should include 5 "pure" string manipulations and working with the regular api and the other 10 should practice the other api's mentioned there 6. should take about 15-40 minutes per exercise to solve.

## Description

Here are 15 exercises on Java Strings, gradually increasing in difficulty from 4/10 to 6.5/10. The first five focus on pure string manipulation, while the rest cover other APIs mentioned in the article.

### 1. String Basics (Difficulty: 4/10)
Write a program that:
•	Takes a string as input.
•	Finds its length using length().
•	Extracts the first and last character using charAt().
•	Prints them in the format:
Length: X, First: Y, Last: Z

### 2. String Comparison (Difficulty: 4.5/10)
Write a program that:
•	Reads two strings from the user.
•	Compares them using equals() and compareTo().
•	Prints whether they are equal and the lexicographic comparison result.

### 3. Substring Extraction (Difficulty: 5/10)
Write a method that:
•	Takes a string and an integer n.
•	Extracts the first n characters using substring().
•	If n is greater than the string length, print "Invalid length".
•	Example:
Input: "GeeksforGeeks", 5
Output: "Geeks"

### 4. Character Frequency Counter (Difficulty: 5.5/10)
Write a program that:
•	Reads a string and a character from the user.
•	Counts how many times the character appears using charAt().
•	Example:
Input: "banana", 'a'
Output: 3

### 5. Reverse Words in a String (Difficulty: 5.5/10)
Write a function that:
•	Takes a sentence as input.
•	Reverses the order of words using split() and join().
•	Example:
Input: "Hello World Java"
Output: "Java World Hello"

### 6. StringBuilder Usage (Difficulty: 5/10)
Write a method using StringBuilder that:
•	Reads a string.
•	Appends " - Processed" to it.
•	Reverses the modified string.
•	Example:
Input: "Test"
Output: "dessorP - tseT"

### 7. Palindrome Checker (Difficulty: 5.5/10)
Write a program using StringBuilder that:
•	Checks if a string is a palindrome (same forward and backward).
•	Example:
Input: "madam"
Output: "Palindrome"

### 8. Anagram Checker (Difficulty: 5.5/10)
Write a program using toCharArray() and Arrays.sort() that:
•	Checks if two strings are anagrams (contain the same letters).
•	Example:
Input: "listen", "silent"
Output: "Anagrams"

### 9. Vowel and Consonant Counter (Difficulty: 5.5/10)
Write a program that:
•	Counts vowels and consonants in a string using toLowerCase() and contains().
•	Example:
Input: "Hello"
Output: Vowels: 2, Consonants: 3

### 10. Formatting Strings with String.format() (Difficulty: 5.5/10)
Write a method that:
•	Takes a person's name and age.
•	Uses String.format() to return:
"Hello, my name is [name] and I am [age] years old."

### 11. Remove Duplicate Characters (Difficulty: 6/10)
Write a function that:
•	Removes duplicate characters using Set<Character> and StringBuilder.
•	Example:
Input: "programming"
Output: "progamin"

### 12. Convert String to Title Case (Difficulty: 6/10)
Write a method that:
•	Converts a sentence into title case using split(), substring(), and toUpperCase().
•	Example:
Input: "java is fun"
Output: "Java Is Fun"

### 13. Find First Non-Repeating Character (Difficulty: 6/10)
Write a function that:
•	Finds the first non-repeating character using HashMap<Character, Integer>.
•	Example:
Input: "swiss"
Output: 'w'

### 14. Extract Digits from a String (Difficulty: 6.5/10)
Write a method using replaceAll() and regex that:
•	Extracts digits from a string and returns them as a single number.
•	Example:
Input: "abc123def456"
Output: 123456

### 15. Word Frequency Counter (Difficulty: 6.5/10)
Write a function using Map<String, Integer> that:
•	Counts word occurrences in a sentence.
•	Example:
Input: "Java is fun and Java is powerful"
Output: {Java=2, is=2, fun=1, and=1, powerful=1}


## ChatGpt Solution Analysis

### Solution for Ex11

Here's a Java solution for exercise 11: Remove Duplicate Characters, using a Set to track characters and a StringBuilder to construct the result:

    import java.util.HashSet;
    import java.util.Set;

    public class RemoveDuplicates {

        public static String removeDuplicateChars(String input) {
            Set<Character> seen = new HashSet<>();
            StringBuilder result = new StringBuilder();

            for (char ch : input.toCharArray()) {
                if (!seen.contains(ch)) {
                    seen.add(ch);
                    result.append(ch);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String input = "programming";
            String output = removeDuplicateChars(input);
            System.out.println("Output: " + output);  // Output: progamin
        }
    }

🔍 How it works:
Converts the input string to a char array.
Iterates over each character.
Adds each character to a Set if it hasn’t been seen before.
Appends unique characters to a StringBuilder.
Let me know if you want a version that preserves casing or handles Unicode/special characters more robustly.

### Analysis for Ex12

the following is a solution for exercise 12, analyze it for correctness and style and grade it from 1 to 10. provide a better and cleaner solution.

    public class Ex12 {

        private static String convertToTitleCase(String sentence) {
            String[] sentenceAsArray = sentence.split("\\W+");
            for (int i = 0; i < sentenceAsArray.length; i++) {
                sentenceAsArray[i] = sentenceAsArray[i].substring(0, 1).toUpperCase() + sentenceAsArray[i].substring(1, sentenceAsArray[i].length());
            }
            return String.join(" ", sentenceAsArray);
        }

        public static void main(String[] args) {
            System.out.println("\n-----Ex12: Convert String to Title Case\n");

            String input = "programming is fun";
            System.out.println("Input sentence: " + input);
            System.out.println("Input sentence in Title Case: " + convertToTitleCase(input));

            System.out.println("\n-----Ex12: Convert String to Title Case");
        }

    }

ChatGPT said:
✅ Analysis of the Provided Solution (Exercise 12: Convert to Title Case)

📌 Correctness
✅ The method convertToTitleCase correctly:
Splits the sentence into words.
Capitalizes the first letter of each word.
Joins them back with spaces.
⚠️ Minor Bug: The split pattern \\W+ splits on non-word characters, which includes punctuation and might lead to incorrect behavior for some inputs.
For example, "hello-world" would be split into ["hello", "world"] instead of treating hello-world as a single word.
Also, it removes punctuation (like ,, .), which is probably not intended in a title-case conversion.

🧑‍🎨 Style & Readability
👎 Variable name sentenceAsArray is a bit awkward. Better names would be words or tokens.
👎 No input validation (e.g., null or empty string).
✅ Output messages in main are clear and well-organized.
👎 The expression .substring(1, sentenceAsArray[i].length()) can just be .substring(1).

📊 Grade: 6.5/10
✔️ Correct in basic functionality.
❗ Could behave unexpectedly with punctuation or hyphenated words.
🧹 Can be cleaned up for style and robustness.

✅ Improved and Cleaner Version

    public class Ex12 {

        public static String convertToTitleCase(String sentence) {
            if (sentence == null || sentence.isEmpty()) {
                return sentence;
            }

            String[] words = sentence.split(" ");
            StringBuilder titleCase = new StringBuilder();

            for (String word : words) {
                if (word.isEmpty()) continue; // handle multiple spaces
                titleCase.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    titleCase.append(word.substring(1));
                }
                titleCase.append(" ");
            }

            return titleCase.toString().trim(); // remove trailing space
        }

        public static void main(String[] args) {
            System.out.println("\n----- Ex12: Convert String to Title Case -----");

            String input = "programming is fun";
            String output = convertToTitleCase(input);

            System.out.println("Input:  " + input);
            System.out.println("Output: " + output);

            System.out.println("----- End of Ex12 -----\n");
        }
    }

🧠 Why This Version is Better
Uses " " (space) instead of \\W+ to preserve punctuation and treat only spaces as separators.
Uses Character.toUpperCase() instead of substringing the first letter.
Handles empty input and extra spaces.
Clean naming and structure.
Would you like a version that preserves punctuation and capitalizes only alphabetic words?


### Solution for Ex13

supply a solution for the following exercise:

ChatGPT said:
Here's a clean and efficient Java solution for Exercise 13: Find First Non-Repeating Character, using a HashMap<Character, Integer> to count character occurrences:

✅ Solution

    import java.util.HashMap;
    import java.util.Map;

    public class Ex13 {

        public static Character findFirstNonRepeatingChar(String input) {
            if (input == null || input.isEmpty()) {
                return null; // or throw IllegalArgumentException depending on design choice
            }

            Map<Character, Integer> charCount = new HashMap<>();

            // First pass: Count occurrences
            for (char ch : input.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }

            // Second pass: Find first character with count 1
            for (char ch : input.toCharArray()) {
                if (charCount.get(ch) == 1) {
                    return ch;
                }
            }

            return null; // no non-repeating character found
        }

        public static void main(String[] args) {
            System.out.println("\n----- Ex13: Find First Non-Repeating Character -----");

            String input = "swiss";
            Character result = findFirstNonRepeatingChar(input);

            System.out.println("Input: " + input);
            System.out.println("First non-repeating character: " + (result != null ? "'" + result + "'" : "None found"));

            System.out.println("----- End of Ex13 -----\n");
        }
    }

🧠 Key Points
Time complexity: O(n)
Two linear passes through the string: one for counting, one for identifying.

Handles edge cases:
Returns null if input is null, empty, or all characters are repeating.
Case-sensitive ('S' and 's' are different).
Readable and idiomatic Java code with use of getOrDefault() for compact counting.
Let me know if you'd like a case-insensitive version or one that returns the index instead of the character.