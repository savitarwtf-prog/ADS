package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTING PHYSICAL STRUCTURES ===");
        testArrayList();
        System.out.println("\n---------------------------\n");
        testLinkedList();

        System.out.println("\n=== TESTING LOGICAL STRUCTURES ===");
        testStack();
        System.out.println("\n---------------------------\n");
        testQueue();
        System.out.println("\n---------------------------\n");
        testMinHeap();
    }

    public static void testArrayList() {
        System.out.println("Testing MyArrayList:");
        MyList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15); // Вставка 15 на индекс 1

        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.sort();
        System.out.print("Sorted ArrayList: ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void testLinkedList() {
        System.out.println("Testing MyLinkedList:");
        MyList<String> list = new MyLinkedList<>();
        list.addLast("Middle");
        list.addFirst("Start");
        list.addLast("End");

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.removeFirst();
        System.out.println("After removeFirst, new First: " + list.getFirst());
        System.out.println("Size: " + list.size());
    }

    public static void testStack() {
        System.out.println("Testing MyStack (LIFO):");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("New top: " + stack.peek());
    }

    public static void testQueue() {
        System.out.println("Testing MyQueue (FIFO):");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("Patient 1");
        queue.enqueue("Patient 2");
        queue.enqueue("Patient 3");

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Next in line: " + queue.peek());
    }

    public static void testMinHeap() {
        System.out.println("Testing MyMinHeap (Priority):");
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        // Добавляем элементы в случайном порядке
        heap.insert(50);
        heap.insert(10);
        heap.insert(40);
        heap.insert(5);

        // Извлекаем — должен всегда выходить самый маленький элемент
        System.out.println("Smallest (extracted): " + heap.extractMin()); // Должно быть 5
        System.out.println("Next smallest: " + heap.extractMin()); // Должно быть 10
    }
}