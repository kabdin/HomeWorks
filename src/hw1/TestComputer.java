package hw1;

public class TestComputer {

	public static void main(String[] args) {
		Computer cpu =new Computer(8, 15.6, "Dell");
		cpu.powersOn(true);
		
		System.out.println(Computer.newLine);
		
//		cpu.whichNumCpu();
		Computer cpu2=new Computer(16, 13.3, "Apple");
		cpu2.powersOn(false);
		
		
		cpu2.showStoreNum(7);
		cpu2.showLocationVar();
//      	Computer.showLocation();
		Computer.showStoreNum(3.7f);
		
		cpu2.whichNumCpu();
		cpu.whichNumCpu();
		
		Computer cpu3 = new Computer("ASUS");
		
		
		//static variables
//		cpu.location=4;
//		cpu3.location=3;
		Computer.location=6;
		cpu.showLocationVar();
		cpu3.showLocationVar();
		

		

        cpu2.brand= "HP";
//      	Computer.location=3;
      	cpu2.showLocationVar();
		
	}

}


/* we should use non-static members if they are specific to each object so as to
 assign unqiue values to an object 
 
  Use static variables if they should be shared among all objects, e.g. a variable to 
  keep track the number of instances, a constant, etc.
  
  Use static methods if they do not depend on states of any objects, e.g. utility methods
  that do calculation.
  
 */
  
