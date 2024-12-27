package entities.output.Introduction

import config.charPerLine
import entities.output.printFlamesStartLines
import entities.output.printFramesEndLines

fun frames1Introduction() {

    val occupiedLines = 11 // mínimo 4
    val addStartLines = 0
    val addEndLines = 0


    val lineaAdd = printFlamesStartLines(occupiedLines, addStartLines)

    var length = "El 13 de noviembre de 2002 un meteorito llamado Prestige ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "El 13 de noviembre de 2002 un meteorito llamado Prestige " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "impactó en las costa gallega cerca de A Coruña.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "impactó en las costa gallega cerca de A Coruña." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Pocos dias después un extraño liquido viscoso de color negro afecto a las costas ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Pocos dias después un extraño liquido viscoso de color negro afecto a las costas " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "y la malísima gestión del Gobierno Gallego hizo el resto.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "y la malísima gestión del Gobierno Gallego hizo el resto." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    length = "Mas de 2000 kilometros de la costa española, francesa y portuguesa quedo afectada ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Mas de 2000 kilometros de la costa española, francesa y portuguesa quedo afectada " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    length = "ya que este liquido no dejaba de salir de la zona de hundimiento del Prestige".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "ya que este liquido no dejaba de salir de la zona de hundimiento del Prestige" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    if (lineaAdd == 1) println(
        "+" + " ".repeat(charPerLine - 2) + "+"
    )

    length = "                                                                            Enter para continuar".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "                                                                            Enter para continuar" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    printFramesEndLines(occupiedLines, addEndLines)

}

