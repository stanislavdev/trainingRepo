package Task2;

import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.run();
    }
}
