package sarhan_java;

import java.io.Console;

public abstract class AbstractTask {
	
	protected final Console console =  System.console();
	protected final String welcomingStringFormat = "Пожалуйста, введите %s:";
	protected final String warningString = "Пожалуйста, введите корректное значение!";
	protected final String valueInfoString = "Вы ввели: %s";

	abstract protected void validateInputValue(String inputString);

	abstract protected void executeTask();

	protected String getInputValueAndDisplay(String variableTypeString) {
		System.out.println(String.format(welcomingStringFormat, variableTypeString));
		String inputString = console.readLine();
		System.out.println(String.format(valueInfoString, inputString));
		return inputString;
	}
}
