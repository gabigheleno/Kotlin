import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayInputStream

internal class ClienteTest {

    val cliente1 = Cliente("Gabriela", "hfusdsd", "964796691")

    @Test
    fun addProduto() {
        cliente1.addProduto("Sorvete")
        cliente1.addProduto("Chocolate")
        cliente1.addProduto("Bala")

        assertEquals(3, cliente1.listaCompras.size)

    }

    @Test
    fun removeProduto() {
        cliente1.addProduto("Sorvete")
        cliente1.addProduto("Chocolate")
        cliente1.addProduto("Bala")

        System.setIn(ByteArrayInputStream("Bala".byteInputStream().readBytes()))
        val listaEsperada = mutableListOf("Sorvete", "Chocolate")

        cliente1.removeProduto()

        assertArrayEquals(listaEsperada.toTypedArray(),cliente1.listaCompras.toTypedArray())

    }


}