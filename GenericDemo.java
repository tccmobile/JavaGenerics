// Generic class with type parameter T
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

// Generic class with multiple type parameters
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

// Class demonstrating bounded type parameters
class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public double getDoubleValue() {
        return number.doubleValue();
    }
}

public class GenericDemo {
    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Generic method with bounded type parameter
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) return null;
        
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Using generic Box class
        Box<String> stringBox = new Box<>("Hello Generics!");
        System.out.println("String box contains: " + stringBox.getContent());

        Box<Integer> intBox = new Box<>(42);
        System.out.println("Integer box contains: " + intBox.getContent());

        // Using Pair class
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println("Pair: " + pair.getKey() + " = " + pair.getValue());

        // Using NumberBox with bounded type parameter
        NumberBox<Integer> numberBox = new NumberBox<>(100);
        System.out.println("Number box value: " + numberBox.getDoubleValue());

        // Using generic method
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"apple", "banana", "cherry"};
        
        System.out.println("\nPrinting arrays:");
        printArray(numbers);
        printArray(words);

        // Using generic method with bounded type parameter
        System.out.println("\nFinding maximum values:");
        System.out.println("Max number: " + findMax(numbers));
        System.out.println("Max word: " + findMax(words));
    }
} 