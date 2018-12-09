package javabasic.oop.lists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //declare an array of 10 elements
        int[] myArrayOfInt = new int[10];
        for (int i = 0; i < myArrayOfInt.length; i++) {
            myArrayOfInt[i] = i;
        }
        for (int i = 0; i < myArrayOfInt.length; i++) {
            System.out.print(myArrayOfInt[i] + " ");
        }
        System.out.println();
        //myArrayOfInt[10] = 22; // this gives an out of bounds exception

        System.out.println();
        for (int element: myArrayOfInt) {
            System.out.print(element + " ");
        }

        ArrayList<Integer> myIntArrayList = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            myIntArrayList.add(i);
        }
        myIntArrayList.add(11);
        for (int i = 0; i < myIntArrayList.size(); i++) {
            System.out.print(myIntArrayList.get(i) + " ");
        }

        System.out.println();
        for (int element: myIntArrayList) {
            System.out.print(element + " ");
        }
    }
}
