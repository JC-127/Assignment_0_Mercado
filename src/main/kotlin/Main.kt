import kotlin.math.sqrt

/***********************************************************************************************************************/
//SHAPE CLASS
abstract class Shape () {

    open fun getArea() {}//end getArea()

    open fun printDimensions() {}//end printDimensions

}//end class shape()
/***********************************************************************************************************************/
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
/***********************************************************************************************************************/
//SQUARE CLASS
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
        val AreaOfSquare = (sideOfSquare * sideOfSquare)
        printDimensions(AreaOfSquare)
        //print("Area of Square : $AreaOfSquare")
    }//end getArea()

    private fun printDimensions(AreaOfSquare: Int) {
        print("Area of Square is: $AreaOfSquare")
    }//end printDimensions()
}//end class Square()
/***********************************************************************************************************************/
//TRIANGLE CLASS
class Triangle : Shape() {

    fun setDimension() {
        println("")
    }//end setDimension()

    //will calculate area of a triangle using Heron's Formula
    override fun getArea() {

    }//end getArea()

    /*
    private fun printDimensions() {

    }

     */
}//end class Triangle
/***********************************************************************************************************************/
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
/***********************************************************************************************************************/
//MAIN FUNCTION
fun main(args: Array<String>) {

    //Will ask the user to enter a shape and use the user input to call a method
    println("Please enter a shape: ")
    println("1. Circle\n2. Square\n3. Triangle\n4. Equilateral Triangle")

    val enteredVal = readLine()
    println("You have entered: $enteredVal")

    val enteredVal2 = Integer.parseInt(enteredVal)

    /*if selection is a valid selection it will print out the following
      and call a function to calculate the area and print the dimensions
    */
    if (enteredVal2 == 1) {
        println("Circle has been chosen")
        val circle = Circle()
        circle.setDimensions()
        circle.getArea()
        circle.printDimensions()
    }//end if()

    /*if square is selected, it will call the Equilateral class
      and prompt the user for the dimensions; calculate the area; print the dimensions
    */
    else if (enteredVal2 == 2) {
        println("Square has been chosen")
        val square = Square()
        square.setDimensions()
        square.getArea()
        square.printDimensions()
    }//end else if()

    /*if Triangle is selected, it will call the Equilateral class
      and prompt the user for the dimensions; calculate the area; print the dimensions
    */
    else if (enteredVal2 == 3) {
        println("Triangle has been chosen")
        val triangle = Triangle()
        //triangle.setDimensions()
        triangle.getArea()
        //triangle.printDimensions()
    }//end else if()

    /*if Equilateral triangle is selected, it will call the Equilateral class
      and prompt the user for the dimensions; calculate the area; print the dimensions
    */
    else if (enteredVal2 == 4) {
        println("Equilateral Triangle has been chosen")
        val eTriangle = eTriangle()
        eTriangle.setDimensions()
        eTriangle.getArea()
        eTriangle.printDimensions()
    }//end else if()

    //if selection is not a valid selection
    else {
        println("Not a valid selection")
    }//end else()

}//end main()