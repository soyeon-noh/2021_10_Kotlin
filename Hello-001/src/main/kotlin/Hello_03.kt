/**
 * Kotlin 특징 중 하나
 * null 안정형 언어
 * 변수에는 절대 null 값을 저장할 수 없다.
 *
 * null 값 비교 : 값이 있냐 없냐
 * 숫자형에서 0이 저장된 경우 : 정말 값이 0인지, 아니면 값이 없는지 구별하기가 힘들다.
 *  이러한 상황을 구분하기 위하여 null을 사용한다.
 * 때문에 null이 없는 언어는 상당히 많은 부분에서 코딩의 어려움이 발생한다.
 *
 * 이를 보완하기 위해 Kotlin에서는 safe null 이라는 개념이 있다.
 *
 */

fun main() {

    var str1 = ""

    // 제한적으로 str2 변수는 null을 저장할 수 있다.
    var str2:String? = null

    println(str2)
    println(str2.toString())


    if(str2 == null){
        println("str2는 null")
    }

    // JS 코드 : str = num || "str2는 null"
    println(str2?: "str2 는 null")

    // 만약 str2가 null이면 str2에 Korea 문자열을 저장하라
    str2 = str2?: "Korea"
    println(str2)


}