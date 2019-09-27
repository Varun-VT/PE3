package com.stackroute;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class WordFrequency {
    public void countWordFrequency() {
        String filename= "FileDemo.txt";
        try {
            BufferedReader br= new BufferedReader(new FileReader(filename));
            String text = br.readLine();
            HashMap<String, Integer> hMap = new HashMap<>();
            while (text != null){
                for (String s: text.split(" ")) {
                    if(hMap.containsKey(s)) {
                        int count = hMap.get(s);
                        hMap.put(s, count+1);
                    }
                    else {
                        hMap.put(s, 1);
                    }
                }
                text= br.readLine();
            }
            System.out.println(hMap);
        } catch (Exception e) {}

    }
}
