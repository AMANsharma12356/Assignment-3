import kotlin.jvm.JvmStatic
import java.lang.ArrayIndexOutOfBoundsException
import java.lang.ArithmeticException
//7. Write a program to implement 1 try and myltiple catch blocks, catch blocka should contain
// arithmetic exception, array index out of bounds exception, string out of bonds exception

class MultipleCatchBlockInConstructor internal constructor() {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val mc = MultipleCatchBlockInConstructor()
        }
    }

    init {
        try {
            val num = 8 / 0
        } catch (excp: ArrayIndexOutOfBoundsException) {
            println("Exception is : $excp")
        } catch (excp: ArithmeticException) {
            println("Exception is : $excp")
        }
    }
}