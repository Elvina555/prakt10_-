open class Computer_vid(var name1:String):Computer()
{
    override var name=name1
    override var frequency=0.0
    override var volume=0.0
    override var P=0.0
    override var Q=0.0
    override fun Q(): Double
    {
         Q=(0.1*frequency)+volume
        return Q
    }

    override fun Qp(): Double
    {
     return 0.0
    }
    fun Input()
    {
        do {
            println("Введите тактовую частоту процессора")
            frequency = readLine()!!.toDouble()
        }while (frequency<0)
        do {
            println("Введите объем оперативной памяти")
            volume= readLine()!!.toDouble()
        }while (volume<0)

    }
}
