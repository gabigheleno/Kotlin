fun main (){

    var num: Int
    var somatorio: Int = 0
    var media: Int = 0
    var totalValores: Int = 0

    println("Digite um número positivo: ")
    num = readln().toInt()

    while (num >=0) {
        totalValores += 1
        somatorio += num
        println("Digite um número positivo: ")
        num = readln().toInt()

    }
        media = somatorio / totalValores

        println("A soma é: $somatorio")
        println("A quantidade de numeros digitados é: $totalValores")
        println("A média é: $media")

        }
