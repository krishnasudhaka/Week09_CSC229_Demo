/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;
/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {
    // Method 1: Main method
    public static void main(String[] args) {
        // declare variables(long triangularNumber,  int n )
        //below with datatypes and initialize(triangularNumber = 0,n = 1)
        // variables with values
        long triangularNumber = 0;
        int n = 1;


        // while loop - infinite loop below
        while (true) {  // while(true) - true is boolean literal
            //true - means condition in this case will always be true


            triangularNumber += n; // Calculate the next triangular number
            // iteration 1: triangularNumber = 0 + 1(triangularNumber = triangularNumber + n) = 1
            // iterations will continue till if(divisorCount > 100) condition met


            // countDivisors(triangularNumber)-making a reference to method 2 below
            //triangularNumber - reference to input inside countDivisors() method


            //return value of call by countDivisor() method returns count variable
            // which is stored inside divisorCount variable below
            int divisorCount = countDivisors(triangularNumber);


            // display first nu,ber whose divisors > 100 and # of divisors it has
            if (divisorCount > 100) {
                System.out.println("The first triangular number with over 100 divisors is: " + triangularNumber);
                System.out.println("It has " + divisorCount + " divisors.");
                break; // loop stops running due to break statement
            }
            n++; // incrementing n value - example n=1 ; n++ = n+1=1+1= 2
        }// end of while loop
    }


    // Method 2: countDivisors method
    // Function to count the number of divisors for a given number
    public static int countDivisors(long number) {
        int count = 0; // intialize and declare variable to count # of divisors
        //for each triangular number


        //iterate from 1 till number(for i value) the square root of the triangular
        //number
        for (long i = 1; i * i <= number; i++) {
            if (number % i == 0) { // modulus==0 if i divides number evenly
                if (i * i == number) { // If i is the square root,
                    // increase count value below by +1
                    count++;
                } else { // Otherwise(if i not square not of number),
                    //count both i and (number/i)'s values as divisors
                    // increase count value below by +2
                    count += 2;
                }
            }
        }
        return count; // return final count - count of total # of divisors




    }
}
