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
    }//end if()

    /*if square is selected, it will call the Equilateral class
      and prompt the user for the dimensions; calculate the area; print the dimensions
    */
    else if (enteredVal2 == 2) {
        println("Square has been chosen")
    }//end else if()

    /*if Triangle is selected, it will call the Equilateral class
      and prompt the user for the dimensions; calculate the area; print the dimensions
    */
    else if (enteredVal2 == 3) {
        println("Triangle has been chosen")
    }//end else if()

    /*if Equilateral triangle is selected, it will call the Equilateral class
      and prompt the user for the dimensions; calculate the area; print the dimensions
    */
    else if (enteredVal2 == 4) {
        println("Equilateral Triangle has been chosen")
    }//end else if()

    //if selection is not a valid selection
    else {
        println("Not a valid selection")
    }//end else()

}//end main()