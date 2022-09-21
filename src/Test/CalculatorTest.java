package Test;

import Main.Calculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("All Tests passed");
    }

    @Test
    void addition10_10() {
        assertAll(
                () -> assertEquals(20, calculator.addition(10,10)),
                () -> assertEquals(10, calculator.addition(10,0)),
                () -> assertEquals(10, calculator.addition(0,10)),
                () -> assertEquals(10.0, calculator.addition(0,10.0)),
                () -> assertEquals(10.0f, calculator.addition(0,10.0f)),
                () -> assertEquals("Hello World", calculator.addition("Hello", "World"))
        );
    }
    @Test
    void multiplication(){
        assertAll(
                () -> assertEquals(4, calculator.multiplication(2, 2)),
                () -> assertEquals(-4, calculator.multiplication(2, -2)),
                () -> assertEquals(4, calculator.multiplication(-2, -2)),
                () -> assertEquals(0, calculator.multiplication(1, 0))
        );
    }
    @Test
    void subtraction() {
        assertAll(
                () -> assertEquals(0, calculator.subtraction(2, 2)),
                () -> assertEquals(4, calculator.subtraction(2, -2)),
                () -> assertEquals(0, calculator.subtraction(-2, -2)),
                () -> assertEquals(1, calculator.subtraction(1, 0))
        );
    }
    @Test
    void division() {
        assertAll(
                () -> assertEquals(3.33, calculator.division(10, 3)),
                () -> assertEquals(-0.33, calculator.division(3, -10)),
                () -> assertEquals(1, calculator.division(-2, -2)),
                () -> assertEquals(0, calculator.division(0, 1))
        );
    }
}