import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Анна on 30/10/2016.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

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
        view.printUserNumbers((ArrayList)model.getUserNumbers());
    }

    public int getUserNumber(Scanner sc) {
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_DATA, view.INPUT_ESTIMATED_NUMBER);
            sc.next();
        }
        return sc.nextInt();
    }

    public void createRandomNumber(){
        Random random = new Random();
        model.setRandomNumber(random.nextInt(100) + 1);
    }

    public void checkNumber(int userNumber){
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
