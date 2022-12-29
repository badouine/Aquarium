package Aquarium

object BadarWhale {
    val author = "Issa Fall"
    fun jump() {
        // ...
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x00000FF)
}

sealed class Seal
object Sealion : Seal()
object Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is Sealion -> "sea lion"
    }
}