import java.util.ArrayList;

/**
 * This class represents view object in MVC pattern
 *
 * @version 1.0
 * @autor Anna Samonenko
 */
public class View {
    /**
     * Text's constants
     */
    public static final String INPUT_ESTIMATED_NUMBER = "Введіть передбачуване значення: ";
    public static final String WRONG_INPUT_DATA = "Ввeдіть число!";
    public static final String WRONG_NUMBER = "Не вгадали!";
    public static final String LESS_NUMBER = "Загадане число менше!";
    public static final String MORE_NUMBER = "Загадане число більше!";
    public static final String RIGHT_NUMBER = "Вгадали!";
    public static final String RANGE = "Діапазон: ";

    /**
     * Prints message in console
     *
     * @param message text message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Prints messages in console
     *
     * @param firstMessage  text message
     * @param secondMessage text message
     */
    public void printMessage(String firstMessage, String secondMessage) {
        printMessage(firstMessage);
        printMessage(secondMessage);
    }

    /**
     * Prints messages in console
     *
     * @param message      text message
     * @param firstNumber  is the minimum number in the range
     * @param secondNumber is the maximum number in the range
     */
    public void printMessageAndInts(String message, int firstNumber, int secondNumber) {
        System.out.println(message + firstNumber + " - " + secondNumber);
    }

    /**
     * Prints all user's input numbers
     *
     * @param userNumbers list of user's numbers
     */
    public void printUserNumbers(ArrayList<Integer> userNumbers) {
        for (int i = 0; i < userNumbers.size(); i++) {
            System.out.print(userNumbers.get(i) + " ");
        }
    }
}
