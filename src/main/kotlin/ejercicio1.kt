import kotlin.math.*

fun calculatoraCientifica(funcion: String, valor: Int) {
    for (i in 1..valor) {
        val v =
            when (funcion) {
                "sin" -> sin(i.toDouble())
                "cos" -> cos(i.toDouble())
                "tan" -> tan(i.toDouble())
                "exp" -> exp(i.toDouble())
                "ln" -> ln(i.toDouble())
                else -> 0.0
            }
        if (v < 0) {
            println("$i = $v")
        } else {
            println("$i = $v")
        }
    }
}

fun main() {
    println("¿Cual es el valor que deseas ingresar?")
    val valor = readLine()!!.toInt()
    println("¿Que funcion deseas aplicar?\nSeno(sin), Coseno(cos), tangente(tan) \nExponencial(exp), logaritmo(ln)")
    println("¡Por favor ingresa la forma abreviada!")
    val funcion = readLine().toString()
    calculatoraCientifica(funcion, valor)
}
