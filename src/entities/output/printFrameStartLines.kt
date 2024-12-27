package entities.output

import config.charPerLine
import config.totalLines

fun printFlamesStartLines(occupiedLines:Int,addStartLines:Int):Int{
    var lines = totalLines - occupiedLines
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
    for (i in 1..lines+addStartLines) {
        println(
            "+" + " ".repeat(charPerLine - 2) + "+"
        )
    }
    return lineaAdd
}