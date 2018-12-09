package javabasic.oop.first.utils;

public class Utilities {
    /*
    we want to create a method that accepts as input a one dimension array
    and computes the average of all its values
    returns the actual average value
     */

    public int averageOfArrayValues(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            //any number of instructions
            sum += array[i];
        }

        return sum/array.length;
    }

    public static double averageOfArrayValuesBetter(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            //any number of instructions
            sum += array[i];
        }

        return (double)sum/array.length;
    }

    public static double averageOfArrayValuesBetter(double[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            //any number of instructions
            sum += array[i];
        }

        return (double)sum/array.length;
    }
}
