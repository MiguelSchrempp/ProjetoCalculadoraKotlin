import io.mockk.every
import io.mockk.mockk
import org.testng.Assert.assertEquals
import kotlin.test.Test

internal class SampleTest {

//    private val testeCalculadora: Calculadora = Calculadora()
//
//    @Test
//    fun testSum() {
//        assertEquals(42.0, testeCalculadora.soma(19.0, 23.0))
//    }
//
//    @Test
//    fun testSub() {
//        assertEquals(42.0, testeCalculadora.subtrair(65.0, 23.0))
//    }
//
//    @Test
//    fun testMult() {
//        assertEquals(42.0, testeCalculadora.multiplicar(6.0, 7.0))
//    }
//
//    @Test
//    fun testDiv() {
//        assertEquals(42.0, testeCalculadora.dividir(84.0, 2.0))
//    }

    private val testeCalculadoraMock: Calculadora = mockk<Calculadora>()

    @Test
    fun `Teste de calculadora`() {
        every { testeCalculadoraMock.soma(19.0, 23.0) } returns 42.0
        every { testeCalculadoraMock.subtrair(65.0, 23.0) } returns 42.0
        every { testeCalculadoraMock.multiplicar(6.0, 7.0) } returns 42.0
        every { testeCalculadoraMock.dividir(84.0, 2.0) } returns 42.0

        assertEquals(42.0, testeCalculadoraMock.soma(19.0, 23.0))
        assertEquals(42.0, testeCalculadoraMock.subtrair(65.0, 23.0))
        assertEquals(42.0, testeCalculadoraMock.multiplicar(6.0, 7.0))
        assertEquals(42.0, testeCalculadoraMock.dividir(84.0, 2.0))
    }




}
