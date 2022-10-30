package com.hypercherry.demo;


public class LinkedList<E> {
    private final Node<E> head = new Node<>(null);
    private int size = 0;

    public static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    public void add(E element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("添加位置不合法,位置范围为0~" + (size));
        }
        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node<E> node = new Node<>(element);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("删除位置非法,正确的位置:0~" + (size - 1));
        }
        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        E e = prev.next.element;
        prev.next = prev.next.next;
        size--;
        return e;
    }

    public E get(int index) {
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("获取位置不合法,合法的获取位置为:0~"+(size-1));
        }
        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        return prev.next.element;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<E> node = head.next;
        while (node != null) {
            stringBuilder.append(node.element).append(" ");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
