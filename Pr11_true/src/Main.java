public class Main {
    public static void main(String[] args) {
        ArrayQueue <Integer> q1 = new ArrayQueue<>(10);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        System.out.println(q1.element());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());

        ArrayQueueModule q2 = new ArrayQueueModule(10);
        q2.enqueue("a");
        q2.enqueue("b");
        q2.enqueue("c");
        System.out.println(q2.element());
        System.out.println(q2.dequeue());
        System.out.println(q2.dequeue());

        ArrayQueueADT q3 = new ArrayQueueADT(10);
        ArrayQueueADT.enqueue("aaa", q3);
        ArrayQueueADT.enqueue("bbb", q3);
        ArrayQueueADT.enqueue("ccc", q3);
        System.out.println(ArrayQueueADT.element(q3));
        System.out.println(ArrayQueueADT.dequeue(q3));
        System.out.println(ArrayQueueADT.dequeue(q3));
    }
}