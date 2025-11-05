package Inheritance

 open class InheritanceData {

    var name :String ="hello"
    var roll :String = "2021pietcs154"

    fun printData(name1:String,roll1:String){
        this.name=name1
        this.roll=roll1
        println("my name is $name and roll no. is $roll")
    }

}

 open class InheritanceData1 :  InheritanceData(){
     fun printData1 (){
         println("$name is my name and $roll is my roll no")
     }
}

class InheritanceData2 : InheritanceData1(){
    fun printData2 (){
        println("$name is my name and $roll is my roll no")
    }
}

fun main(){
    var data1 = InheritanceData2()
    data1.printData("Dev","2020Puca130")
    data1.printData1()
    data1.printData("Ram","2023pce150")
    data1.printData2()
}