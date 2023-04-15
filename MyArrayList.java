public class MyArrayList<T> implements MyList<T>{
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
        if (index > length) throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        for (int i = index; i < length - 1; i++) {
            hiddenArr[i] = hiddenArr[i + 1];
        }
        hiddenArr[--length] = null;

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
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
