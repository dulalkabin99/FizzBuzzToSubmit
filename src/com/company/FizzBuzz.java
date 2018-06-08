package com.company;
import  java.util.Random;

public class FizzBuzz {
    static String pr = "Buzz";
    static String[] rps = new String[]{"Rock", "paper", "Scissors", "Lizard", "Spock"};
    static int index = 0;

    public static void main(String[] args) {

        Random rnd = new Random();
        int random1 = getRandomNum();
        int random2 = getRandomNum();
        System.out.println("The Two Random Number Generated For You are: " + random1 + " And " + random2);


        if (random1 == random2) {
            pr = "Sazam";
            System.out.println(pr);
        } else {
            //swapping the values if random number 1 is bigger than random Number 2
            if (random1 > random2) {
                int temp = random1;
                random1 = random2;
                random2 = temp;

            }
            System.out.println("For the purpose of this program We set the smallest number to " + random1 + " and Larger Number to " + random2);
            System.out.println("------------------------------------Let's Start-------------------------------------------------");
            //Checking if two random number are 10 digit apart
            if ((random2 - random1) < 10) {
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

        } else if (i % 5 == 0) pr = "Buzz";
        else {
            pr = Integer.toString(i);
        }

        if (i % 7 == 0) {
            pr = (pr + " -Multiple of 7");
        }
// code to print Rock/Paper/scissors
        if ((i > 10) && (i % 2 == 0)) {
            pr = pr + " -" + rps[index];
            index++;
            if (index > 4) {
                index = 0;
            }
        }
        if (i>20){
            String oe=GetOddEven(i);
            pr += " ---" + oe;
        }
        return pr;
    }

    //Method to get a random Number
    public static int getRandomNum() {
        Random rnd = new Random();
        int rand = rnd.nextInt(100) + 1;

        return rand;
    }

    public static String GetOddEven(int i) {
        int digit = i;
        int number = (Math.abs(digit) % 10);
        String numToStr = "";
        String oddOrEven;


        if (number == 1) numToStr = "one";
        if (number == 2) numToStr = "two";
        if (number == 3) numToStr = "Three";
        if (number == 4) numToStr = "four";
        if (number == 5) numToStr = "five";
        if (number == 6) numToStr = "six";
        if (number == 7) numToStr = "seven";
        if (number == 8) numToStr = "eight";
        if (number == 9) numToStr = "nine";
        if (number == 0) numToStr = "zero";

        if (numToStr.length() % 2 == 0) {
            oddOrEven= "Potter";
        }
        else {
            oddOrEven= "Harry";
        }
        return oddOrEven;
    }
}



