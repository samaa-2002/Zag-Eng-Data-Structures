public class dynamicArray {
    int[] array;
    int size = 0;
    int lastItem = 0;

    public dynamicArray() {
        array = new int[100];
        size = 100;
    }

    public dynamicArray(int n) {
        array = new int[n];
        size = n;

    }

    private void copyArray(int[] array, int[] newArray) {
        for (int i = 0; i < lastItem; i++) {
            newArray[i] = array[i];
        }
    }

    public void insert(int element) {
        if (lastItem == size) {
            size *= 2;
            int[] newArray = new int[size];
            copyArray(array, newArray);
            array = newArray;
        }
        array[lastItem] = element;
        lastItem++;

    }

    private boolean isValidIndex(int index) {
        return index >= 0 & index < lastItem;

    }

    public void removeAt(int index) {
        if (isValidIndex(index) == false)
            throw new IllegalStateException();
        for (int i = index; i < lastItem; i++)
            array[i] = array[i + 1];
        lastItem--;
    }

    public void printArray() {
        for (int i = 0; i < lastItem; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public int indexOf(int element) {
        for (int i = 0; i < lastItem; i++)
            if (array[i] == element)
                return i;
        return -1;
    }

    int element;

    public int at(int index) {
        if (isValidIndex(index))
            element = array[index];
        return element;
    }


    public void removeItem(int element) {
        if (indexOf(element) >= 0)
            for (int i = indexOf(element); i < lastItem; i++)
                array[i] = array[i + 1];
        lastItem--;
        printArray();
    }

    int min = Integer.MAX_VALUE;

    public int min() {
        for (int i = 0; i < lastItem; i++) {
            if (array[i] < min)
                min = array[i];

        }
        return min;
    }

    int max = 0;

    public int max() {
        for (int i = 0; i < lastItem; i++) {
            if (array[i] > max)
                max = array[i];

        }
        return max;
    }

}
