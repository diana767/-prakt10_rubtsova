public open class Tovar  (override var Name : String,
                                 override var Price : Double,
                                 override var Kol : Int, override var p :Int, override var t :Int ) : Tovars()
{
    override fun Input_Information() {
        try
        {
            print("Наименование товара: ")
            Name = readLine()!!.toString()
            print("Общая цена товара: ")
            Price = readLine()!!.toDouble()
            print("Кол-во товара: ")
            Kol  = readLine()!!.toInt()
            print("Год выпуска  товара? ")
            p = readLine()!!.toInt()
            print("Текущий год? ")
            t = readLine()!!.toInt()
        }
        catch(e : Exception)
        {
            println("Данные введены неправильно!")
        }
    }
    override fun PrintInfo()
    {
        println("Наименование товара: $Name \nОбщая цена товара: $Price \nКол-во товара: $Kol")
    }
    override fun Q()
    {
        var Q=0.0
        var QQ = 0.0
        Q=Price/Kol
        QQ=Q+0.5*(t-p)

        println("Качество: $QQ")
    }
}