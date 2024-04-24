package Day4;

	
	   

	    class Calling {
	    	int value;
	    	Calling (int value){
	    		this.value=value;
	    	 }
	    	Calling (){
	    		this(20);
	    	}

	     public static void main(String[] args) {
	    	 Calling  s = new Calling (10);
	    	 Calling  sc = new Calling ();
	    	 System.out.println("the value of a:"+s.value);
	    	 System.out.println("the value of b:"+sc.value);
	     }
	    }
	


