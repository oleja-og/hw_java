package oop_lesson3.Mylist;


public class Main {
    public static void main(String[] args) {
        

        GBLinkedList<Number> gbLL = new GBLinkedList<>();
        System.out.println(gbLL);
        gbLL.addFirst(5);
        System.out.println(gbLL);
        gbLL.addFirst(2);
        gbLL.addFirst(6);
        gbLL.addLast(8);
        System.out.println(gbLL);
        System.out.println(gbLL.size());
        System.out.println(gbLL.get(3));
    }
}
