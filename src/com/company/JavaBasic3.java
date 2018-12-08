package com.company;

import com.company.objects.Person;

public class JavaBasic3 {

    static void firstPart() {
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
        while (step < 7) {
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

        for (step = 0; step < 7; step++) {
            System.out.println("Weekday : " + (step + 1));
            System.out.println(weekTemps[step]);
        }

        // pretty print of an array
        System.out.print("My array weekTemps is: [");
        for (int i = 0; i < 7; i++) {
            System.out.print(weekTemps[i]);
            if (i < 6) {
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
            if (i == 0) {
                System.out.println("Monday temp: " + weekTemps[i]);
            } else if (i == 1) {
                System.out.println("Tuesday temp: " + weekTemps[i]);
            }
            /*
            ...
             */
            else if (i == 6) {
                System.out.println("Sunday temp: " + weekTemps[i]);
            } else {
                System.out.println("Unreachable");
            }
        }

        int[] consecutiveNumbers;
        consecutiveNumbers = new int[15];

        for (int i = 0; i < consecutiveNumbers.length; i++) {
            consecutiveNumbers[i] = i;
        }

        // store first 15 odd numbers first method
        for (int i = 0; i < consecutiveNumbers.length * 2; i = i + 2) {
            consecutiveNumbers[i / 2] = i;
        }

        // store first 15 odd numbers second method
        for (int i = 0; ; i++) {
            if (i % 2 == 0) {
                consecutiveNumbers[i / 2] = i;
            }
            if (i == 28) {
                break;
            }
        }

        System.out.println("Interesting loop!");

        // this one and the one below are the same
        step = 0;
        for (step = 0; step < 7; step++) {

        }

        //same as above. Careful to ";" after the loop
        step = 0;
        for (step = 0; step < 7; step++) ;
        {
            System.out.println(step);
        }

        for (step = 0; step < 7; step++)
            System.out.println(step);


        // store first 15 odd numbers third method
        for (int i = 0; ; i++) {
            if (i % 2 == 1) {
                continue;
            } else {
                consecutiveNumbers[i / 2] = i;
            }
            if (i == 28) {
                break;
            }
        }

        //print the temperature of each day, with the day name using switch
        System.out.println("Temperature history:");
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    System.out.println("Monday temp: " + weekTemps[i]);
                    break;
                case 1:
                    System.out.println("Tuesday temp: " + weekTemps[i]);
                    break;
                case 2:
                    System.out.println("Wednesday temp: " + weekTemps[i]);
                    break;
                case 3:
                    System.out.println("Thursday temp: " + weekTemps[i]);
                    break;
                case 4:
                    System.out.println("Friday temp: " + weekTemps[i]);
                    break;
                case 5:
                    System.out.println("Saturday temp: " + weekTemps[i]);
                    break;
                case 6:
                    System.out.println("Sunday temp: " + weekTemps[i]);
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
                    System.out.println("Weekday " + (i + 1) + " temp: " + weekTemps[i]);
                    break;
                default:
                    System.out.println("Never reached");
            }
        }

        //Strings and wrapper objects
        String myFirstString;
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
                auxiliary++;
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

        Utility.printMultiDimensionArray(multiDimensionArray);

        System.out.println(Utility.sumOfTwo(1, 2));
        System.out.println(Utility.powerOfTwo(Utility.sumOfTwo(1, 2)));

        String factorialText = "Factorialul unui numar: ";
        System.out.println(factorialText + Utility.factorial(7));

        System.out.println(factorialText + Utility.factorial2(7));
        System.out.println(factorialText + Utility.factorial(0));
        System.out.println(factorialText + Utility.factorial2(0));
    }

    static void secondPart() {
        int myInt1 = 1, myInt2 = 1;
        Integer myInteger1 = 1, myInteger2 = 2, myInteger3 = 3;

        //test equality of two ints
        if (myInt1 == myInt2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (myInt1 == myInteger1) {
            System.out.println(true);
        }

        System.out.println(myInteger2 == myInteger3);

        String myText1 = "text";
        String myText2 = "text";

        System.out.println(myText2 == myText1);
        if (myText2 == myText1) {
            System.out.println("true");
        }

        String myText4 = null;
        myText4 = new String("text");
        if (myText4 == myText1) {
            System.out.println("true");
        } else {
            if (myText4.equals(myText1)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

        System.out.println("Test contains: ");
        String someText = "Find an a in this text. Can you do it ?";
        System.out.println(someText.contains("text"));
        System.out.println(someText.indexOf("an"));
    }

    public static void main(String[] args) {
        //firstPart();
        //secondPart();
        Person maria;
        maria = new Person();

        Person vlad = new Person();

        System.out.println(maria);
        System.out.println(vlad);

        //print an age
        //System.out.println(Person);  //this does not do anything
        System.out.println(maria.age);
        maria.age ++;
        System.out.println(maria.age);
        maria.printAge();

        //uncomment this line. Name is a private field
        //System.out.println(vlad.name);

        maria.setName("Maria");
        System.out.println(maria.getName());

        Person jane = new Person(30, "F", "Jane Doe", 45);
        System.out.println(jane.getName());

        System.out.println(Math.sqrt(2));
        System.out.println(Math.PI);
        System.out.println(Math.pow(2,10));

        Object john = new Person();
        ((Person)john).setName("John Doe");
        System.out.println();

        System.out.println(maria);
        System.out.println(maria.toString());
    }
}
