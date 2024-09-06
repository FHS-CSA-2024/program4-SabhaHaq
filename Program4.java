//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4 {
     public static void main(String[] args) {
        //variables
        Scanner myScanner = new Scanner (System.in); 
         int num1 = 0; 
         int num2 = 0; 
         int num3 = 0;
         int num4 = 0; 
         
         
        System.out.println("Please enter number 1");
        num1 = myScanner.nextInt();
        System.out.println("Please enter number 2");
        num2 = myScanner.nextInt();
        System.out.println("Please enter number 3");
        num3  = myScanner.nextInt();
        System.out.println("Please enter number 4");
        num4 = myScanner.nextInt();
        
        
        int sum = (num1+num2+num3+num4); 
        double average = (sum)/4.0;
        
        
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println("");
        System.out.println("The average of the four numbers is " + average);
}
}
         
    
     
     //Paste console output below:
/*
The sum of the four numbers is 2227
     
The average of the four numbers is 556.75
