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

    /**
        @findPower - find the power of two numbers;
        @param1 - double number (a);
        @param2 - integer number (n);
        @return - powered value(double);
    **/
    public static double findPower(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * findPower(a,n-1);
        } else {
            return 1/ a * findPower(a, n+1);
        }
    }

    /**
        @getReverse - get reversed list
        @param1 - integer array (array)
        @param2 - integer number (start) reverse start index
        @param3 - integer number (end) reverse end index
        @return - reversed array
    **/
    public static void getReverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        getReverse(arr, start+1, end-1);
    }

    /**
     @findDigit - checking for a digit
     @param - string (s)
     @return - void method, but output "Yes/No"
     **/
    public static void findDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    /**
        @getCoef - find binomial coefficient of two numbers
        @param1 - integer number (n)
        @param2 - integer number (k)
        @return - 1 integer number(binomial coefficient)
    */
    public static int getCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return getCoef(n-1, k-1) + getCoef(n-1, k);
        }
    }
}
