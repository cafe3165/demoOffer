package com.example.demo;

public class space03 {
    public static String replaceSpace(StringBuffer str) {
        String s=str.toString();
        return s.replace(" ","%20");
    }
    public static void main (String[] args){
        StringBuffer str=new StringBuffer("We are happy");
//        str.replace(2,3,"%20");
//        str.replace(8,9,"%20");
//        str.replace(6,7,"%20")
//        System.out.println(str);
        System.out.println(replaceSpace(str));
    }
}
