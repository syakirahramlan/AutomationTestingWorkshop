package JavaProgram;

public class Circle {
	
	private double radius; //radius of the circle
	private String color; //color of the circle
	
	//constructor to initialize the circle object with the properties
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	//To calculate the area of the circle
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	// main method to test the circle
	public static void main(String[] args) {
	//Create a circle object
	Circle myCircle = new Circle(30,"White");
	
	//Calculate area
	double areaOfCircle = myCircle.calculateArea();
	 //To print the properties of the circle and the area
	 System.out.println("Radius: " + myCircle.getRadius());
     System.out.println("Color: " + myCircle.getColor());
     System.out.println("Area of circle: " + areaOfCircle);
 }
	//to get the value of radius
	public double getRadius() {
        return radius;
    }
	//to modify the value of radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //to get the color
    public String getColor() {
        return color;
    }
    //to modify the  color
    public void setColor(String color) {
        this.color = color;
    }
}


