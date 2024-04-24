package Day3;

import java.util.Scanner;
public class Pattern2 {
	
	public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = s.nextInt();
        s.close();
        for(int i = 1; i<=num; i++){
            for(int j = num; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
  }


}
