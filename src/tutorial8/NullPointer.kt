package tutorial8

//Null handling during compile time

fun main(args:Array<String>)
{
    var str:String?=null //? to assign null value

    var obj = Data()

    print(obj.name?.length)

    if (obj.name.length>=3)
    {
        
    }
}