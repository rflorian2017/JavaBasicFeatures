package com.company;

public class JavaBasic3 {
    
    //my first function
    printMultiDimensionArray (int[][] myInputArray){

    }

    public static void main(String[] args) {
        System.out.println("Hello !");

        //we declare an array
        double[] weekTemperatures;

        // of 7 elements size
        weekTemperatures = new double[7];

        // declare and initialize an array of 7 elements
        double[] weekTemps = {-10, 2, 3.5, 4, 0, 1, 2};

        System.out.println(weekTemps[0]);
        System.out.println(weekTemps[4]);

        //What happens if we try to print the 7th element
        // if you uncomment you will see what happens
        //System.out.println(weekTemps[7]);

        System.out.println("Allocate new size!!!");
        weekTemps = new double[8];
        //same operation as the above line
        //weekTemps = new double[] {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(weekTemps[0]);

        weekTemps[4] = 3;
        weekTemps[7] = -2;
        weekTemps[0] = -2;
        weekTemps[1] = +2;
        weekTemps[6] = +2.4;
        System.out.println(weekTemps[7]);

        System.out.println("Monday temp: " + weekTemps[0]);
        System.out.println("Tuesday temp: " + weekTemps[1]);
        /*
        ....
         */
        System.out.println("Sunday temp: " + weekTemps[6]);

        // we declare a step to go through the array
        int step = 0;

        System.out.println("Print array elements in while!!!");
        while(step < 7 ) {
            System.out.println("Week day: " + (step + 1));
            System.out.println(weekTemps[step]);
            step++;
        }

        weekTemps = new double[7];
        weekTemps[4] = 3;
        weekTemps[5] = -2;
        weekTemps[0] = -2;
        weekTemps[1] = +2;
        weekTemps[6] = +2.4;
        System.out.println("Print array elements in do...while!!!");
        //restart from element 0
        //if you comment the bellow line. see what magic happens !!
        step = 0;
        do {
            System.out.println("Week day: " + (step + 1));
            System.out.println(weekTemps[step]);
            step++;
        }
        while (step < 7);

        for(step = 0; step < 7 ; step++) {
            System.out.println("Weekday : " + (step + 1));
            System.out.println(weekTemps[step]);
        }

        // pretty print of an array
        System.out.print("My array weekTemps is: [");
        for (int i = 0; i < 7; i++) {
            System.out.print(weekTemps[i]);
            if(i < 6) {
                System.out.print(",");
                System.out.print(" ");
            }
        }
        System.out.println("]\n");
        // variable i exists only in the body of for loop
        //i++;

        //print the temperature of each day, with the day name
        System.out.println("Temperature history:");
        for (int i = 0; i < 7; i++) {
            if(i == 0) {
                System.out.println("Monday temp: " +weekTemps[i]);
            }
            else if(i == 1) {
                System.out.println("Tuesday temp: " +weekTemps[i]);
            }
            /*
            ...
             */
            else if(i == 6) {
                System.out.println("Sunday temp: " +weekTemps[i]);
            }

            else {
                System.out.println("Unreachable");
            }
        }

        int[] consecutiveNumbers;
        consecutiveNumbers = new int[15];

        for (int i = 0; i < consecutiveNumbers.length; i++) {
            consecutiveNumbers[i] = i;
        }

        // store first 15 odd numbers first method
        for (int i = 0; i < consecutiveNumbers.length * 2; i=i+2) {
            consecutiveNumbers[i/2] = i;
        }

        // store first 15 odd numbers second method
        for (int i = 0; ; i++) {
            if(i%2 == 0) {
                consecutiveNumbers[i/2] = i;
            }
            if(i == 28) {
                break;
            }
        }

        System.out.println("Interesting loop!");

        // this one and the one below are the same
        step = 0;
        for (step = 0;step < 7 ; step++) {

        }

        //same as above. Careful to ";" after the loop
        step = 0;
        for (step = 0;step < 7 ; step++);{
            System.out.println(step);
        }

        for (step = 0;step < 7 ; step++)
            System.out.println(step);


        // store first 15 odd numbers third method
        for (int i = 0; ; i++) {
            if(i%2 == 1) {
                continue;
            }
            else {
                consecutiveNumbers[i/2] = i;
            }
            if(i == 28) {
                break;
            }
        }

        //print the temperature of each day, with the day name using switch
        System.out.println("Temperature history:");
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    System.out.println("Monday temp: " +weekTemps[i]);
                    break;
                case 1:
                    System.out.println("Tuesday temp: " +weekTemps[i]);
                    break;
                case 2:
                    System.out.println("Wednesday temp: " +weekTemps[i]);
                    break;
                case 3:
                    System.out.println("Thursday temp: " +weekTemps[i]);
                    break;
                case 4:
                    System.out.println("Friday temp: " +weekTemps[i]);
                    break;
                case 5:
                    System.out.println("Saturday temp: " +weekTemps[i]);
                    break;
                case 6:
                    System.out.println("Sunday temp: " +weekTemps[i]);
                    break;
                case 7:
                case 8:
                    //fallthrough
                    System.out.println("This is not a day!!!");
                    /*
                    ...
                     */
                default:
                    //if you have a value that is not "valid" - a value that does not make sense
                    System.out.println("This is not a day!!!");

            }
        }

        //print the temperature of each day, with the day name using switch fallthough
        System.out.println("Temperature history:");
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Weekday " + (i+1) + " temp: " + weekTemps[i]);
                    break;
                default:
                    System.out.println("Never reached");
        }
        }

        //Strings and wrapper objects
        String myFirstString ;
        Integer myIntegerWrapper;

        myFirstString = "Java is cool!";
        myFirstString = myFirstString + myFirstString;


        System.out.println(myFirstString);

        //give a value of an int
        myIntegerWrapper = 2;
        System.out.println(myIntegerWrapper);

        // give the value of a String!!! Parse it using the wrapper
        myIntegerWrapper = Integer.parseInt("3");
        System.out.println(myIntegerWrapper);

        // give the value of a String!!! Parse it using the wrapper
        //this next line will give an exception
        //myIntegerWrapper = Integer.parseInt("a");
        //System.out.println(myIntegerWrapper);

        //declare a multidimension array
        int[][] multiDimensionArray;

        //initialize a multidimension array
        multiDimensionArray = new int[3][4];
        int auxiliary = 1;
        // fill with values
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 4; b++) {
                multiDimensionArray[a][b] = auxiliary;
                auxiliary ++;
            }
        }

        for (int a = 0; a < multiDimensionArray.length; a++) {

            //start of block 1
            for (int b = 0; b < multiDimensionArray[0].length; b++) {
                System.out.print(multiDimensionArray[a][b] + " ");
            } //end of block 1

            // start of block 2
            System.out.println(); //end of block 2
        }
    }
}
