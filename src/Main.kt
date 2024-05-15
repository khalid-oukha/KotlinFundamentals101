//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Read only list
    val Students = listOf("khalid","hasan","said")
    println("the first student in the list is ${Students[0]}")
    println("the first student in the list is ${Students.first()}")
    println("the last student in the list is ${Students.last()}")
    println("total students ${Students.count()}")
    println("hasan" in Students) //check if item in list returns true or false


    // Mutable list with explicit type declaration
    val students: MutableList<String> = mutableListOf("khalid","hasan","said")
    students.add("brahim") //add item to list
    students.remove("khalid") //remove item in list
    println(students)
}