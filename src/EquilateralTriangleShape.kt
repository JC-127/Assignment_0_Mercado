//CLASS EQUILATERAL TRIANGLE
class eTriangle : Shape() {

    fun setDimensions() {
        println("Enter the length for the Equilateral Triangle (NOTE: ALL SIDES ARE EQUAL IN AN EQUILATERAL TRIANGLE: ")
        val ETLength = readLine()
        getArea(ETLength)
    }//end setDimenstions()

    fun getArea(ETLength: String?) {

        val ETSide = ETLength!!.toDouble()
        val a = ETSide
        val AreaOfET = (((a*a)*sqrt(3.0))/4) //SIMPLIFIED HERON'S FORMULA
        printDimensions(AreaOfET)
    }//end getArea()

    private fun printDimensions(AreaOfET: Double) {
        println("Area of Equilateral Triangle: $AreaOfET")
    }//end printDimensions()

}//end class eTriangle()