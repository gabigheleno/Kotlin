class Aviao(
    var cliente: String,
    var qdadePassageiros: Int
    ) {

    fun passageiros (){
        println("Digite a quantidade necessária de lugares: ")
        qdadePassageiros = readln().toInt()
        if (qdadePassageiros < 0){
            println("Não é possível continuar a operação.")
        } else if (qdadePassageiros >= 1 && qdadePassageiros <= 8){
            println("Indicamos um Helicóptero.")
        } else if (qdadePassageiros > 8 && qdadePassageiros <= 16 ) {
            println("Indicamos um Avião de médio porte.")
        } else {
            println("Indicamos um avião de grande porte.")
        }
    }
}