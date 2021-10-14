import java.lang.NumberFormatException
import java.util.*
import kotlin.math.pow

fun main() {

    var scan:Scanner = Scanner(System.`in`)
    print("반지름을 입력하세요(실수) : ")
    var strInput = scan.nextLine()


    var DoubleRadius:Double = 0.0
    try {
        DoubleRadius = strInput.toDouble()
    } catch (e: NumberFormatException){
        println("잘못된 입력입니다")
        return
    }

    // 원의 둘레 : 반지름 * 2 * PI
    // 원의 면적 : 반지름 * 반지름 * PI

    // 구의 표면적 : 반지름 * 반지름 * 4 * PI
    // 구의 부피 : 반지름 * 반지름 * 반지름 * PI * 4/3
    var pi = Math.PI
    var DoubleRadius2 = DoubleRadius.pow(2)
    var DoubleRadius3 = DoubleRadius.pow(3)

    println("원의 둘레 : ${DoubleRadius * 2 * pi}")
    println("원의 면적 : ${DoubleRadius2 * pi}")

    println("구의 표면적 : ${DoubleRadius2 * pi * 4}")
    println("구의 부피 : ${DoubleRadius3 * pi * 4/3}")
}