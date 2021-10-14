fun main() {

    /**
     * java 에서 배열은 한번 생성이 되면
     * 배열의 크기를 변경할 수 없다.
     *
     * Kotlin 에서는 java와 같은 배열 요소가 없다
     * List 형의 특별한 데이터 타입만 존재
     *
     * 불변형 List 와 가변형 List 가 있다.
     * 불변형 List 는 한번 크기, 요소가 지정되면
     *      요소를 추가, 삭제할 수 없다.
     * 가변형 List 는 코드가 실행되는 과정에서
     *      요소를 추가, 삭제할 수 있다.
     */

    // 불변형 List의 대표
    var lList = listOf(1,2,3,4,5,6)
    // 가변형 List의 대표 : Mutable 변하기 쉬운
    var mArray :MutableList<Int> = mutableListOf()
    mArray.add(100)
    mArray.add(200)
    println(mArray) // result : [100, 200]

    // Kotlin의 고유 데이터가 아님
    // Java의 ArrayList를 가져온 가변형 List 데이터
    // 성능이 조금 떨어지긴 한다.
    var aArray = arrayListOf<Int>()
    aArray.add(100)
    aArray.add(200)
    aArray.add(300)

    println(aArray) // result : [100, 200, 300]

    // 실제 값으로 요소를 제거하기
    aArray.remove(200)
    println(aArray) // result : [100, 300]

    // index 번째 요소를 제거하기
    aArray.removeAt(0)
    println(aArray) // result : [300]


}