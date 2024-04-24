package Day7;

public class Twomatrices8 {
	
	    public static void main(String [] ar) {
	    	int m1[] [] = {{8,4} ,{2,5} };
		     int m2[] [] = {{6,5} ,{6,3} };
		     int sumOfMatrix[][] = new int [2][2];
		     for(int i=0; i<2; i++ ) {
		   	  for(int j=0; j<2; j++ ) {
		   		  sumOfMatrix[i] [j] = m1[i][j] + m2[i][j];
		   		  System.out.print(sumOfMatrix[i] [j] + " ");
		   	  }
		   	  System.out.println();
	    }
	}
	}


