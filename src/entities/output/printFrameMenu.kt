package entities.output

import config.charPerLine
import config.totalLines

fun printFrameMenu() {
    var lines = totalLines - 15
    val rest = lines%2
    var lineaAdd = 0
    if (rest==0) {
        lines /= 2

    } else {
        lines = (lines - 1) / 2
        lineaAdd = 1
    }

    println(
        "+".repeat(charPerLine)
    )
    println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )
    for (i in 1..lines) {
        println(
            "+" + " ".repeat(charPerLine - 2) + "+"
        )
    }
    println(
        "+" + " ".repeat((charPerLine - 2 - "+               Bienvenido a Fisterra's Dungeon              +".length) / 2) + "+".repeat(
            "+               Bienvenido a Fisterra's Dungeon              +".length
        ) + " ".repeat((charPerLine - 2 - "+               Bienvenido a Fisterra's Dungeon              +".length) / 2) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - "+               Bienvenido a Fisterra's Dungeon              +".length) / 2) + "+" + " ".repeat(
            "+               Bienvenido a Fisterra's Dungeon              +".length - 2
        ) + "+" + " ".repeat((charPerLine - 2 - "+               Bienvenido a Fisterra's Dungeon              +".length) / 2) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - "+               Bienvenido a Fisterra's Dungeon              +".length) / 2) + "+               Bienvenido a Fisterra's Dungeon              +" + " ".repeat(
            (charPerLine - 2 - "+               Bienvenido a Fisterra's Dungeon              +".length) / 2
        ) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - "+               Bienvenido a Fisterra's Dungeon              +".length) / 2) + "+" + " ".repeat(
            "+               Bienvenido a Fisterra's Dungeon              +".length - 2
        ) + "+" + " ".repeat((charPerLine - 2 - "+               Bienvenido a Fisterra's Dungeon              +".length) / 2) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - "+               Bienvenido a Fisterra's Dungeon              +".length) / 2) + "+".repeat(
            "+               Bienvenido a Fisterra's Dungeon              +".length
        ) + " ".repeat((charPerLine - 2 - "+               Bienvenido a Fisterra's Dungeon              +".length) / 2) + "+"
    )
    println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )
    if (lineaAdd == 1) println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - "Intrépido aventurero, ¿qué desea realizar?".length) / 2) + "Intrépido aventurero, ¿qué desea realizar?" + " ".repeat(
            (charPerLine - 2 - "Intrépido aventurero, ¿qué desea realizar?".length) / 2
        ) + "+"
    )
    println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - "1 - > Continuar ".length) / 2) + "1 - > Continuar " + " ".repeat((charPerLine - 2 - "1 - > Continuar ".length) / 2) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - "2 - > Nueva Partida ".length) / 2) + "2 - > Nueva Partida " + " ".repeat((charPerLine - 2 - "2 - > Nueva Partida ".length) / 2) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - "0 - > Salir de Fisterra's Dungeon ".length) / 2) + "0 - > Salir de Fisterra's Dungeon " + " ".repeat(
            (charPerLine - 2 - "0 - > Salir de Fisterra's Dungeon ".length) / 2
        ) + "+"
    )
    for (i in 1..lines) {
        println(
            "+" + " ".repeat(charPerLine - 2) + "+"
        )
    }
    println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )
    println(
        "+".repeat(charPerLine)
    )

}
