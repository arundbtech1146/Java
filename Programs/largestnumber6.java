package Day7;

public class largestnumber6 {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int temp, size;
		    int array[] = {99, 2100, 290, 613, 768, 587};
		    size = array.length;
		    
		    for(int i3 = 0; i3<size; i3++ ){
		       for(int j = i3+1; j<size; j++){
		          if(array[i3]>array[j]){
		             temp = array[i3];
		             array[i3] = array[j];
		             array[j] = temp;
		          }
		       }
		    }
		    System.out.println("Third largest number is: "+array[size-3]);

		}

	}


