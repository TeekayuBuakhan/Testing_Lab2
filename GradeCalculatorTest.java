import org.junit.Test;
import static org.junit.Assert.*;

public class GradeCalculatorTest {

    private final GradeCalculator calculator = new GradeCalculator();

    @Test
    public void testGradeA() {
        assertEquals("A", calculator.gradeOf(85));
        assertEquals("A", calculator.gradeOf(80));
        assertEquals("A", calculator.gradeOf(99));
        assertEquals("A", calculator.gradeOf(100));
    }

    @Test
    public void testOtherPassingGrades() {
        assertEquals("B+", calculator.gradeOf(77));
        assertEquals("B+", calculator.gradeOf(75));
        assertEquals("B+", calculator.gradeOf(79));

        assertEquals("B", calculator.gradeOf(72));
        assertEquals("B", calculator.gradeOf(70));
        assertEquals("B", calculator.gradeOf(74));

        assertEquals("C+", calculator.gradeOf(67));
        assertEquals("C+", calculator.gradeOf(65));
        assertEquals("C+", calculator.gradeOf(69));

        assertEquals("C", calculator.gradeOf(62));
        assertEquals("C", calculator.gradeOf(60));
        assertEquals("C", calculator.gradeOf(64));

        assertEquals("D+", calculator.gradeOf(57));
        assertEquals("D+", calculator.gradeOf(55));
        assertEquals("D+", calculator.gradeOf(59));

        assertEquals("D", calculator.gradeOf(52));
        assertEquals("D", calculator.gradeOf(50));
        assertEquals("D", calculator.gradeOf(54));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", calculator.gradeOf(25));
        assertEquals("F", calculator.gradeOf(0));
        assertEquals("F", calculator.gradeOf(1));
        assertEquals("F", calculator.gradeOf(49));
    }

    @Test
    public void testScoreBelowZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.gradeOf(-10));
        assertThrows(IllegalArgumentException.class, () -> calculator.gradeOf(-1));
    }

    @Test
    public void testScoreAboveHundredThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.gradeOf(120));
        assertThrows(IllegalArgumentException.class, () -> calculator.gradeOf(101));
    }
}