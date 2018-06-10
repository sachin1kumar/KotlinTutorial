@file:JvmName("First")
package tutorial10_callingfunfromJAVA


fun main(args:Array<String>)
{
    add(2,2)
}

fun add (a:Int,b:Int):Int{
    return a+b;
}