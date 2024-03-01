abstract class Tovars
{
    abstract var Name : String
    abstract var Price: Double
    abstract var Kol : Int
    abstract var p : Int
    abstract var t: Int
    open fun Q()
    {   var Q=Price/Kol
        var QQ=Q+0.5*(t-p)
        println("Qp: $QQ" )
    }
    open fun Input_Information() {}
    open fun PrintInfo() {}
}
