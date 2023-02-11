package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Andrew");
        arrayList1.add("George");
        arrayList1.add("Nikolas");
        arrayList1.add("Den");
        arrayList1.add("Matthew");
        arrayList1.add("James");
        arrayList1.add("Den");
        arrayList1.add("Matthew");
        arrayList1.add("James");
        arrayList1.add("Den");
        arrayList1.add("Matthew");
        arrayList1.add("James");

        ArrayList<String> arrayList2 = new ArrayList<>();
        List<String> arrayList3 = new ArrayList<>(200);

        List<String> arrayList4 = new ArrayList<>(arrayList3);

    }
}
