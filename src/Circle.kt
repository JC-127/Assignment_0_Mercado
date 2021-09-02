class Circle (_name : String, VarC : String) {

    varC = _name
    val pi = 3.14
    val sc = Scanner(System.'in')

    print("Enter Circle Radius: ")
    val radius = sc.nextDouble()

    //Will call the function below to calculate area of circle
    val AreaOfCircle = getArea(radius)

    //function that will calculate radius of circle
    fun getArea(radius: Double) {
        AreaC = pi*radius*radius
    }//end getArea()

    fun printDimensions(){
        print("Area of Circle : $getArea")
    }//end printDimensions()
}//end Circle()