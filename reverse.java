
package javaapplication1;


import java.util.Scanner;
public class reverse {
    public static void main(String s[]){
     
        int value,rev=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value : ");
         value =sc.nextInt();
         sc.close();
         
         while(value!=0){                     // for( ;num != 0; )
         
             rev=rev*10;
             rev=rev+value%10;
             value=value/10;
         
         }
         
         System.out.println("the reverse value : "+ rev);
         
    
    
    
    
    
    }
    
}
