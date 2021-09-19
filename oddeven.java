
package javaapplication1;

import java.util.Scanner;

public class oddeven {
    public static void main(String s[]){
        int value;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter the value :");
         value = sc.nextInt();
         sc.close();
         
         if(value%2==0)
             System.out.println("value is even");
         else
             System.out.println("value is odd");
        
        




    }
    
}
