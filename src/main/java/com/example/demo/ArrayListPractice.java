package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice{
    public static void main(String...args) {
        System.out.println("-----------------ArrayList Create Begin---------------------"); // ArrayList Create + print
        List<String> letters=new ArrayList<String>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        System.out.println(letters);
        assert letters.get(1) == "b";
        System.out.println("-----------------ArrayList Create End---------------------");

// ArrayList Read + loop
        System.out.println("-----------------ArrayList Read Begin---------------------");
        System.out.println(letters.get(2));


        for (String letter : letters) { // option 1 using loop
            System.out.println(letter);
        }

        letters.
                stream().
                forEach(letter ->  //option 2 using stream, similar to closure in groovy
                System.out.println(letter)
        );//option 2 using closure and it variable
        System.out.println("-----------------ArrayList Read End---------------------");

//// ArrayList Update
        System.out.println("-----------------ArrayList Update Begin---------------------");
        letters.add("f"); // adding new
        System.out.println(letters);

        letters.set(0,"z"); //
        System.out.println(letters);
        System.out.println("-----------------ArrayList Update End---------------------");

//// ArrayList Delete
        System.out.println("-----------------ArrayList Delete Begin---------------------");
        letters.remove("f"); //can remove by index as well letters.remove(1)
        //remember list is LIFO, therefore when removing the last occurence is removed
        System.out.println(letters);

        System.out.println("-----------------ArrayList Delete Begin---------------------");

    }


}
