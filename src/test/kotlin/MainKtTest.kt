import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionMaestro() {
        val transferMade = 100000000
        val previousTransfers = 1000
        val cardType = "Maestro"
        val result = commission(cardType, previousTransfers, transferMade)
        assertEquals(602000,result)
    }
    @Test
    fun commissionVisa() {
        val transferMade = 100000000
        val previousTransfers = 1000
        val cardType = "Visa"
        val result = commission(cardType, previousTransfers, transferMade)
        assertEquals(750000,result)
    }
    @Test
    fun commissionVk() {
        val transferMade = 100000000
        val previousTransfers = 1000
        val cardType = "Vk Pay"
        val result = commission(cardType, previousTransfers, transferMade)
        assertEquals(0,result)
    }

    @Test
    fun visaMir() {
        val transferMade = 1000
        val result = visaMir(transferMade)
        assertEquals(3500,result)
    }

    @Test
    fun masterMaestro() {
        val transferMade = 1000
        val previousTransfers = 2000
        val result = masterMaestro(transferMade, previousTransfers)
        assertEquals(0, result)
    }
}