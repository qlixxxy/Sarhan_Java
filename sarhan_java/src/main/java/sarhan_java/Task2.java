package sarhan_java;

public class Task2 extends AbstractTask {

    private final String resultStringFormat = "Привет, %s";
	private final String comparedString = "Вячеслав";
	private final String noSuchNameString = "Нет такого имени";
	private final String variableTypeString = "строку, содержащую имя";
	private final String regexPatternString = "^[А-Я][а-я]+";
	private String inputString;

	private void checkName(String nameString) {
		if (nameString.equals(comparedString)) {
			System.out.println(String.format(resultStringFormat, nameString));
		} else {
			System.out.println(noSuchNameString);
		}
	}

	@Override
	protected void validateInputValue(String inputString) {
		if (inputString.matches(regexPatternString)) {
			this.inputString = inputString;
		} else {
			System.out.println(warningString);
			validateInputValue(getInputValueAndDisplay(variableTypeString));
		}
	}

	@Override
	protected void executeTask() {
		String inputString = getInputValueAndDisplay(variableTypeString);
		validateInputValue(inputString);
		checkName(this.inputString);
	}
}
