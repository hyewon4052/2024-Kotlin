// 부생성자 - 매개변수를 통해 초기화 프로퍼트 지정
class Bird3 {
    var name : String
    var wing : Int
    var beak : String
    var color : String

    constructor(name_:String, wing_:Int, beak_:String, color_:String) {
        name = name_
        wing = wing_
        beak = beak_
        color = color_
    }
    constructor(name_: String, beak_:String) {
        this.name = name_
        this.wing = 2
        this.beak = beak_
        this.color = "grey"
    }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol $vol")
}

fun main() {
    val coco1 = Bird3("mybird",2,"short","blue")
    val coco2 =  Bird3("mybird2","long")
    coco1.color = "yellow"
    println("coco.color : ${coco1.color}")
    coco1.fly()
    coco1.sing(3)
    coco2.color = "red"
    println("coco.color : ${coco2.color}")
    coco2.fly()
    coco2.sing(4)
}