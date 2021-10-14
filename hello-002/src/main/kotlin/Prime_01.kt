import kotlin.random.Random

fun main() {

    var rnd:Random = Random(System.currentTimeMillis())

    var num:Int = rnd.nextInt(100) +2

    /**
     * 2 ~ 101 까지 범위 중 생성된 1개의 난수가 prime수인지 판별
     *
     * 2 ~ 자기자신 -1 까지 수 중에서 약수가 없는 수
     */

    // 1. for문과 plag 변수를 이용하는 방법
    var bPrimeYes = true

    for(index in 2 until num){
        if(num % index == 0){
            bPrimeYes = false
            break
        }
    }
    if(bPrimeYes){
        println("$num 는 소수")
    }else{
        println("$num 는 소수가 아님")
    }

    // 2. while문을 사용하는 방법
    var index = 2
    while (index <= num/2){
        if(num % index == 0){
            break
        }
        index++
    }

    if(index >= num / 2) {
        println("$num 는 소수")
    } else{
        println("$num 는 소수가 아님")
    }

}