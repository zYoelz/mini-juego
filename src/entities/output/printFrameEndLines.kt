package entities.output

import config.charPerLine
import config.totalLines

fun printFramesEndLines(occupiedLines: Int, addEndLines: Int) {
    var lines = totalLines - occupiedLines
    val rest = lines % 2
    if (rest == 0) {
        lines /= 2
    } else {
        lines = (lines - 1) / 2
    }
    for (i in 1..lines + addEndLines) {
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
