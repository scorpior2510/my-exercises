import java.util.*;

public class Main {
    private static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + "\t");
        }
    }

    private static void ex1() {

        /* Ex1:
            Modify Elements in a List:
            a. Write a for loop that iterates over a List<Integer> and multiplies each element by 3.
            b. Then, attempt to do the same with the for-each loop and explain why it fails.
            c. Finally, write a solution using an Iterator to handle modifications.
         */

        // a
        System.out.println("(a) ordinary loop works:");
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("Ordinary Loop - List Before:");
        printList(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 3);
        }
        System.out.println("\nOrdinary Loop - List After:");
        printList(list);


        // b - does not work because works elements copies
        System.out.println();
        System.out.println("\n(b) - for-each loop does not work:");
        list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("for-each Loop - List Before:");
        printList(list);
        for (Integer num : list) {
            num *= 3;
        }
        System.out.println("\nfor-each Loop - List After:");
        printList(list);

        // c - solution using iterator
        System.out.println();
        System.out.println("\n(c) - iterator loop works:");
        list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("Iterator Loop - List Before:");
        printList(list);
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            iterator.set(element * 3);
        }
        System.out.println("\nIterator Loop - List After:");
        printList(list);

    }

    public static void ex2() {

        /* Ex2
        Concurrent Modification: Create a List<String> containing some duplicate values.
        Use the forEach loop to try to remove duplicates during the iteration and observe the exception.
        Then rewrite the solution using an Iterator to remove the duplicates safely.
         */
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6));
        System.out.println("Original List:");
        printList(list);
        list.forEach(num -> list.remove(num));

    }

    public static void ex3() {

        /* Ex3
        Filtering with Streams: Given a list of integers,
        write a solution that prints only the even numbers using both a traditional for loop and a forEach loop with Streams.
        Which method is more appropriate in this scenario and why?
         */

        System.out.println("Solution With traditional for loop:");
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        for (int i = 0; i < list.size(); i++) {
            int currElement = list.get(i);
            if (currElement % 2 == 0)
                System.out.print(currElement + "\t");
        }
        System.out.println();
        System.out.println("Solution With forEach loop:");
        list.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + "\t"));

        /* Since the list isn't changed or manipulated i would say that the second solution is better.
        Shorter, more concise and more readable
         */

        /*
            ChatGpt:
            Your solution is correct, both in terms of functionality and your conclusion in the comments. Here’s a breakdown of why this is accurate:

            Solution Review
            Traditional For Loop Solution:

            You correctly use a for loop to iterate over each element in the list.
            The if condition checks for even numbers, and you print them as expected.
            forEach with Stream:

            You use stream() to create a stream from the list.
            filter(num -> num % 2 == 0) filters for even numbers, and forEach(num -> System.out.print(num + "\t")) prints each even number.
            This solution is shorter, more concise, and easy to read.
            Analysis of Appropriateness
            Since this exercise is focused on filtering and printing (without modifying the list), the Stream-based solution is indeed more suitable. Here’s why:

            Conciseness: The Stream-based approach is more compact, expressing filtering and printing in a single line.
            Readability: Streams make the intent (filtering and printing even numbers) immediately clear.
            Functionality: Both approaches give the same output without modifying the original list.
            In cases where the primary goal is to filter and output data without modifying the collection, the Stream-based solution is often preferred due to its clarity and reduced verbosity.

            Conclusion
            Your comment is spot-on: the Stream-based approach is better here because it is shorter, more concise, and more readable than the traditional for loop for this specific scenario. Great job!
         */

    }

    public static void main(String[] args) {

        //        ex1();
        //        ex2();
        ex3();


    }
}