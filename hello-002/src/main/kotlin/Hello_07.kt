import java.lang.NumberFormatException
import java.util.*
import javax.print.attribute.IntegerSyntax

fun main() {

    var scan:Scanner = Scanner(System.`in`)

    /**
     * 키보드에서 정수값을 입력받아
     * 입력한 정수가 3의 배수인지 판별하는 코드 작성
     */

    print("정수를 입력하세요 : ")
    var input:String = scan.nextLine()


    var intInput = 0
    try {
        intInput = Integer.parseInt(input)
    } catch (e: NumberFormatException){
        println("정수만 입력해주세요")
        return
    }

    if(intInput % 3 == 0) {
        println("$intInput 은 3의 배수입니다")
    }
    else{
        println("$intInput 은 3의 배수가 아닙니다")
    }


}