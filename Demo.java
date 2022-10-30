package com.hypercherry.demo;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10, i);
        }
//        System.out.println(list.remove(1114514));
        System.out.println(list);
        System.out.println("被删除的元素:" + list.remove(1));
        System.out.println(list);
        System.out.println("获取到的元素为:"+list.get(3));
    }
}