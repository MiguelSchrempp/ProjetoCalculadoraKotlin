import kotlin.test.Test
import kotlin.test.assertEquals

internal class SampleTest {

    private val testSample: MainKt = MainKt()

    class MainKt {
        fun sum(a: Int, b: Int) = a + b
    }

    @Test
    fun testSum() {
        assertEquals(42, testSample.sum(19, 23))
    }
}