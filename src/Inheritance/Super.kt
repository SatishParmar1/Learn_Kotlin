package Inheritance

open class Super {
    open fun printData(){
        println("this is my first class")
    }
}

class Super1: Super(){
    override fun printData(){
        super.printData()
        println("this is my second class")
    }
}

fun main(){
    var data = Super1()
    data.printData()
}