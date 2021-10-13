import kotlin.random.Random

fun main() {

    // 0부터 99까지 난수를 발생해서
    var num1 = Random.nextInt(100)
    // 그 값이 짝수이냐
    var bYes = num1 % 2 == 0
    if(bYes){
        println("$num1 은 짝수")
    }else {
        println("$num1 은 짝수 아님")
    }

    var result = ""
    if(bYes){
        result = "짝수"
    }else {
        result = "짝수 아님"
    }
    println("$num1 은 $result")

    // result2 = bYes ? "짝수" : "짝수아님"
    var result2 = if(bYes) "짝수" else "짝수아님"
    println("$num1 은 $result")
}