data class User(
    var username: String = "Leila",
    var email: String = "leila@com",
    var age: Int = 17,
    var password: Int = 12345,

    ) : Verifiable {
    override fun verify(user: User) {
        println(user)
        println(User())
        if (user == User()) {
            println("Вход выполнен успешно!")
        } else {
            throw IllegalArgumentException("Неверные данные для входа")
        }

    }


}

