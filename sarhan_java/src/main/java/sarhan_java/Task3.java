package sarhan_java;

import java.util.ArrayList;

public class Task3 extends AbstractTask{

	private final String variableTypeString = "последовательность чисел в форматe: \n1,2,3,4";
	private final String regexArrayPatternString = "^[\\d,]+";
	private String[] inputArray;

	private void divisibleOfArray(String[] inputString) {
		ArrayList resultArray = new ArrayList<Integer>();
		for (String intString : inputString) {
			int i = Integer.valueOf(intString);
			if (i % 3 == 0 && i != 0) {
				resultArray.add(i);
			}
		}
		System.out.println(resultArray);
	}

	@Override
	protected void validateInputValue(String inputString) {
		if (inputString.matches(regexArrayPatternString)) {
			this.inputArray = inputString.split(",");
		} else {
			System.out.println(warningString);
			validateInputValue(getInputValueAndDisplay(variableTypeString));
		}
	}

	@Override
	protected void executeTask() {
		String inputString = getInputValueAndDisplay(variableTypeString);
		validateInputValue(inputString);
		divisibleOfArray(this.inputArray);
	}
}
