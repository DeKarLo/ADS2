public class MyArrayList<T> implements MyList<T>{
    private int capacity;
    private Object[] hiddenArr;
    private int length;

    public MyArrayList() {
        this(5);
    }

    public MyArrayList(int initialCapacity) {
        hiddenArr = new Object[initialCapacity];
    }

    private void increaseCapacity() {
        int newSize = (int)(hiddenArr.length * 1.5);
        Object[] newArr = new Object[newSize];

        for (int i = 0; i < hiddenArr.length; i++) {
            newArr[i] = hiddenArr[i];
        }

        hiddenArr = newArr;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i<length; i++){
            if (hiddenArr[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public void add(T item) {
        if (length == hiddenArr.length) {
            increaseCapacity();
        }

        hiddenArr[length++] = item;
    }

    @Override
    public void add(T item, int index) {
        if (index < 0 || index >= length) throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        if (length == hiddenArr.length) {
            increaseCapacity();
        }
        for (int i = length; i > index; i--) {
            hiddenArr[i] = hiddenArr[i-1];
        }
        hiddenArr[index] = item;
        length++;

    }

    @Override
    public T remove(int index) {
        T removed = (T) hiddenArr[index];
        if (index < 0 || index >= length) throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        for (int i = index; i < length - 1; i++) {
            hiddenArr[i] = hiddenArr[i + 1];

        }
        length--;
        return removed;
    }


    @Override
    public boolean remove(T item) {
        for (int i = 0; i<length; i++) {
            if (hiddenArr[i].equals(item)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return (T) hiddenArr[index];
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}
