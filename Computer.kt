abstract class Computer(): Infocomputer
{
    abstract var name:String
    abstract  var frequency: Double
    abstract  var volume: Double
    abstract fun Q():Double
    abstract fun Qp():Double
    abstract var P:Double
    abstract var Q:Double
    override fun Info()
    {
        println("Наименование процессора:$name \nТактовая частота процессора:$frequency МГц " +
                "\nОбъем оперативной памяти:$volume Мб \nQ=${String.format("%.2f",Q())} " +
                "\nQp=${String.format("%.2f", Qp())}")
    }
}

