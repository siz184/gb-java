package sem_03_cw;

import java.util.Collection;
import java.util.Iterator;

public class OwnLinkedList<E> implements Iterable<E> {

    private Node<E> fElement = null;
    private Node<E> lElement = null;
    private int size = 0;

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;
            public boolean hasNext() {
                return index < size;
            }
            public E next() {
                return get(index++);
            }
        };
    }

    private class Node<E> {

        private final E element;
        private Node<E> next = null;
        private Node<E> prev = null;

        public Node(E element) {
            this.element = element;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public void add(int index, E nElement) {

            Node<E> thisNode = new Node<>(nElement);
            if (size == 0) {
                fElement = thisNode;
                lElement = thisNode;
            } else {
                if (index == 0) {
                    thisNode.setNext(fElement);
                    fElement.setPrev(thisNode);
                    fElement = thisNode;
                } else if (index >= size) {
                    thisNode.setPrev(lElement);
                    lElement.setNext(thisNode);
                    lElement = thisNode;
                } else {
                    thisNode.setNext(getNode(index));
                    thisNode.setPrev(thisNode.getNext().getPrev());
                    thisNode.getPrev().setNext(thisNode);
                    thisNode.getNext().setPrev(thisNode);
                }

            }
            size++;
    }
}