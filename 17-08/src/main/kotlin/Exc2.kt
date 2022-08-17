fun main(){

    // 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

    var contPar = 0
    var contImpar = 0

    for(i in 1 .. 10){
    print("Digite um número inteiro: ")
    val num = readln().toInt()

        if (num % 2 == 0){
            contPar ++
            println("O número $num é par.")}
        else{
            contImpar ++
            println("O número $num é ímpar.")}
    }

    println("Pares: $contPar")

    println("Ímpares: $contImpar")
}