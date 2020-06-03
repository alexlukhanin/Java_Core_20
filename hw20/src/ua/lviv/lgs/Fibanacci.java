package ua.lviv.lgs;

public class Fibanacci {
	/*Algorithm was found on https://www.geeksforgeeks.org/ */
	public static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
	

}
