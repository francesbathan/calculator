class Calculator implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double total;
	
	public Calculator() {
	}

	public Calculator(double operandOne, double operandTwo, String operation) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;

		}
	
	public void setOperandOne(double firstOperand) {
		this.operandOne = firstOperand;
	}
	
	public void setOperandTwo(double secondOperand) {
		this.operandTwo = secondOperand;
	}
	
	public void setOperation(String newOperation) {
		this.operation = newOperation;
	}
	
	public void performOperation() {
		if(operation == "+") {
			total = operandOne + operandTwo;
		}
		if(operation == "-") {
			total = operandOne - operandTwo;
		}
	}
	
	public double getResults() {
		return total;
	}
}