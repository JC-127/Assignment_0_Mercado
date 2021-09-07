class Square : Shape() {

    fun setDimensions() {
        println("Enter the Length of the Square: ")
        val sideLength = readLine()
        println("Enter the Height of the Square: ")
        val heightLength = readLine()
        getArea(heightLength, sideLength)
    }//end setDimension()

    //function that will calculate Area of a Square
    fun getArea(heightLength: String?, sideLength: String?) {

        val sideOfSquare = sideLength!!.toInt()
        val sideOfSquare2 = heightLength!!.toInt()

        if (sideOfSquare == sideOfSquare2) {
            val AreaOfSquare = (sideOfSquare * sideOfSquare)
            printDimensions(AreaOfSquare)
        }//end if()
        else if (sideOfSquare != sideOfSquare2){
            val AreaOfSquare = (sideOfSquare * sideOfSquare2)
            printDimensions(AreaOfSquare)
        }//end else()
    }//end getArea()

    private fun printDimensions(AreaOfSquare: Int) {
        print("Area of Square is: $AreaOfSquare")
    }//end printDimensions()
}//end class Square()