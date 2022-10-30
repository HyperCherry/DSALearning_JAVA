package com.hypercherry.demo;

public class ArrayList<E> {
    int capacity = 10;
    int size = 0;
    private Object[] array = new Object[capacity];

    public void add(E element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("插入位置不和法,合法的插入位置0~" + size);
        }
        //扩容方法
        if (size >= capacity) {
            int newCapacity = capacity >> 1;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("删除元素的位置不合法,合法的位置为0~" + (size - 1));
        }
        E e = (E) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return e;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) stringBuilder.append(array[i]).append(" ");
        return stringBuilder.toString();
    }
}
