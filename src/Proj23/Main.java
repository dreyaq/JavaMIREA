package Proj23;

public class Main {
    public static void main(String[] args) {
        testArrayQueue();
        testArrayQueueADT();
        testArrayQueueModule();
    }

    public static void testArrayQueue() {
        ArrayQueue queue = new ArrayQueue();

        // Проверка enqueue и element
        queue.enqueue(1);
        System.out.println("ArrayQueue Element: " + queue.element());

        // Проверка dequeue
        int removed = (int) queue.dequeue();
        System.out.println("ArrayQueue Removed: " + removed);

        // Проверка size и isEmpty
        System.out.println("ArrayQueue Size: " + queue.size());
        System.out.println("ArrayQueue Is Empty: " + queue.isEmpty());

        // Проверка clear
        queue.enqueue(2);
        queue.enqueue(3);
        queue.clear();
        System.out.println("ArrayQueue Size after clear: " + queue.size());
    }

    public static void testArrayQueueADT() {
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.create(queue);

        // Проверка enqueue и element
        ArrayQueueADT.enqueue(queue, 1);
        System.out.println("ArrayQueueADT Element: " + ArrayQueueADT.element(queue));

        // Проверка dequeue
        int removed = (int) ArrayQueueADT.dequeue(queue);
        System.out.println("ArrayQueueADT Removed: " + removed);

        // Проверка size и isEmpty
        System.out.println("ArrayQueueADT Size: " + ArrayQueueADT.size(queue));
        System.out.println("ArrayQueueADT Is Empty: " + ArrayQueueADT.isEmpty(queue));

        // Проверка clear
        ArrayQueueADT.enqueue(queue, 2);
        ArrayQueueADT.enqueue(queue, 3);
        ArrayQueueADT.clear(queue);
        System.out.println("ArrayQueueADT Size after clear: " + ArrayQueueADT.size(queue));
    }

    public static void testArrayQueueModule() {
        ArrayQueueModule.create();

        // Проверка enqueue и element
        ArrayQueueModule.enqueue(1);
        System.out.println("ArrayQueueModule Element: " + ArrayQueueModule.element());

        // Проверка dequeue
        int removed = (int) ArrayQueueModule.dequeue();
        System.out.println("ArrayQueueModule Removed: " + removed);

        // Проверка size и isEmpty
        System.out.println("ArrayQueueModule Size: " + ArrayQueueModule.size());
        System.out.println("ArrayQueueModule Is Empty: " + ArrayQueueModule.isEmpty());

        // Проверка clear
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        ArrayQueueModule.clear();
        System.out.println("ArrayQueueModule Size after clear: " + ArrayQueueModule.size());
    }
}

class ArrayQueue {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public void enqueue(Object element) {
        if (element == null) {
            throw new IllegalArgumentException("Элемент не может быть null.");
        }

        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста.");
        }

        return elements[head];
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста.");
        }

        Object removed = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return removed;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(minCapacity, elements.length * 2);
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = size;
        }
    }
}

class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public static void create(ArrayQueueADT queue) {
        queue.elements = new Object[10];
        queue.size = 0;
        queue.head = 0;
        queue.tail = 0;
    }

    public static void enqueue(ArrayQueueADT queue, Object element) {
        if (element == null) {
            throw new IllegalArgumentException("Элемент не может быть null.");
        }

        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    public static Object element(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Очередь пуста.");
        }

        return queue.elements[queue.head];
    }

    public static Object dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Очередь пуста.");
        }

        Object removed = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return removed;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.size; i++) {
            queue.elements[(queue.head + i) % queue.elements.length] = null;
        }
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int minCapacity) {
        if (minCapacity > queue.elements.length) {
            int newCapacity = Math.max(minCapacity, queue.elements.length * 2);
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < queue.size; i++) {
                newElements[i] = queue.elements[(queue.head + i) % queue.elements.length];
            }
            queue.elements = newElements;
            queue.head = 0;
            queue.tail = queue.size;
        }
    }
}

class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    public static void create() {
        elements = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    public static void enqueue(Object element) {
        if (element == null) {
            throw new IllegalArgumentException("Элемент не может быть null.");
        }

        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста.");
        }

        return elements[head];
    }

    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста.");
        }

        Object removed = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return removed;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }

    private static void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(minCapacity, elements.length * 2);
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = size;
        }
    }
}
