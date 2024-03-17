fun main(){
    school("Akirachix ")
    sentence("Susan", 20)
    text("Susan")
    texts("Susan")
    records("susanMwende", 254707071167L,20,56.5F,"Rwanda")
    isEven(30)
    extract("Mwende")
    temparature(37.92)

}
//Given a string "akirachix". Write a function that prints out a string composed of the first, third and fourth characters of the string (4 points)
fun school(name:String){
    var a = name[0]
    var b = name[2]
    var c = name[3]
    var name = a +" "+ b +" "+ c
    println(name)
}
//2. Write a function that takes in 2 parameters, name and age and returns a String with this structure "Hi, my name is x and I am y years old." Where x and y are the provided name and age respectively. (6 points)
fun sentence(x:String , y:Int):String {
    var text = "My name is $x and i am $y years old"
    return text
}
//Write a function that takes in a String and returns its length (4 points)
fun text(names:String):Int{
    return names.length

}
//Write a function that takes in a name and prints out "That's me!" when your name is passed to it, otherwise it prints out "I don't know who that is" (6 points)

fun texts(name: String){
    if (name=="Susan") {
        println("That's me")
    } else {
        println("I don't know who that is")

    }
}
//You are creating an app to capture student records. Some of the data you will
//capture includes full name, age, phone number, weight in kg and citizen. For the
//citizen field, you will track whether a student is a Kenyan or not. (6 points)

fun records(fullName: String, phoneNumber:Long, age: Byte, weightInKg: Float, citizen: String) {
    println(fullName)
    println(phoneNumber)
    println(age)
    println(weightInKg)

    if (citizen == "Kenyan") {
        println("true")
    } else {
        println("false")
    }
}
//Write a Kotlin function named isEven that takes an integer as a parameter and returns a Boolean indicating whether the number is even or odd. (4 points)

fun isEven(number:Int ):Int {
    if (number % 2 == 0) {
        println("even")
    } else {
        println("odd")
    }
    return number
}

//Create a kotlin function that extracts a substring from a given string starting from index 2 to index 5 using the slice function and returns it. (6 points)
fun extract(word:String):String{
    return(word.slice(2..5))
}

//Implement a Kotlin program that declares a variable temperature of type Double and assigns it a temperature value. Then, print a message saying "The temperature is [temperature] degrees Celsius." (4 points)
fun temparature(temp:Double){
    var celcius="The temparature is $temp degrees Celcius"
    println(celcius)
}













