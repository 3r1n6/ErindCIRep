import org.example.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void testAddition() {
        String input = "+\n6\n4\n";
        String output = runMainWithInput(input);
        assertTrue(output.contains("The result is: 10.0"));
    }

    @Test
    void testSubtraction() {
        String input = "-\n6\n4\n";
        String output = runMainWithInput(input);
        assertTrue(output.contains("The result is: 2.0"));
    }

    @Test
    void testMultiplication() {
        String input = "*\n6\n4\n";
        String output = runMainWithInput(input);
        assertTrue(output.contains("The result is: 24.0"));
    }

    @Test
    void testDivision() {
        String input = "/\n8\n2\n";
        String output = runMainWithInput(input);
        assertTrue(output.contains("The result is: 4.0"));
    }

    @Test
    void testDivisionByZero() {
        String input = "/\n6\n0\n";
        String output = runMainWithInput(input);
        assertTrue(output.contains("Error: Division by zero is not allowed."));
    }

    @Test
    void testSquareRoot() {
        String input = "√\n16\n";
        String output = runMainWithInput(input);
        assertTrue(output.contains("The square root is: 4.0"));
    }

    @Test
    void testSquareRootNegativeNumber() {
        String input = "√\n-4\n";
        String output = runMainWithInput(input);
        assertTrue(output.contains("Error: Square root of a negative number is not allowed."));
    }

    @Test
    void testInvalidOperator() {
        String input = "^\n6\n4\n";
        String output = runMainWithInput(input);
        assertTrue(output.contains("Invalid operator! Please use +, -, *, /, or √."));
    }

    private String runMainWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Main.main(new String[]{}); // Main aufrufen
        return out.toString(); // Ausgabe als String zurückgeben
    }
}
