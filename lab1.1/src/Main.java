import service.SuperService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("SELECT REQUEST:");
            System.out.println("1. To find the minimum in array");
            System.out.println("2. To find the average of array");
            System.out.println("3. Checks for a prime");
            System.out.println("4. Find factorial of number");
            System.out.println("5. Find Fibonacci of number");
            System.out.println("6. Find the power of two numbers");
            System.out.println("7. Get reversed array");
            System.out.println("8. Checking for a digit");
            System.out.println("9. Find binomial coefficient of two numbers");
            System.out.println("10. Find GCD of 2 numbers");
            int request = scanner.nextInt();
            switch (request){
                case 1:
                    System.out.println("Enter number of objects in the array");
                    SuperService.findMin(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter number of objects in the array");
                    SuperService.findAverage(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Enter Number");
                    SuperService.findIsPrime(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Enter Number");
                    System.out.println(SuperService.findFactorial(scanner.nextInt()));
                    break;
                case 5:
                    System.out.println("Enter Number");
                    System.out.println(SuperService.findFibonacci(scanner.nextInt()));
                    break;
                case 6:
                    System.out.println("Enter Numbers");
                    System.out.println(SuperService.findPower(scanner.nextInt(),scanner.nextInt()));
                    break;
                case 7:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter number of objects in the array");
                    int N = scan.nextInt();
                    int[] array = new int[N];
                    System.out.println("Enter array objects");
                    for (int i = 0; i < N; i++){
                        array[i] = scanner.nextInt();
                    }
                    SuperService.getReverse(array, 0, N-1);
                    for (int i : array){
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Enter string");
                    Scanner scn = new Scanner(System.in);
                    String s = scn.nextLine();
                    SuperService.findDigit(s);
                    break;
                case 9:
                    System.out.println("Enter Numbers");
                    System.out.println(SuperService.getCoef(scanner.nextInt(),scanner.nextInt()));
                    break;
                case 10:
                    System.out.println("Enter Numbers");
                    System.out.println(SuperService.getGcd(scanner.nextInt(),scanner.nextInt()));
                    break;
                default:
                    return;
            }
        }

    }
}