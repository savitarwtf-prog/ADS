package org.example;

public class Main {
    public static void main(String[] args) {
        testArrayList();
        System.out.println("---------------------------");
        testLinkedList();
    }

    public static void testArrayList() {
        System.out.println("Testing MyArrayList:");
        MyList<Integer> list = new MyArrayList<>();

        // Тестируем add и size
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Size after adding 3 elements: " + list.size());

        // Тестируем add(index) и get
        list.add(1, 15);
        System.out.println("Element at index 1: " + list.get(1)); // Должно быть 15

        // Тестируем remove
        list.remove(2);
        System.out.println("Size after removal: " + list.size());
        System.out.println("Element at index 2 now: " + list.get(2)); // Должно быть 30

        // Тестируем exists и indexOf
        System.out.println("Exists 15? " + list.exists(15));
        System.out.println("Index of 30: " + list.indexOf(30));

        // Тестируем sort
        list.add(5);
        list.sort();
        System.out.print("Sorted list: ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void testLinkedList() {
        System.out.println("Testing MyLinkedList:");
        MyList<String> list = new MyLinkedList<>();

        // Тестируем addFirst и addLast
        list.addLast("Middle");
        list.addFirst("Start");
        list.addLast("End");

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Тестируем removeFirst и removeLast
        list.removeFirst();
        System.out.println("New first after removeFirst: " + list.getFirst());

    }
}