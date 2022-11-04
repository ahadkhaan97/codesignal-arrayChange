fun main() {
    print(solution(mutableListOf(1, 1, 1)))
}

fun solution(inputArray: MutableList<Int>): Int {
    var steps = 0
    for (i in 0 until inputArray.size - 1) {
        if (inputArray[i] >= inputArray[i + 1]) {
            steps += ((inputArray[i] - inputArray[i + 1]) + 1)
            inputArray[i + 1] += ((inputArray[i] - inputArray[i + 1]) + 1)
        }
    }
    return steps
}