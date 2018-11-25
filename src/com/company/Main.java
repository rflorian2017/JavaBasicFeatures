package com.company;

public class Main {

    public static void main(String[] args) {

        // prints some messages to the console
        System.out.println("Hello, world!"); // when a set of characters, use quotes
        System.out.println(true); // immediate , direct value true, nu quotes ""
        System.out.println(-25); // immediate, direct value -25, no qoutes ""

        boolean myFirstBoolean; // boolean data type, 1 bit

        byte myFirstByte; // byte - 8 bits

        // initialize the variable with a value
        short myShortVariable = 123; // short has 2 bytes - 16 bits; -32768 till +32767

        /* declare an int data */
        int myIntegerData; // this has 32 bits , 4 bytes

        /* double, 64 bits, double precision  */
        /* think of this as holding two floats */
        double /* this is a comment */ myDouble;

        char myCharCharacter; // this is a char, 16 bits , UNICODE data

        String aStringOfCharacters;

        System.out.println(); // just prints a new line (ENTER) at the console
        System.out.println("!!!Print on the console some values of variables!!!");

        // assign and print a boolean to the console
        myFirstBoolean = true ; // we assign the value true to my variable
        // using + as a concatenator to show a string of characters and the value desired
        System.out.println("myFirstBoolean = " + myFirstBoolean); // variable, no quotes

        // assign a value to a byte and print it
        myFirstByte = 10; // carefull here to not overflow; byte is -128 till + 127
        System.out.print("myFirstByte = ");
        System.out.println(myFirstByte);

        // assign another value to the byte and print it
        // to assign a HEX value, add 0x in front of the number
        myFirstByte = 0xF;
        System.out.println("myFirstByte = " + myFirstByte);

        // print the content of the short variable
        System.out.println("myShort = " + myShortVariable);

        // change the value to the short
        myShortVariable = 567;
        System.out.println("New value for myShort = " + myShortVariable);

        // myShortVariable = -32769;  // if you uncomment this line this will give an error. Underflow!!
        // myShortVariable = 32769;  // if you comment this line, this will give an errot. Overflow!!!

        // asign value to int
        // use binary representation
        myIntegerData = 0b1001;
        System.out.println("What the .... int = " + myIntegerData);

        // asign new value to int
        // use Octal representation - to write in octal system representation , write a 0 in front of the number
        myIntegerData = 031;  // 31 oct - > 25 Dec  ;; Why programmers mix Halloween with Christmas
        System.out.println("What the new.... int = " + myIntegerData);

        // myFloatData = 1; // uncomment this line. It gives an error. Do not use data before declaration
        float myFloatData; // float , on 32 bits , single precision
        // just put jnk characters in the number for showing purposes
        myFloatData = 0.5556564654654654654654654646456465456465456456465465f; // when putting a decimal point, put a sufix f (OR F)

        System.out.println("Here is a float -> " + myFloatData);

        myDouble = 23.2565454646789789578947574927594211; // no need to suffix an f
        System.out.println("Here is a double -> " + myDouble);

        myIntegerData = 10_000; // usage of underscore character to group digits
        System.out.println("Here is another -> " + myIntegerData);

        // int myIntegerData; //if you uncomment this line, it will give an error; you cannot redeclare a variable
        myIntegerData = 0xDEAD_C0DE; // usage of grouping with the character underscore_
        System.out.println("Here is another -> " + myIntegerData);

        short mySecondIntegerData = -1;
        // it is showing myIntegerData and mySecondIntegerData one after the other
        System.out.println("Here are two integers: " + myIntegerData + mySecondIntegerData);

        // grouping of operations using square brackets
        System.out.println("Here are two integers: " + (myIntegerData + mySecondIntegerData));

        // value in hex of a char character. This is the ASCII value of 'a'
        myCharCharacter = 0x61;
        System.out.println("Here is a char: " + myCharCharacter);

        // 'a' is a character. Character is a symbol ( think of it as letters, numbers etc)
        myCharCharacter = 'a';
        System.out.println("Here is the same char: " + myCharCharacter);

        //myCharCharacter = 061;
        //System.out.println("Here is the same char: " + myCharCharacter);

        // UNICODE value for the character ă
        myCharCharacter = '\u0103';
        // myCharCharacter = 'ă'; // same as above but with direct value
        System.out.println("Here is the same char: " + myCharCharacter);

        myCharCharacter = '\n'; // this is a new line
        System.out.println(myCharCharacter + "I just printed a new line!!!Yeey");

        // let's try it again
        System.out.print(myCharCharacter); // print not println
        System.out.print("On a new line!!"); // print not println
        System.out.print(myCharCharacter); // print not println

        myCharCharacter = '\t'; // TAB
        System.out.println("my character is a" + myCharCharacter + "tab");

        myCharCharacter = '"';
        System.out.println("Showing double quote: " + myCharCharacter);

        myCharCharacter = '\''; // usage of escape character \
        System.out.println("Showing single quote: " + myCharCharacter);

        myCharCharacter = '\\'; // usage of escape character \ for printing \
        System.out.println("Showing \\ character: " + myCharCharacter);

        System.out.println("__________________________________________________");
        System.out.println("!!!!!!!!!!!!Begin operators !!!!!!!!");

        int myVar1 = 12;
        int myVar2 = 6000;
        int myVar3 = 0;

        int sum ;//= 0; // we can init or we don't init with a value
        sum = myVar1 + myVar3;

        System.out.println("Sum of numbers: " + sum);

        int diff = sum - myVar2;  // initialization on difference of two previous variables
        System.out.println("Diff of numbers: " + diff);

        int myNumber, myNumber2 = 12, myNumber3 = myNumber2 + 3, myNumber4, myNumber5 = 66;
        /* Same as below, but we could write
        int myNumber ;
        int myNumber2 =12;
        int myNumber3;
        int myNumber4;
        int myNumber5 = 66;
         */
        System.out.println("Mynumber3 : " + myNumber3);

        int product = 1;
        myNumber4 = 15;
        product = product * myNumber4; // product of two numbers

        System.out.println("Product: " + product);

        product *= myNumber4; // same as product = product * myNumber4;
        System.out.println("Product: " + product);

        boolean myComparison = 3 < 5;
        System.out.println("3 < 5 is " + myComparison);

        myComparison = 3 <= 5;
        System.out.println("3 <= 5 is " + myComparison);

        myComparison = 3 > 5;
        System.out.println("3 > 5 is " + myComparison);

        myComparison = 7 == 7;
        System.out.println("7==7 is " + myComparison);

        int a = 0;
        System.out.println("a is 0: " + a);

        a = a + 1; // a = 1
        System.out.println("a is 1: " + a);

        a += 1; // a = a + 1; a = 2
        System.out.println("a is 2: " + a);

        a++; // a = a + 1 or a += 1 ; a = 3
        System.out.println("a is 3: " + a);

        ++a; // a = a + 1 or a += 1 ; a = 4
        System.out.println("a is 4: " + a);

        int b = ++a; // same as b = a+1;
        System.out.println("b is 5: " + b);
        System.out.println("a is 5: " + a);

        b = a++; // b = a ; a = a + 1;
        System.out.println("b is 5: " + b);
        System.out.println("a is 6: " + a);

        //first init c with a value. We don't actually this value
        int c = 100;

        // now we assign something to c
        // c = (a++) + (++b);
        // c = a++ + ++b;
        c = a++
                +     ++b;

        // first => a = 6, b = 5
        // steps:
        // first step: c = a (because a++ is executed after)
        // second step : a++ <=> a = a + 1 = 6 + 1 = 7
        // third step: ++b <=> b =  b + 1 = 5 + 1 = 6
        // last step :   first step (c = a) + third step :  c = c + (b+1) = a + (b + 1) = 6 + 6 = 12

        System.out.println("b is 6: " + b);
        System.out.println("a is 7: " + a);
        System.out.println("c is 12: " + c);

        int d = c-- + --b;
        // init c = 12, b = 6
        // d = (12) + (6 - 1) = 12 + 5 = 17
        // c = 11
        // b = 5
        System.out.println("b is 5: " + b);
        System.out.println("d is 17: " + d);
        System.out.println("c is 11: " + c);

        byte byteForShift = 0b1100; // this is 8 + 4 = 12
        //same as we write byteForShift = 0xC;
        // we shift to the right : 0b1100 >> 2 => 0011. This means division by 2 by 2 power , 4
        System.out.println("Shifted to the right: " +  (byteForShift >> 2) );

        // 001100 << 2 => 11000000 = 32 + 16 = 48
        System.out.println("Shifted to the left: " +  (byteForShift << 2) );

        // shift to right with 2 positions , shift to left with 2 positions
        System.out.println("Shifted to the left: " +  (  (byteForShift >> 2)  << 2 ) );

        // and out of more than one conditions
        boolean testSeveralConditions;
        // 12 < 43 AND 5 < 14
        testSeveralConditions = ( 12 < 43 ) && ( 5 > 14 ); // is it wrong ?
        System.out.println("TEST AND: " + testSeveralConditions);

        int testSeveralConditionsInt;
        testSeveralConditionsInt = 12 & 3 ; // SI pe biti -> BITWISE
        System.out.println("Bitwise : " + testSeveralConditionsInt);

        a = 5;
        boolean testSeveralConditionsOR,  testSeveralConditionsXOR;
        testSeveralConditionsOR = (12 < a) || (1==1); // SAU logic, LOGICAL OR
        System.out.println("LOGICAL OR: " + testSeveralConditionsOR);

        testSeveralConditionsInt = 12 | 3 ; // SAU pe biti -> BITWISE
        System.out.println("Bitwise OR: " + testSeveralConditionsInt);

        boolean testSeveralConditionsNOT;
        testSeveralConditionsNOT = !(12 < 5);
        System.out.println("Logical NOT :" + testSeveralConditionsNOT);
        testSeveralConditionsNOT = !testSeveralConditionsNOT;
        System.out.println("Logical NOT :" + testSeveralConditionsNOT);

        // testSeveralConditionsInt = !12; // NOT is not  working for integer, just for boolean and conditions
        byteForShift = ~12; // not pe biti
        System.out.println("Bitwise NOT : ~ :" + byteForShift);

        int anIntData = 12;
        short aShortData = (short)anIntData;
        System.out.println("Integer value is : " + anIntData);
        System.out.println("Store the big integer into a short : " + aShortData);

        anIntData = 0x12345678;
        aShortData = (short)anIntData;
        System.out.println("Integer value is : " + anIntData);
        System.out.println("Store the big integer into a short : " + aShortData);

        short first2bytes = (short)(anIntData >> 16); // we want to store 0x1234
        short second2bytes = (short)anIntData; // we want to store 0x5678
        System.out.println("First part: " + first2bytes);
        System.out.println("Second part: " + second2bytes);

        int combineShorts;
        combineShorts = (first2bytes << 16) + second2bytes;
        System.out.println("Initial int " + anIntData);
        System.out.println("New Int " + combineShorts) ;



    }
}
