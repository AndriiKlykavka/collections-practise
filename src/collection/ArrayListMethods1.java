package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Andrew");
        arrayList1.add("Tom");
        arrayList1.add("Max");
        arrayList1.add("George");

        for(String s : arrayList1){
            System.out.print(s + " ");
        }
        System.out.println();
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList2.add(6);
//        for(int i = 0; i < arrayList1.size(); i++) {
//            System.out.println(arrayList1.get(i));
//        }
        arrayList1.set(1, "Daniel");

        arrayList1.remove(0);

        System.out.println(arrayList1);
    }
}
