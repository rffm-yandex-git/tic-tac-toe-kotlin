import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CalculatorTest {

    @Test
    fun `when adding 1 and 2 expect 3`() {
        val result = Calculator.add(1, 2)
        assertEquals(3, result)
    }
}