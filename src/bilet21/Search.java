package bilet21;

import java.util.List;

public interface Search<T extends Comparable<T>> {
    List<T> search(List<T> array);
}
