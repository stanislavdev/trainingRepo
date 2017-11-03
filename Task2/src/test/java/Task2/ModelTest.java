package Task2;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Model.
 */
public class ModelTest
        extends TestCase {
    public void testRand() throws Exception {
        Model model = new Model();
        Assert.assertTrue(model.rand(10,15) <=15 && model.rand(10,15)>=10);

    }

}
