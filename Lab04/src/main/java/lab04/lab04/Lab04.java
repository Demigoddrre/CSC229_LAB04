/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab04.lab04;

/**
 *
 * @author dandr
 */
public class Lab04 {
public void countDown(int num) {
if (num == 0) // test
System.out.println("Blastoff!");
else {
if (num % 2 == 0) // check if num is even
System.out.println(num);
System.out.println("...");
countDown(num-1); // recursive call
}
}

//The time complexity of this algorithm is O(n), where n is the value of the input num. 
//This is because the function calls itself recursively n times, 
//decrementing the input value by 1 each time until it reaches the base case of num = 0. 
//as each function call is added to the call stack until the base case is reached.


public int gcd(int x, int y) {
if (x == y) //base case
return x;
else if (x < y)
return gcd(y, x); //swap x and y
else
return gcd(x - y, y); //use subtraction instead of modulo
}
//The time complexity of the Euclidean algorithm used in this code to find the GCD is O(log min(x,y))
//This is because the algorithm takes advantage of the property that the GCD of two numbers is equal 
//to the GCD of the smaller number and the difference between the two numbers.

public int fib(int n)

{

       if (n <= 0) // base case

            return 0;

      else if (n == 1) // base case

             return 1;

       else

             return fib(n - 1) + fib(n - 2);

}
//The time complexity of the Fibonacci algorithm is O(2^n), where n is the input value. 
//This is because each recursive call to the function creates two new recursive calls, 
//which results in an exponential increase in the number of function calls.

public static void helloWorld(int n) {
    if (n > 0) {
        System.out.println("Hello World");
        helloWorld(n-1);
    }
}

//Function to print "Hello World" n times recursively. 
//every function call reduces n by 1 untill base case is met.

public static int sumMultiplesOfSeven(int n1, int n2) {
    if (n2 < n1) {
        return 0;
    } else if (n2 % 7 == 0) {
        return n2 + sumMultiplesOfSeven(n1, n2-7);
    } else {
        return sumMultiplesOfSeven(n1, n2-1);
    }
}
//Function to return the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.

public static int binarySearch(int[] arr, int x, int low, int high) {
    if (low > high) {
        return -1;
    }
    int mid = (low + high) / 2;
    if (arr[mid] == x) {
        return mid;
    } else if (arr[mid] > x) {
        return binarySearch(arr, x, low, mid-1);
    } else {
        return binarySearch(arr, x, mid+1, high);
    }
}
//Function to implement the binary search algorithm recursively

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
