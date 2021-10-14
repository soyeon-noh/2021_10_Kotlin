import java.util.*
import kotlin.random.Random

var rnd: Random = Random(System.currentTimeMillis())

fun main() {
    var scan: Scanner = Scanner(System.`in`)

    while (true) {
        prime()
        println("계속 할까요?...(END: 끝내기)")
        var input: String = scan.nextLine()

        if (input.equals(("END"))) break
    }
    println("GAME OVER")
}

fun prime() {


    var num1: Int = rnd.nextInt(100)

    println("생성된 난수 : $num1")

    // range 데이터(일종의 유사배열)
    // it은 키워드이므로 이름을 변경할 수 없다.
    // 2 3 4 5 6 .. 의 값이 하나씩 it에 담긴다.
    // filter는 조건문이 true인 경우를 배열로 만들어준다.

    // filter를 사용하여 num1값과 % 연산을 하여
    // 결과가 0인 경우만 추출하여 resultArray에 담았다.
    var resultArray = (2 until num1).filter { num1 % it == 0 }
    println(resultArray)

    if (resultArray.isEmpty()) {
        println("$num1 은 소수")

    } else {
        println("$num1 은 소수 아님")
    }
}