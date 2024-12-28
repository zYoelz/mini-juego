package entities.output

import config.charPerLine

fun printFrameErrorMenu() {

    val occupiedLines = 15
    val addStartLines = 0
    val addEndLines = 5
    val lineaAdd = printFramesStartLines(occupiedLines, addStartLines)
    val length = "+               ¡¡ERROR!! Error fatal Menu ¡¡ERROR!!               +".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+".repeat(
            length
        ) + " ".repeat((charPerLine - 2 - length) / 2) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+" + " ".repeat(
            length - 2
        ) + "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+               ¡¡ERROR!! Error fatal Menu ¡¡ERROR!!               +" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+" + " ".repeat(
            length - 2
        ) + "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+"
    )
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+".repeat(
            length
        ) + " ".repeat((charPerLine - 2 - length) / 2) + "+"
    )
    println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )
    if (lineaAdd == 1) println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )
    printFramesEndLines(occupiedLines, addEndLines)


}