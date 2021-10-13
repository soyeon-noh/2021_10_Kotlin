import java.util.*


fun main() {

    print("정수형 숫자 1을 입력하세요 : ")
    var num1: String = scan1.nextLine()

    print("정수형 숫자 2를 입력하세요 : ")
    var num2: String = scan1.nextLine()


    var intNum1 = 0
    var intNum2 = 0
    try {
        intNum1 = Integer.valueOf(num1)
    } catch (e: NumberFormatException) {
        println("숫자 1은 잘못된 입력입니다.\n정수형 숫자를 입력해주세요.")
    }
    try {
        intNum2 = Integer.parseInt(num2)
    } catch (e: NumberFormatException) {
        println("숫자 2는 잘못된 입력입니다.\n정수형 숫자를 입력해주세요.")

    }

    if (intNum1 != 0 && intNum2 != 0) {
        println("$num1 + $num2 = ${intNum1 + intNum2}")
        println("$num1 - $num2 = ${intNum1 - intNum2}")
        println("$num1 x $num2 = ${intNum1 * intNum2}")
        println("$num1 / $num2 = ${intNum1 / intNum2}")
    } else {
        println("숫자를 잘못입력하여 연산 결과를 표시할 수 없습니다.")
    }
}