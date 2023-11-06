package Proj20;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        if (array == null || array.length == 0) {
            return null;
        }

        T min = array[0];
        for (T item : array) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }

    public T findMax() {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (T item : array) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 1, 10};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);

        System.out.println("Min: " + intMinMax.findMin());
        System.out.println("Max: " + intMinMax.findMax());

        Double[] doubleArray = {2.5, 1.3, 3.8, 0.5, 4.0};
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);

        System.out.println("Min: " + doubleMinMax.findMin());
        System.out.println("Max: " + doubleMinMax.findMax());
    }
}