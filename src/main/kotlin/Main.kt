fun main(args: Array<String>) {


    //Will ask the user to enter a shape and use the user input to call a method
    println("Please enter a shape: ")
    println("1. Circle\n2. Square\n3. Triangle\n4. Equilateral Triangle")

    val enteredVal = readLine()
    println("You have entered: $enteredVal")

    val enteredVal2 = Integer.parseInt(enteredVal)

    //TRYING TO IMPLEMENT
    /*
    if (enteredVal2 == 1) {
        Circle()
    }//end if()

    /*if square is selected, it will call the Equilateral class
      and prompt the user for the dimensions; calculate the area; print the dimensions
    */
    else if (enteredVal2 == 2) {
        Square()
    }//end else if()

    /*if Triangle is selected, it will call the Equilateral class
      and prompt the user for the dimensions; calculate the area; print the dimensions
    */
    else if (enteredVal2 == 3) {
        Triangle()
    }//end else if()

    /*if Equilateral triangle is selected, it will call the Equilateral class
      and prompt the user for the dimensions; calculate the area; print the dimensions
    */
    else if (enteredVal2 == 4) {
        EquilateralTriangle()
    }//end else if()

    //if selection is not a valid selection
    else {
        println("Not a valid selection")
    }//end else()
*/

}