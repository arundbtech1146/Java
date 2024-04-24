package Day6;

public class Day6_Tasks {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			1. Write a Java Program for String Initialization 
			String s = "Program";
//			2. Write a Program to Copy character array to string 
			char c[] = {'a','b','c'};
			String sc = new String(c);
			System.out.println(sc);
//			3. Write a Java Program for String concatenation and String comparison 
			String a = "Java";
			String b = "java";
			System.out.println(a.concat(s));
			System.out.println(a == b);
//			4. Write a Java Program for Comparing StringBuffer with a String
			StringBuffer sb = new StringBuffer("python");
			String p = "python";
			System.out.println(sb.equals(p));
			
//			5. Write a Program for Getting byte array from a string 
			 String originalString = "Hello, world!";
		        byte[] byteArray = originalString.getBytes();
		        System.out.println("Byte array from the string:");
		        for (byte e : byteArray) {
		            System.out.print(e + " ");
		        }
		        
//		        6. Write a Java Program for String indexOf() method 
		        String string = "hello world";
		        System.out.println("\n"+string.indexOf('o'));
		        
//		        7. Write a Program for String lastindexOf() method
		        System.out.println(string.lastIndexOf('o'));
		        
//		        8. Write a Java Program for String startsWith() method and String endsWith() method
		        System.out.println(string.startsWith("hello"));
		        System.out.println(string.endsWith("o"));
		        
//		        9. Write a Java Program for String split function
		        String inputString = "apple,banana,grape,orange";
		        String[] fruits = inputString.split(",");
		        System.out.println("Split substrings:");
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }
		        
//		        10. Write a Program to Extract char array from string
		        char Chararr[] = string.toCharArray();
		        for(char arr : Chararr) {
		        	System.out.print("'"+arr+"'");
		        }
		        
//		        11. Write a Java Program to Replace characters in a string 
		        System.out.println("\n"+string.replace('h', 'l'));
		        
//		        12. Write a Program to Changing string case and to Trim spaces in string 
		        System.out.println(string.trim());
		        System.out.println(string.toUpperCase());
		        
//		        13. Write a Java Program to match a string with regular expression 
		       
		        
//		        14. Write a Program for to remove multiple space in a string
		        String name = "my     name   is   sumathi";
		    	System.out.println(name.replaceAll("\\s+", " "));
		    	
//		    	15. Write a Java Program for to get line count from a string 
		    	String line = "this is a para \n paragraph \n sumathi";
		    	String v[] = line.split("\n");
		    	System.out.println(v.length);
		}
	}


