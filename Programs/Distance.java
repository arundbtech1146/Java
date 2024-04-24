package Day4;

public class Distance {
	
	    // Instance variables
	    private int feet;
	    private int inches;

	    // Constructor
	    public Distance(int feet, int inches) {
	        this.feet = feet;
	        this.inches = inches;
	    }

	    // Getter methods
	    public int getFeet() {
	        return feet;
	    }

	    public int getInches() {
	        return inches;
	    }

	    // Setter methods
	    public void setFeet(int feet) {
	        this.feet = feet;
	    }

	    public void setInches(int inches) {
	        this.inches = inches;
	    }

	    // Method to display distance
	    public void displayDistance() {
	        System.out.println("Distance: " + feet + " feet " + inches + " inches");
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        // Creating an object of Distance class
	        Distance distance = new Distance(5, 6);

	        // Displaying distance
	        distance.displayDistance();

	        // Modifying distance
	        distance.setFeet(7);
	        distance.setInches(10);

	        // Displaying modified distance
	        distance.displayDistance();
	    }
	}



