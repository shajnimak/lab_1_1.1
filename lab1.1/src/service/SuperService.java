package service;

import java.util.Scanner;

public class SuperService {
    /**
     @findMin - To find the minimum in a list
     @param - integer number (N)
     @return - the smallest array object(integer)
     **/
    public static void findMin(int N){
        int[] array = new int[N];
        int min = 99999999;
        System.out.println("Enter array objects");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
            if (min>array[i])
                min = array[i];
        }
        System.out.println(min);
    }

    /**
     @findAverage - To find the average of a list
     @param - integer number (N)
     @return - average of a list(double)
     **/
    public static void findAverage(int N){
        int[] array = new int[N];
        double sum = 0;
        System.out.println("Enter array objects");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        double av = sum/N;
        System.out.println(av);
    }

    /**
     @isPrime - Checks for a prime
     @param - integer number (N)
     @return - void method, but we have string output
     **/
    public static void findIsPrime(int N){
        if (N < 2) {
            System.out.println("Composite");
            return;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                System.out.println("Composite");
                return;
            }
        }
        System.out.println("Prime");
    }

    /**
        @findFactorial - find factorial of number
        @param - integer number (n)
        @return - integer number
    **/
    public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * findFactorial(n-1);
        }
    }

    /**
        @findFactorial - find Fibonacci of number
        @param - integer number (n)
        @return - integer number
    **/
    public static int findFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return findFibonacci(n-1) + findFibonacci(n-2);
        }
    }
}
