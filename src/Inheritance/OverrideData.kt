package Inheritance

open class OverrideData {
    var id :Int = 1
    var name :String = "Shyam"

    open fun printData(id1: Int, name1:String){
        this.id = id1
        this.name = name1
        println("This is my Id $id")
        println("This is my $name")
    }
}

class OverrideData2 : OverrideData(){
    override fun printData(id1: Int,name1:String){
        this.id = id1
        this.name = name1
        println("not my $id")
        println("not my $name")
    }
}

fun main(){
    var data = OverrideData2()
    data.printData(2,"ram")
}