
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator newLogic = new Calculator();
		
		newLogic.setOperandOne(10.5);
		newLogic.setOperandTwo(5.2);
		newLogic.setOperation("+");
		newLogic.performOperation();
		System.out.println(newLogic.getResults());
	}

}
