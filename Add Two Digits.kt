//You are given a two-digit integer n. Return the sum of its digits.
fun main() {
    println("The result is ${addTwoDigits(33)}")
}
fun addTwoDigits(n: Int): Int {
    var n = n
    var sum = 0
    while (n>0){
        val r = n % 10
        sum += r
        n /=10
    }
    return sum
}