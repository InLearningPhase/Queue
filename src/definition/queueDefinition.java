package definition;
import adt.queueAdt;

import java.util.NoSuchElementException;

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

        if (front == null) {

            return null;
        }
        else {

            E temp = front.getData();
            front = front.next;
            size--;
            return temp;
        }
    }

    @Override
    public E remove() {

        if (front == null) {

            throw new NoSuchElementException("Queue is Empty!");
        }
        else {
            E temp = front.getData();
            front = front.next;
            size--;
            return temp;
        }
    }

    @Override
    public E peek() {

        if (front == null) {
            return null;
        }
        else {
            return front.getData();
        }
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("*");
        Node<E> temp = front;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.getData());
            stringBuilder.append(i < size - 1 ? "-->" : "");
            temp = temp.getNext();
        }
        return stringBuilder.toString();
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
