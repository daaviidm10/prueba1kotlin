import kotlin.math.exp

fun square(base: Int) = base * base + 10
fun potencia(base: Double, exponente:Double) = Math.pow(base, exponente)
fun saludo (nombre:String ): String{
    return "Hola $nombre"
}



fun isVowel(c: Char): Unit {
    when (c) {
        'a', 'e', 'o' -> println("$c es una vocal abierta")
        'i', 'u' -> println("$c es una vocal cerrada")
        else -> println("$c es una consonante")
    }
}

fun maxLength(vararg palabra: String): Int {
    var max = 0

    for (palabra in palabra) {
        if (palabra.length > max) {
            max = palabra.length
        }
    }
    return max
}
fun main(args: Array<String>) {
    var elcuadrado=potencia(2.0, 4.0)
    println("El resultado de la potencia es = "+ elcuadrado)
    //println(elcuadrado)
    //println(saludo("David"))
    //isVowel('a')
   println(maxLength("patata", "cebolla", "apio"))
}
