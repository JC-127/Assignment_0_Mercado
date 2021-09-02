abstract class Shape (_name : String) {
    var name = _name

    open fun getArea() {
        return 0.0;
    }//end getArea()

    open fun setDimensions() {

    }//end setDimensions()

    fun printDimensions() {
        println("No dimensions");
    }//end fun printDimensions()
}//end class shape()