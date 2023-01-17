package bilet22;

import java.util.List;

public interface Sorting<T extends Comparable<T>> {
    List<T> sort(List<T> array);
}
