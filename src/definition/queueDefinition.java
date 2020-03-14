package definition;
import adt.queueAdt;

public class queueDefinition<E> implements queueAdt<E> {
    @Override
    public boolean add(E item) {
        return false;
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
