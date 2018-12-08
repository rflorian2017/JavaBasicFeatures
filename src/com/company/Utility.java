package com.company;

 public class Utility {
    //my first function / method
    static void printMultiDimensionArray (int[][] myInputArray) {
        for (int a = 0; a < myInputArray.length; a++) {

            //start of block 1
            for (int b = 0; b < myInputArray[0].length; b++) {
                System.out.print(myInputArray[a][b] + " ");
            } //end of block 1

            // start of block 2
            System.out.println(); //end of block 2
        }
    }


    static int sumOfTwo(int num1, int num2) {
        //int sum = num1 + num2;
        //return sum;
        return num1 + num2;
    }

    static int powerOfTwo(int number) {
        int pow = number * number;
        return pow;
    }

    //compute factorial !n
    static int factorial (int number) {
        int product = 1;
        if(number == 0) {
            product = 1;
        }
        for (int i = 1; i <= number; i++) {
            product = product * i;
        }
        return product;
    }

    //compute factorial !n in another way
    static int factorial2 (int number) {
        int product = 1;
        if(number == 0) {
            return 1;
        }
        for (int i = number; i >=1 ; i--) {
            product = product * i;
        }
        return product;
    }
}
