package Day7;

public class Fibonacciseries1 {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int count = 10;
			int i=1;
			int n1=0;
			int n2=1;
			while (i<=count) {
				int Nextterm=n1+n2;
				System.out.print(n1+" ");
				n1=n2;
				n2=Nextterm;
				i++;
		}
		}
	}
			
