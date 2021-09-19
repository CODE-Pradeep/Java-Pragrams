/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class primecheck {
    public static void main(String s[]){
    
        int temp;
        boolean isPrime=true;
        int i;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter the value : ");
        
        int value = sc.nextInt();
        sc.close();
        
        for ( i=2;i<=value/2;i++){
         
        temp=value%i;
        
        if(temp==0)
        {
        isPrime=false;
        break;
            
        }
       
    }
        if(isPrime)
            System.out.println("is a prime number");
        else
            System.out.println("is not a prime number");
    
    
    
    }
}
