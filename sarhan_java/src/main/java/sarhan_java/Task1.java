package sarhan_java;

public class Task1 extends AbstractTask{

	private final int comparedInt = 7;
	private final String resultString = "Привет!";
	private final String variableTypeString = "число";
	private int inputInt;
    
	private void compareNumber(int num) {
		if (num > comparedInt) {
			System.out.println(resultString);
		}
	}

	@Override
	protected void validateInputValue(String inputString) {
		try {
			this.inputInt = Integer.parseInt(inputString);
		} catch (NumberFormatException e) {
			System.out.println(warningString);
			validateInputValue(getInputValueAndDisplay(variableTypeString));
		}
	}

	@Override
	protected void executeTask() {
		String inputString = getInputValueAndDisplay(variableTypeString);
		validateInputValue(inputString);
		compareNumber(this.inputInt);
	}
}
