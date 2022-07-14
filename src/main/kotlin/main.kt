fun main(){
    val result = commission("Maestro", 10_000, 9_000_000)
    println(result)

}
fun commission(cardType: String = "Vk Pay", previousTransfers: Int = 0,transferMade: Int):Int{
    return when(cardType){
        "Visa", "Мир" -> visaMir(transferMade)
        "MasterCard", "Maestro" -> masterMaestro(transferMade, previousTransfers)
        else -> 0
    }
}

fun visaMir(transferMade: Int): Int{
    val commission = (transferMade*0.75)/100
    val standartCommission = 3500
    return if(commission<= standartCommission) standartCommission else commission.toInt()
}
fun masterMaestro(transferMade: Int, previousTransfers: Int): Int{
    val commission = ((transferMade*0.6)/100)+2000
    val maxAmount = 7_500_000
    return if(transferMade+previousTransfers > maxAmount) commission.toInt() else 0
}