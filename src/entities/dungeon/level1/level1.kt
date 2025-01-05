package entities.dungeon.level1

import entities.save.loadControlPoint
import entities.save.saveControlPoint

fun level1() {
    val save = loadControlPoint("save.dat")
    if (save != null) {
        do {
            var salir :String
            when (save.room) {
                1 -> {
                    save.room = 2
                    salir = readlnOrNull() ?: "0"

                }

                2 -> {
                    save.room = 3
                    salir = readlnOrNull() ?: "0"
                }

                3 -> {
                    save.room = 4
                    salir = readlnOrNull() ?: "0"
                }

                4 -> {
                    save.room = 5
                    salir = readlnOrNull() ?: "0"
                }

                5 -> {
                    save.room = 6
                    salir = readlnOrNull() ?: "0"
                }

                6 -> {
                    save.room = 0
                    save.level = 2
                    salir = readlnOrNull() ?: "0"
                }


                else -> {
                    salir = "1"
                }
            }
            if (salir == "1") saveControlPoint(save, "save.dat")
        } while (salir != "1")
    }

}