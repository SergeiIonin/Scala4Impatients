package pecs.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void add(List<? super Feline> dest,
                           List<? extends Feline> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        ArrayList<Feline> cats = new ArrayList<>(Arrays.asList(new Cat("cat1"), new Cat("cat2")));
        List<Persian> pers = new ArrayList<>(Arrays.asList(new Persian("per1"), new Persian("per2")));
        List<Maycuhn> mays = new ArrayList<>(Arrays.asList(new Maycuhn("may1"), new Maycuhn("may2")));

        add(cats, pers);
        System.out.println(cats);

    }

}
