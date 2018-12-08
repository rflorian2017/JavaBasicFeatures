package com.company;

public class JavaBasic3 {
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

        

    }
}
