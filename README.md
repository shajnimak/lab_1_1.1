# lab_1_1.1 Mutigolla Shadyman SE-2217
# Navigation:

        Entering 1: finding minimum of the numbers.
        Entering 2: finding average of the numbers.
        Entering 3: finding type of the number.
        Entering 4: finding factorial of the number.
        Entering 5: finding the n-th element in fibonacci sequence.
        Entering 6: finding a^n.
        Entering 7: displaying the array in reverse order.
        Entering 8: checking the string for the content only of digits.
        Entering 9: finding binomial coefficient.
        Entering 10: finding gcd of the numbers.


# Task 1

**Description**: _Return the minimum value of an array._

> **Explanation**: Given the ability to create an array and compares each element of the array.

**Solution**:
      
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
    
# Task 2

**Description**: _To find the average of array._

> **Explanation**: Given the opportunity to create an array and sums all the elements of the array. Then divides the sum by the number of elements.

**Solution**:
      
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
    
# Task 3

**Description**: _Checks for a prime._

> **Explanation**: A number must not be divisible by numbers other than itself and 1.

**Solution**:
      
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
    
# Task 4

**Description**: _Find factorial of number._

> **Explanation**: Multiplies by every number up to it, including itself and except for 0 and 1.

**Solution**:
      
        public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * findFactorial(n-1);
        }
    }
    
# Task 5

**Description**: _Find Fibonacci of number._

> **Explanation**: Sums up to the whole number up to it, except for 0.

**Solution**:
      
        public static int findFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return findFibonacci(n-1) + findFibonacci(n-2);
        }
    }
    
# Task 6

**Description**: _Find the power of two numbers._

> **Explanation**: Multiplies a by itself n times.

**Solution**:
      
        public static double findPower(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * findPower(a,n-1);
        } else {
            return 1/ a * findPower(a, n+1);
        }
    } 
     
# Task 7

**Description**: _Get reversed array._

> **Explanation**: Swaps objects from start++ to end--.

**Solution**:
      
        public static void getReverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        getReverse(arr, start+1, end-1);
    }

# Task 8

**Description**: _Checking for a digit._

> **Explanation**: Checks each element of a string for a digit.

**Solution**:
      
        public static void findDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    
# Task 9

**Description**: _Find binomial coefficient of two numbers._

> **Explanation**: Plus every possible connection between two numbers.

**Solution**:
      
        public static int getCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return getCoef(n-1, k-1) + getCoef(n-1, k);
        }
    }
    
# Task 10

**Description**: _Find gcd of 2 numbers._

> **Explanation**: The formula for finding the GCD is implemented.

**Solution**:
      
        public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGcd(b, a % b);
        }
    }
