package tutorial7

fun main(args:Array<String>)
{
    var str1:String = "Sachin"
    var str2:String = "sachin"

    if(str1.equals(str2,false))
        print("same")
    else
        print("not same")

}
