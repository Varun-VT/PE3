package com.stackroute;

public class RemoveVowels {
    public String[] inputStudentMarks(String[] places){
        int i=0;
        String[] newplaces= new String[places.length];
        for (String p :places) {
            newplaces[i]= p.replaceAll("a","").replaceAll("e","").replaceAll("i","").replaceAll("o","").replaceAll("u","");
            i+=1;
        }
        return newplaces;
    }
}
