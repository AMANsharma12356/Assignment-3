internal object ThrowsExcecp {
    @Throws(IllegalAccessException::class)
    fun `fun`() {
        println("Inside fun(). ")
        throw IllegalAccessException("demo")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        try {
            `fun`()
        } catch (e: IllegalAccessException) {
            println("caught in main.")
        }
    }
}