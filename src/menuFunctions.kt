fun menu(): Int {
    println("Intrépido aventurero, ¿qué desea realizar?")
    var repeat = 0
    do {
        println("1 - > Continuar")
        println("2 - > Nueva Partida")
        println("0 - > Salir de Fisterra's Dungeon")
        val decision = readlnOrNull()?:"0"
        when (decision) {
            "1" -> return 1
            "2" -> return 2
            "0" -> return 0

            else -> {
                println("Opción no valida")
                repeat = 1
            }
        }

    } while (repeat == 1)

    return 0
}