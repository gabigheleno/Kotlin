fun main() {

    println("Digite o num1: ")
    val num1: Double = readln().toDouble()

    println("Digite o num2: ")
    var num2: Double = readln().toDouble()

    println("A soma dos números digitados é: ${soma(num1,num2)}")
    println("A subtração dos números digitados é: ${sub(num1,num2)}")
    println("A multiplicação dos números digitados é: ${mult(num1,num2)}")
    println("A divisão dos números digitados é: ${div(num1,num2)}")
    println("O resto da divisão dos números digitados é: ${rest(num1,num2)3}")
}