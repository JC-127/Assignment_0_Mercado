//CIRCLE CLASS
class Circle : Shape() {

    fun setDimensions() {
        println("Enter the radius of the circle: ")
        val radius = readLine()
        getArea(radius)
    }//end setDimension()

    //function that will calculate Area of a Circle
    fun getArea(radius: String?) {

        val pi = 3.14 //STATIC VALUE OF PI; Mmmmm Pie.....
        val CircleRadius = radius!!.toDouble()
        val AreaOfCircle = (pi * (CircleRadius * CircleRadius))
        printDimensions(AreaOfCircle)
        //println("Area of Circle: $AreaOfCircle")
    }//end getArea()

    private fun printDimensions(AreaOfCircle: Double) {
        print("Area of Circle : $AreaOfCircle")
    }//end printDimensions()

}//end class Circle : Shape