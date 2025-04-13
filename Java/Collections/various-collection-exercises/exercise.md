# Exercise: Various Collection Exercises 

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 18

## ChatGpt Prompt
I finished studying about the following collection api implementations: HashSet, HashMap, ArrayList. i also briefly got familiarity with other implementations like: TreeSet, LinkedHashSet, LinkedList. resources i used (for you to look inside and see their contents) are the following articles: 1. https://viridian-lightyear-075.notion.site/Collection-API-8eea7081fa9247b4bc3c97353915876d 2. https://www.youtube.com/watch?v=H62Jfv1DJlU&ab_channel=CodingwithJohn 3. https://www.baeldung.com/java-hashmap 4. https://www.youtube.com/watch?v=QvHBHuuddYk&ab_channel=CodingwithJohn 5. https://www.baeldung.com/java-hashset 6. https://www.youtube.com/watch?v=NbYgm0r7u6o&ab_channel=CodingwithJohn 7. https://www.baeldung.com/java-arraylist 8. https://www.baeldung.com/java-set-vs-list please generate 20 varied practice exercises about these topics. specifications: 1. difficulty level should range from 5/10 to 6.5/10 2. first 15 exercises should be atomic and focused, each one taking about 20-30 minutes 3. last 5 exercises should be more involved and difficult and complex - 40 - 50 minutes a piece

## Description

ChatGPT said:
Here’s a set of 20 practice exercises for you. The first 15 are focused and should take around 20–30 minutes each, while the last 5 are more involved and should take 40–50 minutes.

Focused Exercises (20–30 min each)

#### 1. Basic HashSet Operations
•	Create a HashSet<Integer> and perform the following:
o	Add 10 random numbers.
o	Try adding a duplicate and verify that it doesn’t get added.
o	Remove an element.
o	Iterate and print all elements.
#### 2. Unique Words Counter (HashSet)
•	Write a method that takes a sentence as input and returns the number of unique words using a HashSet<String>.
o	Ignore case sensitivity.
o	Consider punctuation removal.
#### 3. Custom Object in HashSet
•	Create a Person class with name and age.
o	Add multiple Person objects to a HashSet.
o	Implement equals() and hashCode() so duplicates are not allowed.
#### 4. HashMap Basics
•	Create a HashMap<String, Integer> to store student names and scores.
o	Add 5 students.
o	Update a student’s score.
o	Check if a specific student exists.
o	Iterate and print all entries.
#### 5. Word Frequency Counter (HashMap)
•	Write a method that counts word occurrences in a given sentence and returns a HashMap<String, Integer>.
#### 6. Iterating Over a HashMap
•	Given a HashMap<String, Double> of product prices, write methods to:
o	Print all key-value pairs.
o	Find the most expensive product.
o	Find the least expensive product.
#### 7. TreeSet for Sorted Names
•	Store a list of names in a TreeSet<String> and demonstrate:
o	Automatic sorting.
o	Case sensitivity.
o	Using a custom comparator to sort names in reverse order.
#### 8. LinkedHashSet Order Preservation
•	Add elements to a LinkedHashSet<String> in a specific order.
o	Verify that order is maintained when iterating.
#### 9. ArrayList vs. LinkedList Performance Test
•	Compare the time taken for:
o	Insertions at the end.
o	Insertions at the beginning.
o	Random access by index.
o	Use System.nanoTime() for benchmarking.
#### 10. Removing Duplicates from an ArrayList
•	Given an ArrayList<Integer> with duplicate values, remove duplicates while preserving order.
o	Solve using a LinkedHashSet<Integer>.
#### 11. Sorting an ArrayList of Objects
•	Create a Product class with name and price.
o	Add multiple Product objects to an ArrayList<Product>.
o	Sort by price using Collections.sort() and a Comparator<Product>.
#### 12. Merging Two Lists Without Duplicates
•	Given two ArrayList<String> instances, merge them into one while avoiding duplicates.
#### 13. Reverse an ArrayList
•	Write a method that reverses an ArrayList<Integer> without using built-in reverse methods.
#### 14. Most Frequent Element in an ArrayList
•	Given an ArrayList<Integer>, find the most frequently occurring element using a HashMap<Integer, Integer>.
#### 15. Comparing HashSet and TreeSet Performance
•	Compare the performance of HashSet and TreeSet for:
o	Insertions of 100,000 integers.
o	Contains-check operation.
o	Removal operation.

More Involved Exercises (40–50 min each)

#### 16. Contact Book Using HashMap
•	Implement a contact book with the following features:
o	Add contacts (name -> phone number).
o	Search for a contact by name.
o	List all contacts in alphabetical order.
o	Allow multiple numbers for a contact (e.g., HashMap<String, Set<String>>).
#### 17. LRU Cache Implementation Using LinkedHashMap
•	Implement a Least Recently Used (LRU) Cache using a LinkedHashMap with a fixed capacity.
o	When capacity is exceeded, remove the oldest entry.
o	Implement get(key) and put(key, value).
#### 18. Product Inventory System (HashMap, TreeSet, ArrayList)
•	Implement a simple inventory system where:
o	Products are stored in a HashMap<Integer, Product> (id -> Product).
o	Products can be listed in ascending price order using a TreeSet<Product>.
o	Allow searching by name and ID.


## ChatGpt Solution Analysis
See Resources

## Resources
- [ChatGpt analysis - exercises 16-18.docx](resources/ChatGpt%20analysis%20-%20exercises%2016-18.docx)