package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Andrew");
        arrayList1.add("Tom");
        arrayList1.add("Max");
        arrayList1.add("George");
        arrayList1.add("Sofia");
        System.out.println(arrayList1);

//        List<Integer> list1 = List.of(3,8,13);
//        System.out.println(list1);
//        //Exception
//        list1.add(199);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

//        Object[] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[0]);
//        for (String s : array2) {
//            System.out.println(s);
//        }

//        //View into our arrayList
//        List<String> myList = arrayList1.subList(1,4);
//        myList.add("Fedir");
//        System.out.println(myList);
//        System.out.println(arrayList1);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Tom");
//        arrayList2.add("Max");
//        arrayList2.add("Igor");

//        arrayList1.removeAll(arrayList2);

//        arrayList1.retainAll(arrayList2);

//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);
    }
}
