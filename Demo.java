package com.hypercherry.demo;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10, i);
        }
        System.out.println(list.remove(1114514));
        System.out.println(list);
    }
}