package entities.dungeon

import entities.dungeon.level1.level1
import entities.dungeon.level2.level2
import entities.save.loadControlPoint

fun goDungeon() {
  var save = loadControlPoint("save.dat")
    if (save?.level == 0) {

    } else {
    }

    do {
        var salir:String
        when (save?.level) {
            0 -> {
                salir = readlnOrNull() ?: "0"
            }

            1 -> {
                level1()
                salir = readlnOrNull() ?: "0"
            }

            2 -> {
                level2()
                salir = readlnOrNull() ?: "0"
            }

            else -> {
                salir = "1"
            }

        }
    } while (salir != "1")
}