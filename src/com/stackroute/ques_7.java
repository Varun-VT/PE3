package com.stackroute;

public class ques_7 {
    public static void main(String[] args) {
        try{
        throw new MyException("Error");
        }catch (MyException e){
            System.out.println("Inside Catch.");
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
    static class MyException extends Exception{
        public MyException(String msg){
            super(msg);
        }
    }
}
