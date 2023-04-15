public class MyArrayList implements MyList{
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
}
