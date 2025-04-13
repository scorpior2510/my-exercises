package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static void ex1Test() {
        System.out.println("\n----ex1: Basic HashSet Operations");
        Set<Integer> set = new HashSet<>();

        System.out.println();
        System.out.println("Adding Elements");
        for (int i = 0; i < 10; i++) {
            int currNum = (int) (Math.random() * 10) + 1;
            System.out.println("Trying to add: " + currNum + ", Succeeded? " + (set.add(currNum) ? "Yes" : "No (Already Exists)"));
        }
        System.out.println("Current set elements:");
        System.out.println(set);

        System.out.println();
        System.out.println("Trying to remove 5: " + (set.remove(5) ? "Success" : "Does Not Exists in the set"));

        System.out.println();
        System.out.println("Iteration and printing of elements:");
        set.forEach(System.out::println);
    }

    private static int ex1UniqueWordsCount(String sentence) {
        String[] wordsArray = sentence.toLowerCase().replaceAll("\\W+", " ").split(" ");
        Set<String> uniqueWords = new HashSet<>(Arrays.stream(wordsArray).toList());
        return uniqueWords.size();
    }

    private static void ex2Test() {
        System.out.println("\n----ex2: Unique Words Counter");

        System.out.println();
        String sentence1 = "every day is a new beginning";
        String sentence2 = "do not be right, be smarter";
        System.out.println("Sentence: " + sentence1);
        System.out.println("Number of unique words: " + ex1UniqueWordsCount(sentence1));
        System.out.println("Sentence: " + sentence2);
        System.out.println("Number of unique words: " + ex1UniqueWordsCount(sentence2));
    }

    private static void ex3Test() {
        System.out.println("\n----ex3: Custom Object in HashSet");

        System.out.println();
        Person p1 = new Person("abc", 12);
        Person p2 = new Person("abc", 12);
        Person p3 = new Person("abcd", 30);

        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }

    private static void ex4Test() {
        System.out.println("\n----ex4: HashMap Basics");

        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("a", 70);
        studentScores.put("b", 75);
        studentScores.put("c", 80);
        studentScores.put("d", 90);
        studentScores.put("e", 95);
        System.out.println(studentScores);

        studentScores.put("a", 100);
        System.out.println(studentScores);

        System.out.println("Student a exists? " + studentScores.containsKey("a"));
        System.out.println("Student f exists? " + studentScores.containsKey("f"));

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry);
        }

    }

    private static void ex5Test() {
        System.out.println("\n----ex5: Word Frequency Counter");

        String sentence = "banana apple comfort table table apple juice table";
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer stringTokenizer = new StringTokenizer(sentence, " ");
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            map.put(token, map.getOrDefault(token, 0) + 1);
        }
        System.out.println(map);
    }

    private static void ex6Test() {
        System.out.println("\n----ex6: Iterating Over a HashMap");

        Map<String, Double> map = new HashMap<>();
        map.put("productA", 35.0);
        map.put("productB", 12.5);
        map.put("productC", 8.0);
        map.put("productD", 30.0);

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("\n Max & Min Entries:");
        System.out.println(map.entrySet().stream().max(Comparator.comparingDouble(Map.Entry::getValue)).get());
        System.out.println(map.entrySet().stream().min(Comparator.comparingDouble(Map.Entry::getValue)).get());
    }

    private static void ex7Test() {
        System.out.println("\n----ex7: TreeSet for Sorted Names");

        Set<String> set = new TreeSet<>();
        set.add("abc");
        set.add("bcd");
        set.add("cde");
        set.add("aa");
        set.add("Bcd");
        set.add("Aa");
        System.out.println(set);

        Set<String> setCustomComparator = new TreeSet<>(Comparator.reverseOrder());
        setCustomComparator.add("abc");
        setCustomComparator.add("bcd");
        setCustomComparator.add("cde");
        System.out.println(setCustomComparator);

    }

    private static void ex8Test() {
        System.out.println("\n----ex8: LinkedHashSet Order Preservation");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("c");
        linkedHashSet.add("b");
        System.out.println(linkedHashSet);

    }

    private static void ex9Test() {
        System.out.println("\n----ex9: ArrayList vs. LinkedList Performance Test");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 1; i < 2000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        System.out.println("--Start Status:");
        System.out.println("arrayList: " + arrayList);
        System.out.println("linkedList: " + linkedList);
        System.out.println("--");

        System.out.println("--Adding element in the end");
        long timeBefore1 = System.nanoTime();
        arrayList.add(2500);
        long timeAfter1 = System.nanoTime();
        long delta1 = timeAfter1 - timeBefore1;
        System.out.println("Time Duration for adding element to arrayList in the end: " + delta1);

        long timeBefore2 = System.nanoTime();
        linkedList.add(2500);
        long timeAfter2 = System.nanoTime();
        long delta2 = timeAfter2 - timeBefore2;
        System.out.println("Time Duration for adding element to linkedList in the end: " + delta2);

        System.out.println((delta1 < delta2) ?
                "Operation on arrayList took less time by " + (delta2 - delta1) :
                "Operation on linkedList took less time by " + (delta1 - delta2));
        System.out.println("--");

        System.out.println("--Adding element in the beginning");
        timeBefore1 = System.nanoTime();
        arrayList.add(0, 3000);
        timeAfter1 = System.nanoTime();
        delta1 = timeAfter1 - timeBefore1;
        System.out.println("Time Duration for adding element to arrayList in the beginning: " + delta1);

        timeBefore2 = System.nanoTime();
        linkedList.add(0, 3000);
        timeAfter2 = System.nanoTime();
        delta2 = timeAfter2 - timeBefore2;
        System.out.println("Time Duration for adding element to linkedList in the beginning: " + delta2);

        System.out.println((delta1 < delta2) ?
                "Operation on arrayList took less time by " + (delta2 - delta1) :
                "Operation on linkedList took less time by " + (delta1 - delta2));
        System.out.println("--");

        System.out.println("--Adding element in the middle");
        timeBefore1 = System.nanoTime();
        arrayList.add(1200, 3500);
        timeAfter1 = System.nanoTime();
        delta1 = timeAfter1 - timeBefore1;
        System.out.println("Time Duration for adding element to arrayList in the middle: " + delta1);

        timeBefore2 = System.nanoTime();
        linkedList.add(1200, 3500);
        timeAfter2 = System.nanoTime();
        delta2 = timeAfter2 - timeBefore2;
        System.out.println("Time Duration for adding element to linkedList in the middle: " + delta2);

        System.out.println((delta1 < delta2) ?
                "Operation on arrayList took less time by " + (delta2 - delta1) :
                "Operation on linkedList took less time by " + (delta1 - delta2));
        System.out.println("--");

        System.out.println("--End Status:");
        System.out.println("arrayList: " + arrayList);
        System.out.println("linkedList: " + linkedList);
        System.out.println("--");
    }

    private static void ex10Test() {
        System.out.println("\n----ex10: Removing Duplicates from an ArrayList");

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("b");
        list.add("a");
        list.add("d");
        System.out.println("Original List: " + list);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(list);
        List<String> listNew = new ArrayList<>(linkedHashSet);
        System.out.println("New List: " + listNew);

    }

    private static void ex11Test() {
        System.out.println("\n----ex11: Sorting an ArrayList of Objects");

        Product p1 = new Product("aaa", 15);
        Product p2 = new Product("bbb", 100);
        Product p3 = new Product("ccc", 125);
        Product p4 = new Product("ddd", 7);
        Product p5 = new Product("eee", 11);
        Product p6 = new Product("fff", 28);
        Product p7 = new Product("ggg", 12.5);
        Product p8 = new Product("hhh", 24.3);

        List<Product> list = new ArrayList<>();
        list.addAll(List.of(p1, p2, p3, p4, p5, p6, p7, p8));
        System.out.println(list);

        Collections.sort(list, Comparator.comparingDouble(Product::getPrice));
        System.out.println(list);


    }

    private static void ex12Test() {
        System.out.println("\n----ex12: Merging Two Lists Without Duplicates");

        List<String> list1 = new ArrayList<>(Arrays.asList("aa", "bb", "cc", "dd", "aa"));
        List<String> list2 = new ArrayList<>(Arrays.asList("bb", "ee", "ff", "ff", "gg"));

        list2.removeAll(list1);
        list1.addAll(list2);

        System.out.println(list1);
    }

    private static void ex13Test() {
        System.out.println("\n----ex13: Reverse an ArrayList");

        List<String> list1 = new ArrayList<>(Arrays.asList("aaaaa", "bb", "cc", "dd", "aa"));
        System.out.println(list1);

        for (int i = 0; i < list1.size() / 2; i++) {
            String temp = list1.get(i);
            list1.set(i, list1.get(list1.size() - i - 1));
            list1.set(list1.size() - i - 1, temp);
        }

        System.out.println(list1);
    }

    private static void ex14Test() {
        System.out.println("\n----ex14: Most Frequent Element in an ArrayList");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 1, 1, 3, 4, 4, 4, 4));
        System.out.println(list);

        Map<Integer, Integer> map = new HashMap<>();
        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            int curr = listIterator.next();
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        System.out.println(map);
    }

    private static void ex15Test() {
        System.out.println("\n----ex15: Comparing HashSet and TreeSet Performance");

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        System.out.println("\n--Insertion");

        long timeBefore1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            hashSet.add((int) (Math.random() * 20) * i);
        }
        long timeAfter1 = System.nanoTime();
        long delta1 = timeAfter1 - timeBefore1;

        long timeBefore2 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            treeSet.add((int) (Math.random() * 20) * i);
        }
        long timeAfter2 = System.nanoTime();
        long delta2 = timeAfter2 - timeBefore2;

        System.out.println("Inserting time for hashSet: " + delta1);
        System.out.println("Inserting time for treeSet: " + delta2);
        System.out.println((delta1 < delta2) ?
                "hashSet is faster by " + (delta2 - delta1) :
                "treeSet is faster by " + (delta1 - delta2));

        System.out.println("\n--Contains");

        timeBefore1 = System.nanoTime();
        hashSet.contains(5000);
        timeAfter1 = System.nanoTime();
        delta1 = timeAfter1 - timeBefore1;

        timeBefore2 = System.nanoTime();
        treeSet.contains(5000);
        timeAfter2 = System.nanoTime();
        delta2 = timeAfter2 - timeBefore2;

        System.out.println("contains time for hashSet: " + delta1);
        System.out.println("contains time for treeSet: " + delta2);
        System.out.println((delta1 < delta2) ?
                "hashSet is faster by " + (delta2 - delta1) :
                "treeSet is faster by " + (delta1 - delta2));

        System.out.println("\n--Remove");

        timeBefore1 = System.nanoTime();
        hashSet.remove(5000);
        timeAfter1 = System.nanoTime();
        delta1 = timeAfter1 - timeBefore1;

        timeBefore2 = System.nanoTime();
        treeSet.remove(5000);
        timeAfter2 = System.nanoTime();
        delta2 = timeAfter2 - timeBefore2;

        System.out.println("remove time for hashSet: " + delta1);
        System.out.println("remove time for treeSet: " + delta2);
        System.out.println((delta1 < delta2) ?
                "hashSet is faster by " + (delta2 - delta1) :
                "treeSet is faster by " + (delta1 - delta2));

    }

    private static void ex16Test() {
        System.out.println("\n----ex16: Contact Book Using HashMap");

        ContactBook contactBook = new ContactBook();
        contactBook.addContact("ghi", "123456789");
        contactBook.addContact("abc", "1234567");
        contactBook.addContact("jkl", "1234567");
        contactBook.addContact("abc", "12345678");
        contactBook.addContact("def", "12345678");
        contactBook.addContact("ghi", "12345678");
        contactBook.addContact("ghi", "123456789");
        contactBook.addContact("a", "123456789");
        contactBook.addContact("aa", "123456789");
        contactBook.addContact("bb", "123456789");
        contactBook.addContact("b", "123456789");

        System.out.println(contactBook);
        System.out.println();
        System.out.println("Phone Numbers for abc: " + contactBook.findByName("abc"));
        System.out.println("Phone Numbers for aaa: " + contactBook.findByName("aaa"));
        System.out.println();

        Map<String, Set<String>> contactsOrdered = contactBook.getContactsOrdered();
        for (Map.Entry<String, Set<String>> entry : contactsOrdered.entrySet()) {
            System.out.println(entry);
        }

    }

    private static void ex17Test() {
        System.out.println("\n----ex17: LRU Cache Implementation Using LinkedHashMap");

        LRUCache lruCache = new LRUCache(5);
        System.out.println(lruCache);
        lruCache.put(1, 10);
        lruCache.put(2, 20);
        lruCache.put(3, 30);
        lruCache.put(4, 40);
        lruCache.put(5, 50);
        lruCache.put(6, 60);
        lruCache.get(2);
        lruCache.put(7, 70);
        System.out.println(lruCache);
    }

    private static void ex18Test() {

        System.out.println("\n----ex19: Product Inventory System (HashMap, TreeSet, ArrayList)");

        ProductInventorySystem inventorySystem = new ProductInventorySystem();
        System.out.println(inventorySystem);

        ProductNew product1 = new ProductNew(1, "aaa", 15);
        ProductNew product2 = new ProductNew(2, "bbb", 10);
        ProductNew product3 = new ProductNew(3, "ccc", 50);
        ProductNew product4 = new ProductNew(4, "ddd", 7);
        ProductNew product5 = new ProductNew(5, "eee", 12);
        ProductNew product6 = new ProductNew(6, "fff", 40);
        ProductNew product7 = new ProductNew(7, "ggg", 30);
        ProductNew product8 = new ProductNew(7, "ggg", 30);

        inventorySystem.addAllToInventory(product1, product2, product3, product4, product5, product6, product7);
        System.out.println(inventorySystem);

        System.out.println("Retrieving product id 4: " + inventorySystem.findById(4));
        System.out.println("Retrieving product id 12: " + inventorySystem.findById(12));

        System.out.println("Retrieving product aaa: " + inventorySystem.findByName("aaa"));
        System.out.println("Retrieving product rrr: " + inventorySystem.findByName("rrr"));

        inventorySystem.removeFromInventory(product1);
        System.out.println(inventorySystem);

        inventorySystem.showInventoryListOrderedByPrice();
    }


    public static void main(String[] args) {
        ex18Test();
    }
}