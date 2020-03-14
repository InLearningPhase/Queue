package adt;

public interface queueAdt<E> {

    boolean add(E item);

    E poll();

    E remove();

    E peek();

    E element();
}
