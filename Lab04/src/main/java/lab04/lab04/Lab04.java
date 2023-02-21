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
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
