import java.util.Scanner;
public class SimpleCalculations {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

System.out.println("Enter your first number: ");
int firstNumber = scanner.nextInt();

System.out.println("Enter your second number: ");
int secondNumber = scanner.nextInt();


System.out.println("Enter an operator (+ or / or - or *): ");
String operator = scanner.nextInt();

scanner.close();

int addition = firstNumber + secondNumber;

int subtraction = firstNumber - secondNumber;
int subtractionR = secondNumber - firstNumber;

int division = firstNumber / secondNumber;
int divisionR = secondNumber / firstNumber;

int multiplication = firstNumber * secondNumber;

if (operator == "+"){
	System.out.println(addition);
}
else if (firstNumber >= secondNumber && operator == "-"){
	System.out.println(subtraction);
}
else if (secondNumber >= firstNumber && operator == "-"){
	System.out.println(subtractionR);
}
else if (firstNumber >= secondNumber && operator == "/"){
	System.out.println(division);
}
else if (firstNumber <= secondNumber && operator == "-"){
	System.out.println(subtractionR);
}
else if (firstNumber > secondNumber && operator == "*"){
	System.out.println(multiplication);
}
else 
	System.out.println("Entry is not valid, calculation cannot be made");
}

	