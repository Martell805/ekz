package bilet22;

public class SortAlgorithm {
    public interface Comparator {
        int compare(Object o1, Object o2);
    }

    public static void sort(Object[] array, Comparator comp) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (comp.compare(array[j], array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Object temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}