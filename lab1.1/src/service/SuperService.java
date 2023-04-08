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


}
