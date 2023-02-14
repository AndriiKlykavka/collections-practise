package collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Andrew");
        vector.add("Niko");
        vector.add("Tommy");
        vector.add("Bully");
        System.out.println(vector);
        System.out.println(vector.lastElement());
        System.out.println(vector.firstElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
