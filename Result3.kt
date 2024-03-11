fun main()
{
    try {
        var kp = Computer_volume("Компьютер", 0.0)
        kp.Input()
        kp.VolumeO()
        kp.Info()
        kp.Q()
        kp.Qp()
    }catch(e:Exception)
    {
        println("Введите данные корректно")
    }
}
