import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This class represents controller object in MVC pattern
 *
 * @version 1.0
 * @autor Anna Samonenko
 */
public class Controller {
    /**
     * The model in MVC pattern
     */
    Model model;

    /**
     * The view in MVC pattern
     */
    View view;

    /**
     * Default constructor
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Starts the game and controls the game flow
     */
    public void play() {
        createRandomNumber();
        int userNumber;
        Scanner sc = new Scanner(System.in);
        do {
            view.printMessage(view.INPUT_ESTIMATED_NUMBER);
            userNumber = getUserNumber(sc);
            while (userNumber > model.getMaxNumber() || userNumber < model.getMinNumber()) {
                view.printMessageAndInts(view.RANGE, model.getMinNumber(), model.getMaxNumber());
                view.printMessage(view.INPUT_ESTIMATED_NUMBER);
                userNumber = getUserNumber(sc);
            }
            checkNumber(userNumber);
            model.getUserNumbers().add(userNumber);
        }
        while (model.getRandomNumber() != userNumber);
        view.printMessage(view.RIGHT_NUMBER);
        view.printUserNumbers((ArrayList) model.getUserNumbers());
    }

    /**
     * Read number entered by user
     *
     * @return user's entered number
     */
    public int getUserNumber(Scanner sc) {
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_DATA, view.INPUT_ESTIMATED_NUMBER);
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * Create random number
     */
    public void createRandomNumber() {
        Random random = new Random();
        model.setRandomNumber(random.nextInt(100) + 1);
    }

    /**
     * Number checking
     *
     * @param userNumber is the user's input numbers
     */
    public void checkNumber(int userNumber) {
        if (userNumber < model.getRandomNumber()) {
            model.setMinNumber(userNumber);
            view.printMessage(view.WRONG_NUMBER, view.MORE_NUMBER);
            view.printMessageAndInts(view.RANGE, model.getMinNumber(), model.getMaxNumber());
        } else if (userNumber > model.getRandomNumber()) {
            model.setMaxNumber(userNumber);
            view.printMessage(view.WRONG_NUMBER, view.LESS_NUMBER);
            view.printMessageAndInts(view.RANGE, model.getMinNumber(), model.getMaxNumber());
        }
    }
}
