import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private Main main;

    @BeforeEach
    public void setUp() {
        main = new Main();
    }

    @Test
    public void isPrimeTest() {
        assertEquals(true , main.isPrime(3));
        assertEquals(true , main.isPrime(23));
        assertEquals(true , main.isPrime(311));
        assertEquals(true , main.isPrime(487));
        assertEquals(true , main.isPrime(653));
        assertEquals(true , main.isPrime(947));
    }

    @Test
    public void isEvenTest() {
        assertEquals(true , main.isEven(32));
        assertEquals(true , main.isEven(64));
        assertEquals(true , main.isEven(2));
        assertEquals(true , main.isEven(20));
        assertEquals(true , main.isEven(30));
        assertEquals(true , main.isEven(26));
    }

    @Test
    public void isMultiple() {
        assertEquals(true , main.isMultiple(23, 23));
        assertEquals(true , main.isMultiple(46, 23));
        assertEquals(true , main.isMultiple(115, 23));
        assertEquals(true , main.isMultiple(184, 23));
        assertEquals(true , main.isMultiple(207, 23));
        assertEquals(true , main.isMultiple(230, 23));
    }
}
