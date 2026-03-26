package interfaces;

import java.util.List;

public interface ListSort <T extends Comparable<T>>{
     List<T> sort(List<T> elements);
}
