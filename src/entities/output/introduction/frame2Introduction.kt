package entities.output.introduction

import config.charPerLine
import entities.output.printFramesEndLines
import entities.output.printFramesStartLines

fun frame2Introduction() {
    val occupiedLines = 15 // mínimo 4
    val addStartLines = 0
    val addEndLines = 0
    var length = 0

    val lineaAdd = printFramesStartLines(occupiedLines, addStartLines)

    length = "Desde el primer momento la población civil se lanzo a ayudar en la limpieza y ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Desde el primer momento la población civil se lanzo a ayudar en la limpieza y " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "pronto empezaron las conspiraciones.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "pronto empezaron las conspiraciones." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length =
        "Estas fueron motivadas por la cantidad de contradicciones y bulos difundidas por medios y los representantes políticos. ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Estas fueron motivadas por la cantidad de contradicciones y bulos difundidas por medios y los representantes políticos. " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Se extendieron rápido y fueron muy imaginativas:".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Se extendieron rápido y fueron muy imaginativas:" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length =
        "se pensó que fue un accidente aéreo con un compuesto para cambiar el clima o intentar hacer que fuéramos mas dóciles, ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "se pensó que fue un accidente aéreo con un compuesto para cambiar el clima o intentar hacer que fuéramos mas dóciles, " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length =
        "que fué un ataque terrorista de una célula independentista catalana para recuperar el turismo de verano perdido,".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "que fué un ataque terrorista de una célula independentista catalana para recuperar el turismo de verano perdido," + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length =
        "pero la mas llamativa era la ocultación del hundimiento de un petrolero por las cuestionables decisiones de la elite. ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "pero la mas llamativa era la ocultación del hundimiento de un petrolero por las cuestionables decisiones de la elite. " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Todo fue muy divertido pero ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Todo fue muy divertido pero " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "lo que se estaba limpiando no era lo que la gente pensaba.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "lo que se estaba limpiando no era lo que la gente pensaba." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    println("+" + " ".repeat(charPerLine - 2) + "+")

    if (lineaAdd == 1) println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )
    length =
        "                                                                Enter para Continuar o 1 para Salir al Menu de Inicio ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "                                                                Enter para Continuar o 1 para Salir al Menu de Inicio " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    printFramesEndLines(occupiedLines, addEndLines)

}