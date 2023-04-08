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
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
            if (min>array[i])
                min = array[i];
        }
        System.out.println(min);
    }
}
