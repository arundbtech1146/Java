package Day7;

public class oddandeven10 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[] = {1,2,3,4,5,6,7,8};
			System.out.println("even numbers are:");
				for(int i = 0; i<arr.length; i++) {
					if(i % 2 == 1) {
						System.out.print(arr[i] + " ");
					}
				}System.out.println();
				System.out.println("Odd numbers are:");
				for(int i = 0; i<arr.length; i++) {
					if(i % 2 == 0) {
						System.out.print(arr[i]  + " ");
					}
				}
		}

	}



