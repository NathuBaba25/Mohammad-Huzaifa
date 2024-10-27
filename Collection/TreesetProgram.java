package Collection;

import java.util.TreeSet;

public class TreesetProgram {

        public static void main(String[] args) {// Creating a TreeSet
            TreeSet<Integer> treeSet = new TreeSet<>();
            // Adding elements to the TreeSet
            treeSet.add(10);
            treeSet.add(5);
            treeSet.add(15);
            treeSet.add(20);
            treeSet.add(1);
            // Displaying the elements of the TreeSet
            System.out.println("TreeSet: " + treeSet);

            // Checking if the TreeSet contains a specific element
            System.out.println("Contains 10? " + treeSet.contains(10));
            System.out.println("Contains 7? " + treeSet.contains(7));

            // Getting the first and last elements
            System.out.println("First element: " + treeSet.first());
            System.out.println("Last element: " + treeSet.last());

            // Removing an element from the TreeSet
            treeSet.remove(10);
            System.out.println("After removing 10: " + treeSet);

            // Getting the subset of elements less than a given value
            TreeSet<Integer> headSet = (TreeSet<Integer>) treeSet.headSet(15);
            System.out.println("HeadSet (< 15): " + headSet);

            // Getting the subset of elements greater than or equal to a given value
            TreeSet<Integer> tailSet = (TreeSet<Integer>) treeSet.tailSet(5);
            System.out.println("TailSet (>= 5): " + tailSet);

            // Getting the subset of elements between two values
            TreeSet<Integer> subSet = (TreeSet<Integer>) treeSet.subSet(5, 20);
            System.out.println("SubSet (5 to 20): " + subSet);

            // Polling (retrieving and removing) the first and last elements
            System.out.println("Poll First: " + treeSet.pollFirst());
            System.out.println("Poll Last: " + treeSet.pollLast());
            System.out.println("TreeSet after polling: " + treeSet);
            // Clearing all elements from the TreeSet
            treeSet.clear();
            System.out.println("After clearing: " + treeSet);
        }
    }


