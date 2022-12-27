package Aquarium

class Aquarium {
    var width: Int = 20;
    var height: Int = 50;
    var length: Int = 100;
    var volume : Int
        get() =  width * height * length / 1000
        set(value) {height = (value * 100) / (width * length)}
}