package com.example.demo;

public class arrayFind01 {
    public static boolean Find(int target, int[][] array) {
        boolean flag = false;
        //这边从右上角开始

        int col = array[0].length - 1, row = array.length - 1;
            for (int i = 0, j = col; (i <=row) && (j >= 0); ) {
                if(array[i][j]==target){
                    flag=true;
                    break;
                }
                else if(array[i][j]>target){
                    j--;
                }
                else{
                    i++;
                }
            }



        return flag;
    }

    public static void main(String[] args) {
//        int[][] arr = {{1, 2, 8, 9},
//                {2, 4, 9, 12},
//                {4, 7, 10, 13},
//                {6, 8, 11, 15}};
        int[][] arr={{1,2,8,9},{4,7,10,13}};
        int target = 7;
        System.out.println(Find(target, arr));
    }
}
