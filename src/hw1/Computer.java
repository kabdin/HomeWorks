package hw1;

public class Computer {
	
//variables	
	int memory;
	double screenSize;
	String brand;
	int cpuNum;
	
    static float location; 
    static int count;
    static char newLine = '\n';
    
//Constructors
	public Computer() {};
	
	public Computer(int memory, double screenSize, String brand)	{
	this.memory=memory;
	this.screenSize=screenSize;
	this.brand=brand;
	increment();
//	int cpuNum= increment();
	System.out.println("Memory: " + memory + "gb" + newLine + "Screen Size: " + screenSize + " inches" + newLine + "Brand: " + brand + newLine + "This is computer" + count + newLine);
}
	
	public Computer(String brand) {
		this.brand=brand;
		System.out.println(brand + " Computers " + "but enter ram size, scrensize, and brand");	
		}
	

//methods
	public void powersOn(boolean power) {
		
		if (power == true) {
			System.out.println("Computer works");}
		else {
			System.out.println("Does not work");
		}
		}
	
	public static void showStoreNum(float location) {
		System.out.println("Store num: " + location);
	}
	
	
	public void showLocation() {
		System.out.println("Location: " + location);
	}
	
	public void showLocationVar() {
	System.out.println(Computer.location);
}
	public void increment() {
		count++;
	}
	
	public void whichNumCpu() {
		
			System.out.println("Comp numb: " + cpuNum);
	}}
