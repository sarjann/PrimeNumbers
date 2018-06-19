import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.sqrt;


public class prime {
    static double startTime = 0;
    static long lastprime = 0;
    static int big = 0;
// big will include improvements which will probably work best at higher end of primes // update - it didn't
    public static void main(String[] args) {


        Scanner user_input = new Scanner(System.in);

        //System.out.print("Enter start n: ");
        long start = 0L;//user_input.nextLong();
        //System.out.print("Enter stop n: ");
        long upto = start + 1000L;//user_input.nextLong();
        //System.out.print("Enter 1 for big mode or 0 for non-big mode: ");
        // long upto =start + 1000L ;//user_input.nextInt();
        startTime = System.nanoTime();


        long length = upto - start;


        long largeprime = 0;
        long nops = 0;
        long nchecl = upto - start;

        for (long n = start; n <= upto; n++) {

            boolean out = iprime(n);
            ;
            if (out) {
                largeprime = n;
                nops = nops + 1;

            }
        }

        double stopTime = System.nanoTime();
        double timeTaken = stopTime - startTime;
        System.out.println("Runtime was " + timeTaken / 1000000000 + " seconds");
        System.out.println("Largest prime was " + largeprime);
        System.out.println("Of " + nchecl + " numbers checked " + nops + " were prime ");


    }

    static double first = 0;

    public static boolean iprime(long n) {

        if (n == 1)
            return false;
        else
            for (long i = 2; (i < sqrt(n)); i++) {


                if (i % 2 == 0 && i != 2 || i % 3 == 0 && i != 3 || i % 5 == 0 && i != 5) {
                    if (big == 1) {
                        if (i % 7 == 0 && i != 7 || i % 11 == 0 && i != 11) {

                        }
                    }}

                    else if (n % i == 0) {
                        return false;
                    }



                }
                if (System.currentTimeMillis() - first >= 0) {
                    long diff = n - lastprime;
                    System.out.println("Current prime: " + n + ", Time (seconds): " + ((System.nanoTime() - startTime) / 1000000000)
                            + " Difference between prime in last unit time and this unit time is: " + diff);
                    lastprime = n;
                    first = System.currentTimeMillis();

                }
        return true;

            }





            }

















