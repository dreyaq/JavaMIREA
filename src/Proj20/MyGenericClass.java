package Proj20;

public class MyGenericClass<T, V, K> {
    private T t;
    private V v;
    private K k;

    public MyGenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setV(V v) {
        this.v = v;
    }

    public void setK(K k) {
        this.k = k;
    }
    public static void main(String[] args) {
        MyGenericClass<Integer, String, Double> myInstance = new MyGenericClass<>(42, "Hello, World!", 3.14);
        System.out.println(myInstance.getT());
        System.out.println(myInstance.getV());
        System.out.println(myInstance.getK());
    }
    // Другие методы и функциональность класса
}
