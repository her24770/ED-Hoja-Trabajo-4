import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;

public class UnitTestTranlator {
    private Translator translator;
    private ArrayList<String> inFix;
    private ArrayList<String> expected;
    private ArrayList<String> expectedRead;


    @Before
    public void setUp() {
        translator = new Translator();
        inFix = new ArrayList<>();
        inFix.add("(");
        inFix.add("1");
        inFix.add("+");
        inFix.add("2");
        inFix.add(")");
        inFix.add("*");
        inFix.add("9");

        expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("+");
        expected.add("9");
        expected.add("*");

        expectedRead = new ArrayList<>();
        expectedRead.add("(");
        expectedRead.add("1");
        expectedRead.add("+");
        expectedRead.add("2");
        expectedRead.add(")");
        expectedRead.add("*");
        expectedRead.add("9");
    }

    @Test
    public void shouldBeAbleToTranslate() {
        ArrayList<String> actual = translator.infixToPostfix(inFix);
        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));        
        }

    }

    @Test
    public void shouldBeAbleToReadFile() {
        ArrayList<String> actual = translator.reader("test.txt");
        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expectedRead.get(i), actual.get(i));
        }

    }
    

}   