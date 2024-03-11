class Computer_volume(name1:String,P:Double):Computer_vid(name1) {
    fun VolumeO() {
        println(" Введите объем винчестера")
        P = readLine()!!.toDouble()
    }

    var Qp1: Double = 0.0
    override fun Qp(): Double {
        if (P < 0)
            println("Введите ещё раз, объем винчестра не может быть отрицательным")
        else
            Qp1 = Q + 0.5 * P
        return Qp1

    }
}
