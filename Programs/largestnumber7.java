package Day7;

public class largestnumber7 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int temp, size;
		    int array[] = {1, 2, 3, 4, 5, 6};
		    size = array.length;
			for(int i = 0; i<size; i++ ){
		         for(int j = i+1; j<size; j++){

		            if(array[i]>array[j]){
		               temp = array[i];
		               array[i] = array[j];
		               array[j] = temp;
		            }
		         }
		      }
		      System.out.println("Second largest number is:: "+array[size-2]);
		}

	}



