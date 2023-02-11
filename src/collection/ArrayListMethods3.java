package collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Andrew");
        arrayList1.add("Tom");
        arrayList1.add("Max");
        arrayList1.add("George");
        arrayList1.add("Tom");
        System.out.println(arrayList1.toString());

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("!!!");
//        arrayList2.add("???");
//        arrayList1.addAll(1, arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.clear();
        System.out.println(arrayList1.contains("Tom"));
    }
}
