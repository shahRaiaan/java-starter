package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPractice {

    public static void main(String... args) {
// HashMap Create
        System.out.println("-----------------HashMap Create Begin---------------------"); // ArrayList Create + print
        Map<String, String> colors = new HashMap<String, String>();// method 1 traditional way
        colors.put("red", "#FF0000");
        colors.put("green", "#00FF00");
        colors.put("blue", "#0000FF");
        assert colors.get("red") == "#FF0000";

//        //method 2 - java 9 way
//        Map <String,String> colors = Map.of("red","#FF0000","greed","#00FF00","blue","#0000FF");
//        assert colors.get("red") == "#FF0000";

        System.out.println("-----------------HashMap Create End---------------------");
        // HashMap Read + loop
        System.out.println("-----------------HashMap Read Begin---------------------");
        System.out.println(colors.get("red"));
        // regular for each wont work

//        for(Map.Entry<String,String> entry  : colors.entrySet()){ //option 1 conventional not working for some reason
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

//        Iterator<Map.Entry<String, String>> iterator = colors.entrySet().iterator(); // option 2 iterator
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> entry = iterator.next();
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

        colors.entrySet().stream().forEach(item -> //option 3 java stream
                System.out.println(item.getValue()));


        System.out.println("-----------------HashMap Read End---------------------");
        // HashMap Update
        System.out.println("-----------------HashMap Update Begin---------------------");
        colors.put("red","updated");
        colors.entrySet().stream().forEach(item -> //option 3 java stream
                System.out.println(item.getValue()));
        System.out.println("-----------------HashMap Update End---------------------");

          // HashMap Delete
        System.out.println("-----------------HashMap Delete Begin---------------------");
        colors.remove("red");
        colors.entrySet().stream().forEach(item -> //option 3 java stream
                System.out.println(item.getValue()));
        System.out.println("-----------------HashMap Delete End---------------------");
    }

    }

