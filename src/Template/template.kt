package Template

internal class Template {

    fun foo(x:Int,y:Int):Unit {
        val z = 10
        val zz: Int = 12
        println("Sum of x and y is ${x+y}")

        if(z is Int){
            println("$z is Int")
        }

        //Class Name
        println(z::class.simpleName.toString())
        println(z::class.qualifiedName.toString())
    }
}

fun main(){
 var data = Template()
    data.foo(20,40)

}