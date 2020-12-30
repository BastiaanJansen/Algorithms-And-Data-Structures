package DataStructures.Queues;

/**
 * In computer science, a queue is a collection of entities that are maintained in a sequence
 * and can be modified by the addition of entities at one end of the sequence and the removal
 * of entities from the other end of the sequence. By convention, the end of the sequence at which elements
 * are added is called the back, tail, or rear of the queue, and the end at which elements are removed
 * is called the head or front of the queue, analogously to the words used when people line up to wait for goods or services.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Queue_(abstract_data_type)">Queue Wikipedia</a>
 *
 * @author Bastiaan Jansen
 * @param <T>
 */
public interface Queue<T> {
    void enqueue(T value);
    T dequeue();
    T front();
    boolean isEmpty();
    int size();
}
