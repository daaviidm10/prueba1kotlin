class Diccionario {
    fun maxLength(vararg palabra: String): Int {
        var max = 0

        for (palabra in palabra) {
            if (palabra.length > max) {
                max = palabra.length
            }
        }
        return max
    }
}