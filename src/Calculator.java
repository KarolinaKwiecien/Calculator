import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator user = new Calculator();

        user.enterLogin();
        user.enterPassword();
        user.showMenu();
        user.choiceMenu();
    }

    Scanner scanner = new Scanner(System.in);

    public void enterLogin() {
        String correctLogin = "Akademia Kodu";
        String loginEntered;
        do {
            System.out.println("Login: ");
            loginEntered = scanner.nextLine();
            if (!(loginEntered.equals(correctLogin))) {
                System.out.println("Incorrect login! Try again!");
            } else {
                System.out.println("Correct!");
            }
        } while (!(loginEntered.equals(correctLogin)));

    }

    public void enterPassword() {
        String correctPassword = "12345";
        String passwordEntered;
        do {
            System.out.println("Password: ");
            passwordEntered = scanner.nextLine();
            if (!(passwordEntered.equals(correctPassword))) {
                System.out.println("Incorrect password! Try again!");
            } else {
                System.out.println("Correct! Welcome!\n");
            }
        } while (!(passwordEntered.equals(correctPassword)));
    }

    public void showMenu() {
        System.out.println("What whould you like to do?");
        System.out.println("1-addition");
        System.out.println("2-substraction");
        System.out.println("3-multiplication");
        System.out.println("4-division");
        System.out.println("5-root");
        System.out.println("6-exponentation");
        System.out.println("7-average of numbers");
        System.out.println("8-calculate median");
        System.out.println("9-convert to numeric system");
        System.out.println("0-back to MENU \n");
    }

    public void choiceMenu() {
        System.out.println("Chose a number:");
        String choiceNumber = scanner.nextLine();

        switch (choiceNumber) {
            case "1":
                add();
                break;
            case "2":
                substract();
                break;
            case "3":
                multiply();
                break;
            case "4":
                divide();
                break;
            case "5":
                calculateRoot();
                break;
            case "6":
                exponentiation();
                break;
            case "7":
                calculateAverage();
                break;
            case "8":
                calculateMedian();
            case "9":
                choiceMenuOfConvertNumberSystem();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                choiceMenu();
        }
    }

    public void add() {
        System.out.println("Enter a numbers to add: ");
        String enterNumbers = scanner.nextLine();
        enterNumbers.trim();
        enterNumbers = enterNumbers.replace(",", ".");
        String[] arrayOfEnterNumbers = enterNumbers.split(" ");

        double counter = 0;
        for (int i = 0; i < arrayOfEnterNumbers.length; i++) {
            double number = Double.valueOf(arrayOfEnterNumbers[i]);
            counter += number;
        }
        System.out.println("Result: " + counter + " \n Would you like try again?\n  *Press 1\nBack to MENU:\n  *Press 0");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                add();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                showMenu();
                choiceMenu();
        }
    }

    public void substract() {
        System.out.println("Enter a numbers to substract: ");
        String enterNumbers = scanner.nextLine();
        enterNumbers.trim();
        enterNumbers = enterNumbers.replace(",", ".");
        String[] arrayOfString = enterNumbers.split(" ");

        double[] arrayOfDoubles = new double[arrayOfString.length];
        double counter = arrayOfDoubles[0];

        for (int i = 0; i < arrayOfString.length; i++) {
            arrayOfDoubles[i] = Double.parseDouble(arrayOfString[i]);
            if (i == 0) {
                counter = arrayOfDoubles[0];
            } else {
                counter -= arrayOfDoubles[i];
            }
        }
        System.out.println("Result: " + counter + " \n Would you like try again?\n  *Press 1\nBack to MENU:\n  *Press 0");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                substract();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                showMenu();
                choiceMenu();
        }
    }

    public void multiply() {
        System.out.println("Enter a numbers to multiply: ");
        String enterNumbers = scanner.nextLine();
        enterNumbers.trim();
        enterNumbers = enterNumbers.replace(",", ".");
        String[] arrayOfEnterNumbers = enterNumbers.split(" ");

        double counter = 1;
        for (int i = 0; i < arrayOfEnterNumbers.length; i++) {

            double number = Double.valueOf(arrayOfEnterNumbers[i]);
            counter *= number;
        }
        System.out.println("Result: " + counter + " \n Would you like to try again?\n  *Press 1\nBack to MENU:\n  *Press 0");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                multiply();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                showMenu();
                choiceMenu();
        }
    }

    public void divide() {
        System.out.println("Enter a numbers to divide: ");
        String enterNumbers = scanner.nextLine();
        enterNumbers.trim();
        enterNumbers = enterNumbers.replace(",", ".");
        String[] arrayOfString = enterNumbers.split(" ");

        double[] arrayOfDouble = new double[arrayOfString.length];
        double counter = arrayOfDouble[0];

        for (int i = 0; i < arrayOfString.length; i++) {
            arrayOfDouble[i] = Double.parseDouble(arrayOfString[i]);
            if (arrayOfString[i].equals("0")) {
                System.out.println("Don't multiply by \"0\"");
                divide();
            } else if (i == 0) {
                counter = arrayOfDouble[0];
            } else {
                counter /= arrayOfDouble[i];
            }
        }
        System.out.println("Result: " + counter + " \n Would you like to try again?\n  *Press 1\nBack to MENU:\n  *Press 0");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                divide();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                showMenu();
                choiceMenu();
        }
    }

    public void calculateRoot() {
        System.out.println("Enter the nummber to calculate the root:");
        String enterRoot = scanner.nextLine();
        enterRoot.trim();
        enterRoot = enterRoot.replace(",", ".");
        float convertEnterRoot = Float.valueOf(enterRoot);

        System.out.println("Enter a level of root:");
        String enterLevelOfRoot = scanner.nextLine();
        enterLevelOfRoot.trim();
        enterLevelOfRoot = enterLevelOfRoot.replace(",", ".");
        float convertLevelOfRoot = Float.valueOf(enterLevelOfRoot);

        if (convertEnterRoot > 0) {
            if (convertLevelOfRoot % 2 == 0) {
                float resultOfFloat = ((float) 1.0) / ((float) convertLevelOfRoot);
                System.out.println("Result: " + Math.pow(convertEnterRoot, resultOfFloat));
            } else {
                double resultOfDouble = ((double) 1.0) / ((double) convertLevelOfRoot);
                System.out.println("Result: " + Math.pow(convertEnterRoot, resultOfDouble));
            }
        } else {
            if (convertLevelOfRoot % 2 == 0) {
                System.out.println("With negative numbers, you can not use an even number");
            } else {
                double plusNumber = convertEnterRoot * (-2);
                double plusNumber1 = convertEnterRoot + plusNumber;
                double resultOfDouble = ((double) 1.0) / ((double) convertLevelOfRoot);
                System.out.println("Result: -" + Math.pow(plusNumber1, resultOfDouble));
            }
        }
        System.out.println("\nWould you like to try again?\n  *Press 1\nBack to MENU:\n  *Press 0");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                calculateRoot();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                showMenu();
                choiceMenu();
        }
    }

    public void exponentiation() {
        System.out.println("Enter the number to calculate a power of number:");
        String enterNumber = scanner.nextLine();
        enterNumber.trim();
        enterNumber = enterNumber.replace(",", ".");
        double convertEnterNumber = Double.valueOf(enterNumber);

        System.out.println("Enter the level of power:");
        String enterLevelOfPower = scanner.nextLine();
        enterLevelOfPower.trim();
        enterLevelOfPower = enterLevelOfPower.replace(",", ".");
        int convertLevelOfPower = Integer.valueOf(enterLevelOfPower);

        double result = 1;
        for (int i = convertLevelOfPower; i > 0; i--) {
            result *= convertEnterNumber;
        }
        System.out.println(result);

        System.out.println("Result: " + result + " \n Would you like to try again?\n  *Press 1\nBack to MENU:\n  *Press 0");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                exponentiation();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                showMenu();
                choiceMenu();
        }
    }

    public void calculateAverage() {
        System.out.println("Enter a numbers: ");
        String enterNumbers = scanner.nextLine();
        enterNumbers.trim();
        enterNumbers = enterNumbers.replace(",", ".");
        String[] arrayOfEnterNumbers = enterNumbers.split(" ");

        double counter = 0;
        for (int i = 0; i < arrayOfEnterNumbers.length; i++) {
            double number = Double.valueOf(arrayOfEnterNumbers[i]);
            counter += number / arrayOfEnterNumbers.length;
        }
        System.out.println("Result: " + counter + " \n Would you like try again?\n  *Press 1\nBack to MENU:\n  *Press 0");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                calculateAverage();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                showMenu();
                choiceMenu();
        }
    }

    public void calculateMedian() {
        System.out.println("Enter a numbers to calculate a median: ");
        String enterNumbers = scanner.nextLine();
        enterNumbers.trim();
        enterNumbers = enterNumbers.replace(",", ".");
        String[] arrayOfEnterNumbers = enterNumbers.split(" ");

        double[] array = new double[arrayOfEnterNumbers.length];

        for (int i = 0; i < arrayOfEnterNumbers.length; i++) {
            double number = Double.valueOf(arrayOfEnterNumbers[i]);
            array[i] = number;
        }
        double mediana = 0;
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            mediana = (array[array.length / 2] + array[(array.length / 2) + 1]) / 2.0;
        } else {
            mediana = array[array.length / 2];
        }

        System.out.println("Result: " + mediana + " \n Would you like try again?\n  *Press 1\nBack to MENU:\n  *Press 0");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                calculateMedian();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                showMenu();
                choiceMenu();
        }
    }

    public void choiceMenuOfConvertNumberSystem() {
        System.out.println("What kind of number system would you like to convert?");
        System.out.println(" 1-Binary \n 2-Hex \n 3-Octal \n 0-back to MENU");
        String userChoise = scanner.nextLine();

        switch (userChoise) {
            case "1":
                convertToBinary();
                break;
            case "2":
                covertToHex();
                break;
            case "3":
                convertToOctal();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                choiceMenuOfConvertNumberSystem();
        }
    }

    public void convertToBinary() {
        System.out.println("Enter the number:");
        String userNumber = scanner.nextLine();
        int convertUserNumber = Integer.valueOf(userNumber);

        System.out.println("Result: " + Integer.toBinaryString(convertUserNumber) + " \n Would you like try again?\n  *Press 1\nBack to MENU:\n  *Press 0");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                convertToBinary();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                showMenu();
                choiceMenu();
        }
    }

    public void covertToHex() {
        System.out.println("Enter the number:");
        String userNumber = scanner.nextLine();
        int convertUserNumber = Integer.valueOf(userNumber);

        System.out.println("Result: " + Integer.toHexString(convertUserNumber) + " \n Would you like try again?\n  *Press 1\nBack to MENU:\n  *Press 0");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                covertToHex();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                showMenu();
                choiceMenu();
        }
    }

    public void convertToOctal() {
        System.out.println("Enter the number:");
        String userNumber = scanner.nextLine();
        int convertUserNumber = Integer.valueOf(userNumber);

        System.out.println("Result: " + Integer.toOctalString(convertUserNumber) + " \n Would you like try again?\n  *Press 1\nBack to MENU:\n  *Press 0");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                convertToOctal();
                break;
            case "0":
                showMenu();
                choiceMenu();
                break;
            default:
                System.out.println("Incorrect number!\n");
                showMenu();
                choiceMenu();
        }
    }
}