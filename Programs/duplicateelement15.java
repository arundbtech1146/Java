package Day7;

public class duplicateelement15 {
	
		public static int removeDuplicates(int a[], int n)
	    {
	        if (n == 0 || n == 1) {
	            return n;
	        }
	        int j = 0;
	        for (int i = 0; i < n - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                a[j++] = a[i];
	            }
	        }
	        a[j++] = a[n - 1];
	        return j;
	    }
	    public static void main(String[] args)
	    {
	        int a[] = { 1,2,2,3,3,4,5,6,6,7,7 };
	        int n = a.length;
	        int j=0;
	        j = removeDuplicates(a, n);
	        for (int i = 0; i < j; i++) {
	            System.out.print(a[i] + " ");}
	    }
	}


