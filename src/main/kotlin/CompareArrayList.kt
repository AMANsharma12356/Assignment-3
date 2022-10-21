object ComapreArrayList {
    @JvmStatic
    fun main(args: Array<String>) {
//first array list
        val firstList = ArrayList<String>()
        //adds elements to the arraylist
        firstList.add("Banana")
        firstList.add("Orange")
        firstList.add("Grapes")
        firstList.add("Pinneapple")
        println(firstList)
        //second array list
        val secondList: MutableList<String> = ArrayList()
        //adds elements to the arraylist
        secondList.add("Banana")
        secondList.add("Orange")
        secondList.add("Grapes")
        secondList.add("Pinneapple")
        println(secondList)
        //comparing both lists
        val boolval = firstList == secondList //returns true because lists are equal
        println(boolval)
        //adding another element in the second list
        secondList.add("Papaya")
        //again comparing both lists
        val bool = firstList == secondList //returns false because lists are not equal
        println(bool)
    }
}