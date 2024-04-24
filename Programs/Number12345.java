package Day3;


import java.util.Scanner;

public class Number12345

{  

   public static void printNumPattern(int n)  

       {  

           int i, j;  

           for(i=1; i<=n; i++)  

           {  

               for(j=i; j<=n; j++)  

                   {

                       System.out.print(j);  

                   }

               System.out.println();  

           }  

       }  
 

   public static void main(String args[])  

       {  

           Scanner scanner = new Scanner(System.in);

           System.out.print("Enter n: ");

           int n = scanner.nextInt();

           printNumPattern(n);  

       }  
}  