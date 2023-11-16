import java.util.Scanner

fun main(args: Array<String>) {
val userInfo=  User("Leila","leila@com",17,12345)
    val scanner=Scanner(System.`in`)
    println("login")
    println("Imput username:")
    val userName= scanner.nextLine()
    println("Imput email")
    val email= scanner.nextLine()
    println("Imput age")
    val age=scanner.nextInt()
    println("Imput password")
    val password =scanner.nextInt()
    val imputUserModel= User(userName.trim(),email.trim(),age,password)
    userInfo.verify(imputUserModel)


}