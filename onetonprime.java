/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author prk
 */
public class onetonprime {
    
    public static void main(String s[]){
    
        int temp;
        boolean isPrime=true;
        
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter the value : ");
        
        int value = sc.nextInt();
        sc.close();
       
       int i =0;
       int num =0;
       
       
       String  primeNumbers = "";

       for (i = 1; i <= value; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers  are :");
       System.out.println(primeNumbers);
   }
}
    
    

