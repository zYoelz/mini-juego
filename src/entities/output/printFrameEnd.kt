package entities.output
import config.charPerLine
import config.totalLines
fun printFrameEnd(){

    var lines = totalLines - 15
    val rest = lines % 2
    var lineaAdd = 0
    if (rest == 0) {
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
    var length = "+               ¡¡Adios intrépido aventurero!!               +".length
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
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+               ¡¡Adios intrépido aventurero!!               +" + " ".repeat(
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
    for (i in 1..lines + 5) {
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