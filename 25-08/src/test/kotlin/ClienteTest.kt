import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClienteTest {

    val cliente1 = Cliente("Gabriela", "hfusdsd", "964796691")

    @Test
    fun addProduto() {
        cliente1.addProduto("Sorvete")
        cliente1.addProduto("Chocolate")
        cliente1.addProduto("Bala")

        assertEquals(3, cliente1.listaCompras.size)

    }


}