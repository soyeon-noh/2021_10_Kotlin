
fun main() {

    // 타언어
    // int[] nums = new int[4]

    // Kotlin에서는
    // 배열을 만들 때 Collections 를 사용하여 생성한다

    // 정수형 배열의 생성, 정수형 List Collection 생성
    // 주로 val로 선언
    val arr1 = listOf(0,0,0,0,0)
    val arr2 = arrayOf("가","나","다","라")

    // 요소가 정해지지 않은 blank 배열을 생성
    val arr3 = emptyList<Int>()
    val arr4 = emptyArray<String>()

    // 개수는 지정하고 요소 내용은 정해지지 않은 배열을 생성
    var arr5 = arrayOfNulls<Int>(3)


    // 개수를 지정하고 람다함수를 사용하여
    // 각 요소의 초기값을 지정하는 코드
    // 여기에서는 0, 1, 2, 3, 4, 의 값이 arr5 에 담기게 된다.
    var arr6:Array<Int> = Array(5, {index->index})
    for(arr in arr6){
        print("$arr, ") // result : 0, 1, 2, 3, 4,
    }



}