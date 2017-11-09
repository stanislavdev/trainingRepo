package controller;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.*;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by dvsta on 09.11.2017.
 */
public class TestRegex {

    @Test
    public void phoneNumberTester(){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("regex", new Locale("en"));
        String toTest = resourceBundle.getString("phoneNumber");

        String first = "+380975510093";
        String second = "38(097)55-100-93";
        String third = "(097)551-00-93";
        String fourth = "389434443425";

        Assert.assertTrue(first.matches(toTest));
        Assert.assertTrue(second.matches(toTest));
        Assert.assertTrue(third.matches(toTest));
        Assert.assertFalse(fourth.matches(toTest));
    }

    @Test
    public void  nickNameTester(){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("regex", new Locale("en"));
        String toTest = resourceBundle.getString("nickName");

        String first = "test@heyhey";
        String second = "nick9999";
        String third = "myNick_8";
        String fourth = "m";
        String fifth = "$mmmm";

        Assert.assertFalse(first.matches(toTest));
        Assert.assertTrue(second.matches(toTest));
        Assert.assertTrue(third.matches(toTest));
        Assert.assertFalse(fourth.matches(toTest));
        Assert.assertFalse(fifth.matches(toTest));
    }
}
