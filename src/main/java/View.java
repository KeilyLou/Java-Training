import java.util.ArrayList;

/**
 * Created by Анна on 30/10/2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_ESTIMATED_NUMBER = "Введіть передбачуване значення: ";
    public static final String WRONG_INPUT_DATA = "Ввeдіть число!";
    public static final String WRONG_NUMBER = "Не вгадали!";
    public static final String LESS_NUMBER = "Загадане число менше!";
    public static final String MORE_NUMBER = "Загадане число більше!";
    public static final String RIGHT_NUMBER = "Вгадали!";
    public static final String RANGE = "Діапазон: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String firstMessage, String secondMessage) {
        printMessage(firstMessage);
        printMessage(secondMessage);
    }

    public void printMessageAndInts(String message, int firstValue, int secondValue) {
        System.out.println(message + firstValue + " - " + secondValue);
    }

    public void printUserNumbers(ArrayList<Integer> userNumbers){
        for(int i = 0; i < userNumbers.size(); i++) {
            System.out.print(userNumbers.get(i) + " ");
        }
    }
}
