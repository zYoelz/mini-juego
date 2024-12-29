package entities.output

import config.charPerLine
import config.totalLines

fun printFramesStartLines(occupiedLines: Int, addEndLines: Int): Int {
    var lines = totalLines - occupiedLines
    val rest = lines % 2
    var lineadd = 0
    if (rest == 0) {
        lines /= 2
    } else {
        lines = (lines - 1) / 2
        lineadd = 1
    }

    println(
        "+".repeat(charPerLine)
    )
    println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )
    for (i in 1..lines + addEndLines) {
        println(
            "+" + " ".repeat(charPerLine - 2) + "+"
        )
    }
    return lineadd

}
