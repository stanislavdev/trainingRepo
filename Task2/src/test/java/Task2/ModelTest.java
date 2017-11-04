package Task2;

import jdk.nashorn.internal.ir.annotations.Ignore;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;

/**
 * Unit test for Model.
 */
public class ModelTest
        extends TestCase {

    public void testRand() throws Exception {
        Model model = new Model();
        model.setBorderMeasures(GlobalConstants.PRIMARY_MIN_BORDER, GlobalConstants.PRIMARY_MAX_BORDER);
        int temp = 1000000;
        while (temp!=0){
            model.setRandomNumber();
            assertTrue(model.getRandomNumber() > GlobalConstants.PRIMARY_MIN_BORDER ||
                    model.getRandomNumber() < GlobalConstants.PRIMARY_MAX_BORDER);
            temp--;
        }
    }

}
