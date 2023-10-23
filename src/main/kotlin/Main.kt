import java.util.*

fun main(args: Array<String>) {
    while(true){

        print("შეიყვანე x რიცხვი ")
        val x = readlnOrNull()?.toIntOrNull()

        print("შეიყვანე y რიცხვი ")
        val y = readlnOrNull()?.toIntOrNull()

        if(x == null || y == null){
            println("\tშეიყვანე მხოლოდ რიცხვები\n")
            continue
        }

        val z: Int = y + x
        println("$x და $y ჯამი არის $z")

        print("<Y/N>? ")
        var Answer = readlnOrNull()?.uppercase()

        while(Answer != "Y" && Answer != "N"){
            print("<Y/N>? ")
            Answer = readlnOrNull()?.uppercase()
        }

        if(Answer != "Y")
            print("bye bro")
            break

    }
}