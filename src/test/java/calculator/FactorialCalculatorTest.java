package calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @BeforeAll
    static void init(){
        System.out.println("Let's start our checks...");
    }
    @AfterAll
    static void finish(){
        System.out.println("Our checks are done");
    }
    @DisplayName("Sum function test")
    @Test
    void testSum(){
        int result = Calculator.sum(3,4);
        assertEquals(7, result);
    }
    @DisplayName("FactorialOf zero test")
    @Test
    void testFactorialOfZero(){
        int result = Calculator.factorialOf(0);
        assertEquals(1, result);
    }
    @DisplayName("FactorialOf positive number test")
    @Test
    void testFactorialOfPositiveNumber(){
        int result = Calculator.factorialOf(6);
        assertEquals(720, result);
    }
    @DisplayName("FactorialOf negative number test")
    @Test
    void testFactorialOfNegativeNumber(){
        assertThrows(IllegalArgumentException.class,
                () -> Calculator.factorialOf(-3));
    }

}

