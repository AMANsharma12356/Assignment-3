import kotlin.jvm.JvmStatic
import java.util.HashMap
//5. Write a Java program to associate the specified value with the specified key in a HashMap.

object Question5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val hash_map = HashMap<Int, String>()
        hash_map[1] = "Yello"
        hash_map[2] = "Red"
        hash_map[3] = "Black"
        hash_map[4] = "Green"
        hash_map[5] = "Blue"
        for ((key, value) in hash_map) {
            println("$key $value")
        }
    }
}