package pe.edu.tecsup.lab10;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private static final Logger log = LogManager.getLogger(CalculatorTest.class);

    @BeforeAll
    static void initAll() {
        Configurator.setRootLevel(org.apache.logging.log4j.Level.INFO);
        log.info("initAll()....!");
    }

    @AfterAll
    static void finishAll() {
        log.info("finishAll()....!");
    }

    @BeforeEach
    void beforeTest() {
        log.info("beforeTest()....!");
    }

    @AfterEach
    void afterTest() {
        log.info("afterTest()....!");
    }

    @Test
    void testSub() {
        log.info("testSub()....!");
        final int EXPECTED = 1;
        Calculator app = new Calculator();
        assertEquals(EXPECTED, app.sub(4, 3));
    }

    @Test
    void testAdd() {
        log.info("testAdd()....!");
        final int EXPECTED = 7;
        Calculator app = new Calculator();
        assertEquals(EXPECTED, app.add(4, 3));
    }

    @Test
    void testMult() {
        log.info("testMult()....!");
        final int EXPECTED = 12;
        Calculator app = new Calculator();
        assertEquals(EXPECTED, app.mult(4, 3));
    }

    @Test
    void testDiv() {
        log.info("testDiv()....!");
        final int EXPECTED = 2;
        Calculator app = new Calculator();
        assertEquals(EXPECTED, app.div(10, 5));
    }
}