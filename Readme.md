# Learning Kotlin

Welcome to my Kotlin learning journey! This README file serves as documentation of what I've learned about Kotlin so far.

## What is Kotlin?

Kotlin is a modern programming language developed by JetBrains, initially released in 2011. It's designed to be concise, expressive, and interoperable with existing Java code. Here's a brief overview of Kotlin's key features:

- **Conciseness**: Kotlin allows you to write more expressive code with fewer boilerplate, resulting in cleaner and more readable codebases.

- **Interoperability**: Kotlin seamlessly integrates with Java, enabling developers to leverage existing Java libraries and frameworks within Kotlin projects.

- **Safety**: Kotlin offers features like nullable types and type inference, reducing the likelihood of null pointer exceptions and other common runtime errors.

- **Functional Programming**: Kotlin supports functional programming paradigms, including higher-order functions, lambda expressions, and immutable data structures.

- **Tooling**: Kotlin provides excellent tooling support, including IDE plugins for IntelliJ IDEA, Android Studio, and Visual Studio Code, as well as build tools like Gradle and Maven.

## Getting Started

To start learning Kotlin, you can follow these steps:

1. Install the Kotlin compiler or use an IDE with Kotlin support, such as IntelliJ IDEA or Android Studio.

2. Explore the basics of Kotlin syntax, including variables, functions, control flow structures, and data types.

3. Experiment with Kotlin's features like nullable types, extension functions, and data classes to understand their usage and benefits.

4. Practice writing Kotlin code by working on small projects or solving coding challenges.

5. Refer to official Kotlin documentation, tutorials, and online resources for further learning and guidance.


## Basic types

## var and val in Kotlin

In Kotlin, `var` and `val` are keywords used for variable declaration, but they have different behaviors:

### var

Declares a mutable variable, meaning its value can be reassigned after it's initialized.

```kotlin
var x = 10
x = 20 // Valid, since 'x' is mutable
```
### val

val is immutable, and its value cannot be changed after initialization.

```kotlin
val y = 30
// y = 40 // Error: Val cannot be reassigned
```

## Collections
### Lists : 
- **Ordered collections of items**

```kotlin
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
```

### Sets

- **Unique unordered collections of items**
- Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.
### Maps

- **Sets of key-value pairs where keys are unique and map to only one value**

```kotlin
// Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(readOnlyJuiceMenu)
// {apple=100, kiwi=190, orange=100}

// Mutable map with explicit type declaration
val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(juiceMenu)
// {apple=100, kiwi=190, orange=100}
```


## Conditional expressions
### When
Place the conditional expression within parentheses () and the actions to take within curly braces {}.

Use -> in each branch to separate each condition from each action.
```kotlin
val obj = "Hello"

when (obj) {
    // Checks whether obj equals to "1"
    "1" -> println("One")
    // Checks whether obj equals to "Hello"
    "Hello" -> println("Greeting")
    // Default statement
    else -> println("Unknown")
}
```
## Loops && Ranges
### Ranges
- To create a range including the end value, use the `..` operator:
    - Example: `1..4` results in `1, 2, 3, 4`.

- To create a range excluding the end value, use the `..<` operator:
    - Example: `1..<4` results in `1, 2, 3`.

- To create a range in reverse order, use the `downTo` keyword:
    - Example: `4 downTo 1` results in `4, 3, 2, 1`.

- To create a range with a specific increment value, use the `step` keyword:
    - Example: `1..5 step 2` results in `1, 3, 5`.

You can also create ranges with characters:

- `'a'..'d'` results in `'a', 'b', 'c', 'd'`.

- `'z' downTo 's' step 2` results in `'z', 'x', 'v', 't'`.
### Loops
```Kotlin

for(number in 1..4){
    println(number)
} 

for (student in students)
{
    println("hello ${student}")
}
```
