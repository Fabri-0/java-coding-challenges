package interfaces;

public interface InPlaceSort <T extends Comparable<T>>{
        void sort(final T[] elements);
}
