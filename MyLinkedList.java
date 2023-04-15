import java.util.Iterator;
public class MyLinkedList<T> implements MyList<T>, Iterable<T>{
    private class MyNode {
        private final T data;
        private MyNode next;

        public MyNode(T data) {
            this.data = data;
        }
    }
    private MyNode head; // entry point
    private int length;

    @Override
    public int size() {
        return length;

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void add(T item) {

    }

    @Override
    public void add(T item, int index) {

    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
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
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        MyNode cursor = head;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            T data = cursor.data;
            cursor = cursor.next;
            return data;
        }
    }
}
