class Person(
    var Name: String,
    val Nid: String,
    val phone: String = "Undefine",
    var Email: String = "Undefine",
    Height: Double,
    Weight:Double,){

    var bmi: Double
    init{
        bmi = Weight / (Height*Height)
    }

    override fun toString(): String {
        return "Person(Name='$Name', Nid='$Nid', phone='$phone', Email='$Email', bmi=$bmi)"
    }


}