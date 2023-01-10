package csw;

public class ArithmeticOperators {

		public static void main(String args[]){
		 int x = 20;
		 int y = 15;
		 ArithmeticOperators ao = new ArithmeticOperators();
		 int additionResult = ao.doAddition(x,y);
		 int subtractionResult = ao.doSubtraction(x, y);
		 int divisionResult = ao.doDivision(x, y);
		 int multiplicationResult = ao.doMultiplication(x, y);
		 int remainderResult = ao.doRemainder(x, y);
			 	 System.out.println("Addition Result = " + additionResult + "\nSubtraction Result= " + subtractionResult + "\nDivision Result = " + divisionResult + "\nMultiplication Result = " + multiplicationResult + "\nRemainder Result = " + remainderResult);
		}
		public Integer doAddition(int x, int y){
			 	 return x + y;
		}
		public Integer doSubtraction(int x, int y){
		 return x - y;
		}
		public Integer doDivision(int x, int y){
		 return x / y;
		}
		public Integer doMultiplication(int x, int y){
		 return x * y;
		}
		public Integer doRemainder(int x, int y){
		 return x % y;
		}
}
