package Day7;

public class transposmatrix11 {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int m1[][] = { {11,12,13}, {14,15,16}, {17,18,19} };
			int transpose[][]=new int[3][3];  //3 rows and 3 columns   
			for(int i=0;i<3;i++){    
				for(int j=0;j<3;j++){    
					transpose[i][j]=m1[j][i];  
				}    
			}    
			System.out.println("before transpose:");  
			for(int i=0;i<3;i++){    
				for(int j=0;j<3;j++){    
					System.out.print(m1[i][j]+" ");    
				}    
				System.out.println();//new line    
	         }    
			System.out.println("After Transpose:");  
			for(int i=0;i<3;i++){    
				for(int j=0;j<3;j++){    
					System.out.print(transpose[i][j]+" ");    
			    }    
			    System.out.println()  ;
			}    

		}

	}


