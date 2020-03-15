package definition;
import adt.queueAdt;

public class queueDefinition<E> implements queueAdt<E> {

    private Node<E> front;
    private Node<E> rear;
    private int size;

    @Override
    public boolean add(E item) {

        if (front == null) {
            rear = new Node<>(item);
            front = rear;
        }

        else {
            rear.next = new Node<>(item);
            rear = rear.next;
        }
        size++;
        return true;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    private class Node<E> {
        private E data;
        private Node<E> next;

        private Node (E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private Node (E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
