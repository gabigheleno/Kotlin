abstract class Animal (
    val nome: String,
    val idade: Int
    ){

    abstract fun emitirSom ()

    open fun correr(println: Unit) {}

    open fun subirArvore(println: Unit) {}
}
