import java.util.*

internal object REV {
    @JvmStatic
    fun main(args: Array<String>) {
        val n: Int
        var res: Int
        var i: Int
        var j = 0
        val s = Scanner(System.`in`)
        print("Enter number of elements in the array:")
        n = s.nextInt()
        val array = IntArray(n)
        val rev = IntArray(n)
        println("Enter $n elements ")
        i = 0
        while (i < n) {
            array[i] = s.nextInt()
            i++
        }
        println("Reverse of an array is :")
        i = n
        while (i > 0) {
            rev[j] = array[i - 1]
            println(rev[j])
            i--
            j++
        }
    }
}