class Talaba:Oquvchi,MyInterface1,MyInterface2 {
    var kurs:Int = 0
    constructor(name:String, kurs: Int):super(name){
        this.kurs = kurs
    }
    override fun printInfo(){
        super<Oquvchi>.printInfo()
        println("$name $kurs kurs talabasi")
    }
    fun printInfo1(){
        var malumot = when(kurs){
            1-> "birinchi kursda oqisiz"
            2-> "ikkinchi kursda oqisiz"
            3-> "uchinchi kursda oqisiz"
            4-> "to'rtinchi kursda oqisiz"
            else -> {
                "siz talaba emassiz"
            }
        }
        println(malumot)
    }

    override fun ovqatlanmoq() {
        super<MyInterface1>.ovqatlanmoq()
        println("tushlik")
    }

    override fun oqishgaBormoq() {
        super<MyInterface1>.oqishgaBormoq()
        super<MyInterface2>.oqishgaBormoq()
    }

}