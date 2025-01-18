package fr.Stef.TP1Java;

public class Main {
	public static void main (String [] args) {
		System.out.println("coucou");
		PrintCheckerPattern();
		PrintSquarePattern();
		PrintTriangularPattern();
		PrintStarPattern();
		PrintSheepPattern();
		SixIntegerSum();
		SevenIntegerSum();
		FiveIntegerProduct();
		RectangleComputation();
		ArithmeticTest();
		SumProduct3Numbers();
	}
	public static void PrintCheckerPattern () {
		System.out.println();
		System.out.println("* * * * * ");
		System.out.println(" * * * * * ");
		System.out.println("* * * * * ");
		System.out.println(" * * * * * ");
		System.out.println("* * * * * ");
	}
	public static void PrintSquarePattern() {
		System.out.println();
		System.out.println("* * * * * ");
		System.out.println("*       * ");
		System.out.println("*       * ");
		System.out.println("*       * ");
		System.out.println("* * * * * ");
	}
	public static void PrintTriangularPattern() {
		System.out.println();
		System.out.println("* * * * * * *");
		System.out.println(" *         * ");
		System.out.println("  *       *  ");
		System.out.println("    *   *    ");
		System.out.println("      *      ");
	}
	public static void PrintStarPattern() {
		System.out.println();
		System.out.println("    *     ");
		System.out.println("* *    * * ");
		System.out.println("   * *    ");
		System.out.println("  *   *   ");
		System.out.println(" *     * ");
		
	}
	public static void PrintSheepPattern() {
		System.out.println("          '__'");
		System.out.println("          (oo)");
		System.out.println("  /========//");
		System.out.println(" / || @@ ||");
		System.out.println("*  ||----||");
		System.out.println("   VV    VV");
		System.out.println("   ''    ''");
	}
	public static void SixIntegerSum() {
		int number1 = 11, number2 = 22, number3 = 33, number4 = 44, number5 = 55,number6 = 66,sum;
		sum = number1 + number2 +number3 + number4 +number5 + number6;
		System.out.println(" La somme est : " + sum );
		
	}
	public static void SevenIntegerSum() {
		int number1 = 11, number2 = 22, number3 = 33, number4 = 44, number5 = 55,number6 = 66,number7 = 77,sum;
		sum = number1 + number2 +number3 + number4 +number5 + number6 + number7;
		System.out.println(" La somme est : " + sum );	
	}
	public static void FiveIntegerProduct() {
		int number1 = 11, number2 = 22, number3 = 33, number4 = 44, number5 = 55,product;
		product = number1 * number2 * number3 * number4 * number5 ;
		System.out.println(" La somme est : " + product );
		
	}
	public static void RectangleComputation() {
		double area,perimeter,length = 15,width =10;
		perimeter = length * 2 + width * 2 ;
		area = width*length;
		System.out.println("the area is : " + area + " the perimeter is : " + perimeter );
		
	}
	public static void ArithmeticTest() {     // Save as "ArithmeticTest.java"
		   
		      int number1 = 98; // Declare an int variable number1 and initialize it to 98
		      int number2 = 5;  // Declare an int variable number2 and initialize it to 5
		      int sum, difference, product, quotient, remainder;  // Declare 5 int variables to hold results
		   
		      // Perform arithmetic Operations
		      sum = number1 + number2;
		      difference = number1 - number2;
		      product = number1 * number2;
		      quotient = number1 / number2;
		      remainder = number1 % number2;
		  
		      // Print results
		      System.out.println();
		      System.out.print("The sum, difference, product, quotient and remainder of "+number1+" and "+number2+" are "+sum+", "+difference+", "+product+", "+
		      quotient+", and "+remainder);
		   
		      ++number1;  // Increment the value stored in the variable "number1" by 1
		                  // Same as "number1 = number1 + 1"
		      --number2;  // Decrement the value stored in the variable "number2" by 1
		                  // Same as "number2 = number2 - 1"
		      System.out.println("number1 after increment is " + number1+"number2 after decrement is " + number2);
		      quotient = number1 / number2; 
		      System.out.println("The new quotient of " + number1 + " and " + number2 + " is " + quotient);
		      System.out.println();
		      System.out.println(31*number1+17*number2);
		   
		}
	public static void SumProduct3Numbers() {     // Save as "ArithmeticTest.java"
		   
	      int number1 = 98, number2 = 5,number3 =15;  // Declare an int variable number2 and initialize it to 5
	      int sum, difference, product, quotient, remainder;  // Declare 5 int variables to hold results
	   
	      // Perform arithmetic Operations
	      sum = number1 + number2+number3;
	      difference = number1 - number2;
	      product = number1 * number2*number3;
	      quotient = number1 / number2;
	      remainder = number1 % number2;
	  
	      // Print results
	      System.out.println();
	      System.out.print("The sum, difference, product, quotient and remainder of "+number1+" and "+number2+" are "+sum+", "+difference+", "+product+", "+
	      quotient+", and "+remainder);
	   
	      ++number1;  // Increment the value stored in the variable "number1" by 1
	                  // Same as "number1 = number1 + 1"
	      --number2;  // Decrement the value stored in the variable "number2" by 1
	                  // Same as "number2 = number2 - 1"
	      System.out.println("number1 after increment is " + number1+"number2 after decrement is " + number2);
	      quotient = number1 / number2; 
	      System.out.println("The new quotient of " + number1 + " and " + number2 +" and "+ number3+ " is " + quotient);
	   
	}
	
}
