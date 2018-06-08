package com.company;


public class Main {
    static String pr;

    public static void main(String[] args) {
        //Looping to get 100 Numbers
        for (int i = 1; i <= 100; i++) {

            //Getting the number
            String prnitS = numPrint(i);

            //Printing the return
            System.out.println(prnitS);

        }

    }

//method to print Number
    public static String numPrint(int st) {
            int i=st;
            if ((i % 3 == 0) && (i % 5 == 0)) {
                pr = "FizzBuzz";
            } else if (i % 3 == 0) {
                pr = "Fizz";

            } else if (i % 5 == 0) pr = "Buzz";
            else {
                pr = Integer.toString(i);

            }
        return pr;
    }
}


