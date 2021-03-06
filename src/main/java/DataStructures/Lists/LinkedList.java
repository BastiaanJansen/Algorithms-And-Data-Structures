package DataStructures.Lists;

/**
 * @author Bastiaan Jansen
 * @see List
 * @param <T>
 */
public interface LinkedList<T> extends List<T> {
    void addFirst(T element);
    void addLast(T element);
    T getFirst();
    T getLast();
    T removeFirst();
    T removeLast();

    interface Node<T> {
        Node<T> getLast();
        boolean contains(T element);
        int size(int n);
        int find(T element);
        boolean hasNext();
    }
}
