public class sumit {
	
  // instance variables
  private double one, two, sum;
  
  // use the two parameters to set the values of your two instance variables
  public void setNums(double num1, double num2) {
	  one = num1;
	  two = num2;

  }
  
  // sum the two numbers here
  public void sum() {
	  sum = one + two;
  }
  
  // print the sum here
  public void print() {
	  System.out.println(sum);
  }
  
  
  public static void main(String[] args) {
	  sumit runner = new sumit();
	  
	  // should print out 12
	  runner.setNums(5,  7);
	  runner.sum();
	  runner.print();
	  
	  // should print out 40
	  runner.setNums(13, 27);
	  runner.sum();
	  runner.print();
  }
  
}