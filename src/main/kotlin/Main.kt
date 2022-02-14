//Noah Anderson


//Employee class that stores name, number, and shift
class Employee(private var name: String, private var number: String, private var shift: Int){
    fun printEmployee(){
        println("--------------------Employee--------------------")
        println("$name\nNumber: $number\nShift: $shift")
        println("------------------------------------------------")
    }

    // getters/setters for accessing object variables
    fun getName(): String{
        return this.name
    }
    fun getNumber(): String{
        return this.number
    }
    fun getShift(): Int{
        return this.shift
    }
    fun setName(newName: String){
        this.name = newName
    }
    fun setNumber(newNumber: String){
        this.number = newNumber
    }
    fun setShift(newShift: Int){
        this.shift = newShift
    }

}


//main class that runs the program
fun main(){
    //initializing 3 employee objects
    val emp1 = Employee("Billy Bob Joe","3128427354",3)
    val emp2 = Employee("Gregory Aster", "9998887777", 2)
    val emp3 = Employee("Betty", "3813813813", 1)

    //adjusting some data using the setter functions
    emp3.setName("Betty Beets")
    emp3.setShift(2)
    emp2.setShift(1)
    emp2.setNumber("1234567890")

    //using the printEmployee function in the Employee class to print out formatted employee information
    emp1.printEmployee()
    emp2.printEmployee()
    emp3.printEmployee()

    //using the getter functions to print specific data about an employee, rather than the whole information
    println("Employee #1's name is: " + emp1.getName())
    println("Employee #2's number is: " + emp2.getNumber())
    println("Employee #3's shift is: " +emp3.getShift().toString())
}