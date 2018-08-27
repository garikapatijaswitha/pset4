/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	 static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
         
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
 
   public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);	
        int n=sc.nextInt();
        if (isPowerOfTwo(n))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
 
