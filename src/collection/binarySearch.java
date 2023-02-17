package collection;

import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(-21);
        arrayList.add(-1);
        arrayList.add(0);
        arrayList.add(16);
        arrayList.add(81);
        arrayList.add(199);
        arrayList.add(-91);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(23);
        arrayList.add(-44);
        arrayList.add(10);
        arrayList.add(13);
        arrayList.add(-9);
        arrayList.add(2);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
//        int index1 = Collections.binarySearch(arrayList, 100);
        System.out.println(arrayList);
//        System.out.println(arrayList);
//        System.out.println(index1);
        Employee emp1 = new Employee(100, "Miracle", 12345);
        Employee emp2 = new Employee(15, "Solar", 6542);
        Employee emp3 = new Employee(123, "Dark", 8542);
        Employee emp4 = new Employee(15, "Serrar", 5678);
        Employee emp5 = new Employee(182, "TyTy", 125);
        Employee emp6 = new Employee(15, "Innovation", 9874);
        Employee emp7 = new Employee(250, "Maru", 1579);
        
//
//        List<Employee> list = new ArrayList<>();
//
//        list.add(emp1);
//        list.add(emp2);
//        list.add(emp3);
//        list.add(emp4);
//        list.add(emp5);
//        list.add(emp6);
//        list.add(emp7);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        int index2 = Collections.binarySearch(list, new Employee(250, "Maru", 1579));
//        System.out.println(index2);

//        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index3 = Arrays.binarySearch(array,150);
//        System.out.println(index3);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
