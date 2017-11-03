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
        assertTrue(model.rand(10,15) <=15 && model.rand(10,15)>=10);

    }

}
