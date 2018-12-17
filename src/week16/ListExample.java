package week16;

import week13.animal.Cat;
import week13.interfaces.Movable;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = new ArrayList(8);
        String[] strings = new String[]{"abc","efg"};
        strings[1] = "efj";
        list.add("abcd");
        list.add("kjkjf");
        list.add(9);
        list.add(2.34);

        List<String> strList = new ArrayList<>();
        strList.add("abc");
        strList.add("8");

        // Generic
        MyList<Integer> myList = new MyList<>();
        myList.add(12);
        myList.add(39);
        System.out.println(myList.length());
        System.out.println(myList.size());

        MyListMovable<Cat> cats = new MyListMovable<>();
        MyListMovable<Movable> strs = new MyListMovable<Movable>();
        MyListMovable<Movable> movables = new MyListMovable<Movable>();
        MyListMovable<? extends Movable> movables1 = new MyListMovable<Cat>();

    }
}
