fun main (){

    /*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
    Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE) */

    var contMenos = 0
    var contMais = 0

    while (true){
    print("Digite a sua idade: ")
    var idade = readln().toInt()

    if(idade in 1 .. 21 ){
     contMenos ++
    } else if (idade > 50) {
            contMais  ++
    }
        if (idade == -99) {
        break
    }

}

    println("Idades <21: $contMenos")
    println("Idades >50: $contMais")

}

