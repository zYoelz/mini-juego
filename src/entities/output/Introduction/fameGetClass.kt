package entities.output.Introduction

import entities.output.printFramesStartLines
import entities.output.printFramesEndLines
import config.charPerLine

fun frameGetClass() {
    val occupiedLines = 14 // mínimo 4
    val addStartLines = 0
    val addEndLines = 0
    var length = 0

    val lineaAdd = printFramesStartLines(occupiedLines, addStartLines)

    length = "Ahora es momento de que elijas las modificaciones genéticas, estas vienen dadas en bloques.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Ahora es momento de que elijas las modificaciones genéticas, estas vienen dadas en bloques." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Podemos dividirlas en clase Barbaro, clase Pícaro o clase Mago.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Podemos dividirlas en clase Barbaro, clase Pícaro o clase Mago." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Barbaro             Pícaro              Mago                ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Barbaro             Pícaro              Mago                " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Fuerza: 20          Fuerza: 15          Fuerza: 12          ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Fuerza: 20          Fuerza: 15          Fuerza: 12          " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Inteligencia: 10    Inteligencia: 12    Inteligencia: 20    ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Inteligencia: 10    Inteligencia: 12    Inteligencia: 20    " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Destreza: 15         Destreza: 20        Destreza: 10        ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Destreza: 15         Destreza: 20        Destreza: 10        " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length =
        "Estos números son una representación de una mejora de un 10% mas o menos respecto a un ser humano medio,".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Estos números son una representación de una mejora de un 10% mas o menos respecto a un ser humano medio." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "esto quiere decir básicamente que un humano medio tendría valores de 10 en todas sus estadísticas.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "esto quiere decir básicamente que un humano medio tendría valores de 10 en todas sus estadísticas. " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )

    if (lineaAdd == 1) println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )
    length =
        "                                                  Teclea 1 para Barbaro, 3 para Pícaro y 5 para Mago".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "                                                  Teclea 1 para Barbaro, 3 para Pícaro y 5 para Mago" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )


    printFramesEndLines(occupiedLines, addEndLines)

}