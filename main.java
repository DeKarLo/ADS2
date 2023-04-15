import java.util.Comparator;

public class main {
    public static void main(String[] args){

        MyArrayList<Integer> myList = new MyArrayList<Integer>();
        // Add elements to the list
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);

        System.out.println("Initial List: " + myList.toString()); // Print the initial list

        // Test size() method
        System.out.println("Size of the list: " + myList.size());

        // Test contains() method
        System.out.println("Contains 30? " + myList.contains(30));
        System.out.println("Contains 60? " + myList.contains(60));

        // Test add() method
        myList.add(60);
        System.out.println("List after adding 60: " + myList.toString());

        // Test add(index) method
        myList.add(70, 3);
        System.out.println("List after adding 70 at index 3: " + myList.toString());

        // Test remove(index) method
        System.out.println("Removed element at index 1: " + myList.remove(1));
        System.out.println("List after removing element at index 1: " + myList.toString());

        // Test remove(item) method
        System.out.println("Removed element 40? " + myList.remove(Integer.valueOf(40)));
        System.out.println("List after removing element 40: " + myList.toString());

        // Test indexOf(object) and lastIndexOf(object)
        System.out.println("Index of element 70: " + myList.indexOf(70));
        myList.add(70);
        System.out.println("List after adding 70: " + myList.toString());
        System.out.println("LastIndex of element 70: " + myList.lastIndexOf(70));

        // Test clear() method
        myList.clear();
        System.out.println("List after clearing: " + myList.toString());


    }
}
