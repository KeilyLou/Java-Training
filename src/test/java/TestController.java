import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * This class for test program
 *
 * @version 1.0
 * @autor Anna Samonenko
 */
public class TestController {
    Model model;
    View view;
    Controller controller;

    @Before
    public void init() {
        model = new Model();
        view = new View();
        controller = new Controller(model, view);
    }

    @After
    public void tearDown() {
        model = null;
        view = null;
        controller = null;
    }

    @Test
    public void TestCheckNumber() {
        model.setRandomNumber(18);
        controller.checkNumber(20);
        assertEquals(model.getMaxNumber(), 20);

        controller.checkNumber(3);
        assertEquals(model.getMinNumber(), 3);
    }

    @Test
    public void TestAddToListOfUserNumbers() {
        int[] testUserNumber = {65, 30, 45};
        for (int i = 0; i < testUserNumber.length; i++) {
            model.getUserNumbers().add(testUserNumber[i]);
        }
        List<Integer> actualList = model.getUserNumbers();
        assertArrayEquals(actualList.toArray(), actualList.toArray());
    }
}
