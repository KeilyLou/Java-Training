import java.util.ArrayList;
import java.util.List;

/**
 * Created by Анна on 30/10/2016.
 */
public class Model {
    private int randomNumber;
    private int minNumber = 0;
    private int maxNumber = 100;
    private List<Integer> userNumbers;

    public Model(){
        userNumbers = new ArrayList();
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(List<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }
}
