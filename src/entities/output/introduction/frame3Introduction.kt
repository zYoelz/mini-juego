package entities.output.introduction

import entities.output.printFramesStartLines
import entities.output.printFramesEndLines
import config.charPerLine

fun frame3Introduction() {
    val occupiedLines = 13 // mínimo 4
    val addStartLines = 0
    val addEndLines = 0
    var length = 0

    val lineaAdd = printFramesStartLines(occupiedLines, addStartLines)

    length = "Los primeros experimentos demostraron de forma rápida y concluyente que el compuesto".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Los primeros experimentos demostraron de forma rápida y concluyente que el compuesto" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "no era terrestre.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "no era terrestre." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length =
        "Se descubrió que un compuesto indeterminado de origen extraterrestre reaccionó con el agua salada y".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Se descubrió que un compuesto indeterminado de origen extraterrestre reaccionó con el agua salada y" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "la gran cantidad de metales pesados que existe en el océano por la contaminación humana.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "la gran cantidad de metales pesados que existe en el océano por la contaminación humana." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length =
        "Este compuesto resultante era lo que se acumulaba en las costas y no dejaba de emanar de la zona del hundimiento,".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Este compuesto resultante era lo que se acumulaba en las costas y no dejaba de emanar de la zona del hundimiento," + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "un material viscoso, de color negro y muy parecido al chapapote.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "un material viscoso, de color negro y muy parecido al chapapote." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "No se sabia si tendría consecuencias en el ecosistema pero pronto se confirmo que sí.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "No se sabia si tendría consecuencias en el ecosistema pero pronto se confirmo que sí." + " ".repeat(
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