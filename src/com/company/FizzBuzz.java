package com.company;
import  java.util.Random;

public class FizzBuzz {
    static String pr;

    public static void main(String[] args) {

        Random rnd = new Random();
        int random1 = getRandomNum();
        int random2 = getRandomNum();


        if (random1 == random2) {
            pr = "Sazam";
            System.out.println(pr);
        }
        else {
            if (random1 > random2) {
                int temp = random1;
                random1 = random2;
                random2 = temp;
            }

            //Checking if two random number are 10 digit apart
            if ((random2-random1)<10) {
                System.out.println("This won't take long");

            }
            //Looping to get 100 Numbers
            for (int i = random1; i <= random2; i++) {

                //Getting the number
                pr = numPrint(i);

                //Printing the return
                System.out.println(pr);
            }

        }
    }

    //method to print Number
    public static String numPrint(int st) {
        int i = st;
        if ((i % 3 == 0) && (i % 5 == 0)) {
            pr = "FizzBuzz";
        } else if (i % 3 == 0) {
            pr = "Fizz";

        } else if (i % 5 == 0) {
            pr = "Buzz";
        }
        else {
            pr = Integer.toString(i);
        }

        if (i % 7 == 0) {
            pr = (pr +" -Multiple of 7");
        }
        return pr;
    }
//Method to get a random Number
    public static int getRandomNum() {
        Random rnd = new Random();
        int rand = rnd.nextInt(22) + 1;

        return rand;
    }
}



