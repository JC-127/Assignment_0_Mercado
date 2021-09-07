//TRIANGLE CLASS
class Triangle : Shape() {

    fun setDimensions() {

        println("Enter side a: ")
        val Ta = readLine()
        println("Enter side b: ")
        val Tb = readLine()
        println("Enter side c: ")
        val Tc = readLine()
        getArea(Ta, Tb, Tc)
    }//end setDimension()

    //will calculate area of a triangle using Heron's Formula
    fun getArea(Ta: String?, Tb: String?, Tc: String?) {

        val si = (.5)
        val TSa = Ta!!.toDouble()
        val TSb = Tb!!.toDouble()
        val TSc = Tc!!.toDouble()
        val AreaOfTriangle = sqrt(si*(si-TSa)*(si-TSb)*(si-TSc)) //HERON'S FORMULA FOR TRIANGLE
        printDimensions(AreaOfTriangle)
    }//end getArea()

    private fun printDimensions(AreaOfTriangle : Double) {
        println("Area of Triangle is: $AreaOfTriangle")
    }//end printDimensions()
}//end class Triangle