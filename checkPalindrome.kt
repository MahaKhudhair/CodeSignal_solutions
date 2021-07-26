//Given the string, check if it is a palindrome.
fun main() {
    println("The result is ${checkPalindrome("aabaa")}")
}
fun checkPalindrome(inputString: String): Boolean {
    return inputString == inputString.reversed()
}
