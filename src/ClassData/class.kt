package classdata

internal class ClassData{
    var name = ""
    var test = 0.0f

    constructor(id:Int,name:String){
        this.name = name
        println("Constructor name: $name")
    }

    init {
       test = 0.12f
        println("Init block test value: $test")
    }
}

fun main(){
    ClassData(id = 1,name="adsf")
}