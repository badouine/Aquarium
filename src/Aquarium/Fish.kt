package Aquarium

class Fish (val friendly: Boolean = true, volumeNeeded: Int ) {
    val size: Int

    init {
        println("First init block ")
    }
    constructor() : this (true, 9) {
        println("running secondary constructor")
    }

    init {
        size = if(friendly){
            volumeNeeded
        } else {
            volumeNeeded * 2
        }
    }
    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }
    init {
        println("Last init block")
    }
}

fun makeDefaultFish() = Fish(true, 50)
fun fishExample() {
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}