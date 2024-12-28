package entities.output.Introduction

import entities.output.printFramesStartLines
import entities.output.printFramesEndLines
import config.charPerLine


fun frame4Introduction() {
    val occupiedLines = 12 // mínimo 4
    val addStartLines = 0
    val addEndLines = 0
    var length = 0

    val lineaAdd = printFramesStartLines(occupiedLines,addStartLines)

    length = " ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + " " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = " ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + " " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = " ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + " " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = " ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + " " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = " ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + " " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = " ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + " " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    println( "+" + " ".repeat(charPerLine - 2) + "+" )

    if (lineaAdd == 1) println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )


    length = "                                                                Enter para Continuar o 1 para Salir al Menu de Inicio ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "                                                                Enter para Continuar o 1 para Salir al Menu de Inicio " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    printFramesEndLines(occupiedLines,addEndLines)

}