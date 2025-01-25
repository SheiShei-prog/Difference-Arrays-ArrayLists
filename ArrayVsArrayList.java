import java.util.ArrayList;

public class ArrayVsArrayList {

    public static void main(String[] args) {
        // Creating an array of integers
        int[] intArray = new int[5]; // Fixed size
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        // Creating an ArrayList of integers
        ArrayList<Integer> intArrayList = new ArrayList<>(); // Dynamic size
        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(30);
        intArrayList.add(40);
        intArrayList.add(50);

        // Displaying array elements
        System.out.println("Array elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        // Displaying ArrayList elements
        System.out.println("\nArrayList elements:");
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + intArrayList.get(i));
        }

        // Demonstrating resizing
        // Arrays cannot be resized. To add more elements, a new array must be created.
        // intArray[5] = 60; // This will cause an ArrayIndexOutOfBoundsException

        // ArrayLists can dynamically resize. No need to create a new list.
        intArrayList.add(60);
        System.out.println("\nArrayList after adding an element:");
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + intArrayList.get(i));
        }

        // Demonstrating type flexibility
        // Arrays hold elements of a single type
        String[] stringArray = new String[2];
        stringArray[0] = "Hello";
        stringArray[1] = "World";

        // ArrayLists can also hold elements of a single type, but this type can be a class
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hello");
        stringArrayList.add("World");

        // Displaying string array elements
        System.out.println("\nString Array elements:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Element at index " + i + ": " + stringArray[i]);
        }

        // Displaying string ArrayList elements
        System.out.println("\nString ArrayList elements:");
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + stringArrayList.get(i));
        }
    }
}
