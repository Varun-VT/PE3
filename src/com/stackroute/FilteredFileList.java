package com.stackroute;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class FilteredFileList {

    public static void main(String a[]){
        File file = new File("data/.");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter The extension of file. We've .txt in this case");
        String extension= scanner.nextLine();
        File[] files = file.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(extension)){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(File f:files){
            System.out.println(f.getName());
        }
    }
}

