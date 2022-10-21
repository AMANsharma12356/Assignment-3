import java.util.ArrayList
import kotlin.jvm.JvmStatic
import java.util.Collections
//4. Write a program of swap two elements in an array list.

object Question4 {
    @JvmStatic
    fun main(args: Array<String>) {
        val c1 = ArrayList<String?>()
        c1.add("Yellow")
        c1.add("Red")
        c1.add("Violet")
        c1.add("White")
        c1.add("Pink")
        println("Array list before Swap:")
        for (a in c1) {
            println(a)
        }
        //Swapping 1st(index 0) element with the 3rd(index 2) element
        Collections.swap(c1, 0, 2)
        println("Array list after swap:")
        for (b in c1) {
            println(b)
        }
    }
}