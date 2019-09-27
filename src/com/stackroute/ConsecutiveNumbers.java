package com.stackroute;

public class ConsecutiveNumbers {
    public void areConsecutiveNumbers(String args) {
        String[] s= args.split(",");
        int[] numbers= new int[s.length];
        int[] asc= new int[s.length];
        int[] desc= new int[s.length];
        for (int i=0; i<s.length; i++){
            numbers[i]= Integer.parseInt(s[i]);
        }
        int temp= numbers[0];

        boolean isasc= false;
        boolean isdesc= false;
        asc[0]= desc[0]= numbers[0];
        for (int i=1; i<s.length; i++) {
            asc[i]= asc[i-1]+1;
            desc[i]= desc[i-1]-1;
        }
        isasc= areEqual(numbers, asc);
        isdesc= areEqual(numbers, desc);
        if (isasc || isdesc){
            System.out.println(numbers+" are consecutive numbers");
        }
        else
            System.out.println(numbers+" are non-consecutive numbers");
    }
    public static boolean areEqual(int arr1[], int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;

        // If lengths of array are not equal means
        // array are not equal
        if (n != m)
            return false;

        // Linearly compare elements
        for (int i = 0; i < n; i++)
            if (arr1[i] != arr2[i])
                return false;

        // If all elements were same.
        return true;
    }
}
