import java.util.Comparator;

public class MyArrayList<T> implements MyList<T>{
    private int capacity; // Capacity of the hiddenArr
    private Object[] hiddenArr; // Array to store the elements
    private int length; // Number of elements currently stored in the hiddenArr

    // Default constructor with initial capacity of 5
    public MyArrayList() {
        this(5);
    }

    // Constructor with specified initial capacity
    public MyArrayList(int initialCapacity) {
        hiddenArr = new Object[initialCapacity];
    }

    // Helper method to increase the capacity of hiddenArr
    private void increaseCapacity() {
        int newSize = (int)(hiddenArr.length * 1.5); // Increase capacity by 50%
        Object[] newArr = new Object[newSize];

        // Copy elements from hiddenArr to newArr
        for (int i = 0; i < hiddenArr.length; i++) {
            newArr[i] = hiddenArr[i];
        }

        hiddenArr = newArr; // Update hiddenArr to the new array with increased capacity
    }

    @Override
    public int size() {
        return length; // Returns the number of elements in the list
    }

    @Override
    public boolean contains(Object o) {
        // Iterates through the list to check if it contains the specified element
        for (int i = 0; i < length; i++){
            if (hiddenArr[i].equals(o)) return true; // If element found, return true
        }
        return false; // If element not found, return false
    }

    @Override
    public void add(T item) {
        if (length == hiddenArr.length) {
            increaseCapacity(); // If hiddenArr is full, increase its capacity
        }

        hiddenArr[length++] = item; // Add the item to the end of the list and increment length
    }

    @Override
    public void add(T item, int index) {
        if (index < 0 || index >= length) throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        if (length == hiddenArr.length) {
            increaseCapacity(); // If hiddenArr is full, increase its capacity
        }

        // Shift elements to the right from index to end of the list
        for (int i = length; i > index; i--) {
            hiddenArr[i] = hiddenArr[i-1];
        }

        hiddenArr[index] = item; // Insert the item at the specified index
        length++; // Increment length
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= length) throw new IndexOutOfBoundsException("Index out of bounds: " + index);

        T removed = (T) hiddenArr[index]; // Store the removed element
        // Shift elements to the left from index+1 to end of the list
        for (int i = index; i < length - 1; i++) {
            hiddenArr[i] = hiddenArr[i + 1];
        }

        length--; // Decrement length
        return removed; // Return the removed element
    }


    @Override
    public boolean remove(T item) {
        // Iterates through the list to find the specified element and remove it
        for (int i = 0; i < length; i++) {
            if (hiddenArr[i].equals(item)) {
                remove(i); // If element found, remove it using the remove(int index) method
                return true; // Return true to indicate successful removal
            }
        }
        return false; // If element not found, return false
    }


        @Override
    public void clear() {
        hiddenArr = new Object[5]; // Create a new array with initial capacity of 5
        length = 0; // Reset the length to 0
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= length) throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        return (T) hiddenArr[index]; // Return of value with provided index
    }

    @Override
    public int indexOf(Object o) {
        // Iterates through the list to find the specified element and return its index
        for (int i = 0; i<length; i++) {
            if (hiddenArr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public int lastIndexOf(Object o) {
        // Iterates through the list from the end to find the specified element and return its index
        for (int i = length-1; i>=0; i--) {
            if (hiddenArr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

}
