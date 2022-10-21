import java.util.ArrayList
import kotlin.jvm.JvmStatic
//1. Write a program to create a new array list, add some colors (string) and print out the collection.
object Question1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val list_Strings: MutableList<String> = ArrayList()
        list_Strings.add("Violet")
        list_Strings.add("Indigo")
        list_Strings.add("Red")
        list_Strings.add("Orange")
        list_Strings.add("Brown")
        println(list_Strings)
    }
}