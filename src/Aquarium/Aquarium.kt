package Aquarium

 class Aquarium(
    var width: Int = 20,
    var height: Int = 50,
    var length: Int = 100
) {

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 100) / (width * length)
        }
    var water = volume * 0.9
     constructor(numberOfFish: Int): this() {
        val water = numberOfFish * 2000  // cm3
         val tank = water + water * 0.1
          height = (tank / (length * width)).toInt()
     }
}