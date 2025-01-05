package entities.output.introduction

import config.charPerLine
import entities.output.printFramesEndLines
import entities.output.printFramesStartLines

fun frameGetName() {
    val occupiedLines = 6 // mínimo 4
    val addStartLines = 0
    val addEndLines = 0
    var length = 0

    val lineaAdd = printFramesStartLines(occupiedLines,addStartLines)

    length = "Bueno no te preocupes, empecemos primero con tu nombre, ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Bueno no te preocupes, empecemos primero con tu nombre, " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    length = "¿Como te llamas?".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "¿Como te llamas?" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    if (lineaAdd == 1) println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )
    printFramesEndLines(occupiedLines,addEndLines)

}