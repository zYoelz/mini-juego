package entities.output.Introduction

import config
import config.charPerLine
import entities.output.printFramesEndLines
import entities.output.printFramesStartLines
import config.totalJoke as totalJoke1

fun printFrameClassNoValid() {
    var getocupiedLines=9
    println("total no valid ${config.totalNoValid}")
    println("total joke ${config.totalJoke}")
    if (config.totalNoValid > 4)getocupiedLines+=1
    if (config.totalJoke > 4)getocupiedLines+=1
    if (config.totalNoValid > 4 && config.totalJoke > 4) getocupiedLines+=1
    val occupiedLines = getocupiedLines
    val addStartLines = 0
    val addEndLines = 0
    var time: Long=2000

    val lineaAdd = printFramesStartLines(occupiedLines, addStartLines)

    val length =
        "               ¡Eeeeeooooo! Tu valor de inteligencia no debe llegar a 5. Elige correctamente la clase.               ".length
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
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+" + "               ¡Eeeeeooooo! Tu valor de inteligencia no debe llegar a 5. Elige correctamente la clase.              " + "+" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    if (config.totalNoValid > 4) {
        var lengthNovalid = "Te lo digo por que parece que te estrellas en todas las preguntas, ¿sabes leer?".length
        println(
            "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+" + " ".repeat(
                length - 2
            ) + "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+"
        )
        time+=2000

    }
    if (config.totalJoke > 4) {
        var lengthJoke = "Además deja de escribir tonterías cuando no hace falta, pareces un niño pequeño con un folio en blanco".length
        println(
            "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+".repeat(
                length
            ) + " ".repeat((charPerLine - 2 - length) / 2) + "+"
        )
        time+=2000
    }
    if (config.totalNoValid > 4 && config.totalJoke > 4) {
        var lengthNoValidJoke = "menos mal que esta modificación te curará tu tara.".length
        println(
            "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+".repeat(
                length
            ) + " ".repeat((charPerLine - 2 - length) / 2) + "+"
        )
        time+=2000
    }

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
    Thread.sleep(time)


}