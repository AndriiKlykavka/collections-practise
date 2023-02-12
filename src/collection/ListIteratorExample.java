package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "будем'ясо";
        List<Character> list = new LinkedList<>();
        for(char ch : s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> straightIterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (straightIterator.hasNext() && reverseIterator.hasPrevious()) {
            if(straightIterator.next() != reverseIterator.previous()) {
                isPalindrome=false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
