fun main(args: Array<String>) {
    val oquvchi = Oquvchi("Lazizbek",10)
    oquvchi.printInfo()
//    var oquvchi2 = Oquvchi(4)
//    oquvchi2.printInfo2()
    val talaba = Talaba("",10)
    talaba.kurs = 2
    talaba.name = "Feruzbak"
    talaba.id = 18362531
    talaba.printInfo1()
    talaba.printInfo()

    talaba.ovqatlanmoq()
    talaba.oqishgaBormoq()

    val salom = Salom()

    println(salom.familiya)
}