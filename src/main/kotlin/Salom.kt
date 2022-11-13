
class Salom:Inson(),MyInterface1 {
    override var familiya: String
        get() = "Turayev"
        set(value) {
            println(value)
        }

    override fun printInfo() {
        super<MyInterface1>.oqishgaBormoq()
    }
}