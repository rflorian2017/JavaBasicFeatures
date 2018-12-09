package javabasic.oop.first;

import javabasic.oop.first.constants.Constants;
import javabasic.oop.first.utils.Utilities;

public class Main {

    static void displayWeekTemperatures(int[] weekTemperatures) {

        System.out.println("Week temperatures are :");
        //cycle through the array of temperatures
        for (int i = 0; i < weekTemperatures.length; i++) {
            // show a corresponding string for each day
            switch (i) {
                case 0:
                    System.out.println(Constants.mondayString + " temperature is: " + weekTemperatures[i]);
                    break;
                case 1:
                    System.out.println(Constants.tuesdayString + " temperature is: " + weekTemperatures[i]);
                    break;
                case 2:
                    System.out.println(Constants.wednesdayString + " temperature is: " + weekTemperatures[i]);
                    break;
                case 3:
                    System.out.println(Constants.thursdayString + " temperature is: " + weekTemperatures[i]);
                    break;
                case 4:
                    System.out.println(Constants.fridayString + " temperature is: " + weekTemperatures[i]);
                    break;
                case 5:
                    System.out.println(Constants.saturdayString + " temperature is: " + weekTemperatures[i]);
                    break;
                case 6:
                    System.out.println(Constants.sundayString + " temperature is: " + weekTemperatures[i]);
                    break;
                default:
                    //it is never reached if the array is of size 7
                    System.out.println("Never reached");
            }
        }

        return;
    }

    public static void main(String[] args) {
        //System.out.println("Hello world");
        // create an array to store 7 values - the temperature of each day of the week
        int[] weekTemperatures = new int[7];

        //store a value on each position in the array
        weekTemperatures[0] = -1;
        weekTemperatures[1] = 2;
        weekTemperatures[2] = -2;
        weekTemperatures[3] = 0;
        weekTemperatures[4] = 4;
        weekTemperatures[5] = 5;
        weekTemperatures[6] = 1;

        displayWeekTemperatures(weekTemperatures);
        // monday string is final. This way you know is a constant
        //Constants.mondayString = "Tuesday";
        displayWeekTemperatures(weekTemperatures);

        //call a static method of Utilities
        System.out.println("Better average: "
                + Utilities.averageOfArrayValuesBetter(weekTemperatures));

        //create a new object utilities
        Utilities myUtilitiesObject = new Utilities();
        System.out.println("Average temperatures over one week: "
                + myUtilitiesObject.averageOfArrayValues(weekTemperatures));

        System.out.println("Average of some array: "
                + Utilities.averageOfArrayValuesBetter(new int[]{1, 2, 3, 4}));

        // this is the same as new int[] {1,2,3,4} <- this line says that the array is anonymuous
        //int[] anArray = new int[]{1,2,3,4};

//        System.out.println("Average of some other array" +
//                new Utilities().averageOfArrayValues(new int[]{1,2,3,4,5}));
    }
}
