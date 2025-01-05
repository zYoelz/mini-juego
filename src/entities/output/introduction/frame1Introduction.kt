package entities.output.introduction

import config.charPerLine
import entities.output.printFramesStartLines
import entities.output.printFramesEndLines

fun frame1Introduction() {

    val occupiedLines = 13 // mínimo 4
    val addStartLines = 0
    val addEndLines = 0


    val lineaAdd = printFramesStartLines(occupiedLines, addStartLines)

    var length = "El 13 de noviembre de 2002 un meteorito llamado Prestige".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "El 13 de noviembre de 2002 un meteorito llamado Prestige" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "impactó a 250 km de Fisterra en la costa gallega. ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "impactó a 250 km de Fisterra en la costa gallega. " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Pocos dias después un extraño liquido viscoso de color negro empezó a brotar del lugar. ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Pocos dias después un extraño liquido viscoso de color negro empezó a brotar del lugar. " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Una cuestionable gestión del Gobierno Gallego al no contener este liquido desconocido hizo que".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Una cuestionable gestión del Gobierno Gallego al no contener este liquido desconocido hizo que" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    length = "este se extendiera afectando a más de 2000 kilómetros de la costa española, francesa y portuguesa.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "este se extendiera afectando a más de 2000 kilómetros de la costa española, francesa y portuguesa." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    length =
        "El liquido no dejaba de salir de la zona de hundimiento del Prestige y las consecuencias pronto se empezaron a notar, ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "El liquido no dejaba de salir de la zona de hundimiento del Prestige y las consecuencias pronto se empezaron a notar, " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    length = "aunque nadie esperaba lo que vendría. ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "aunque nadie esperaba lo que vendría. " + " ".repeat(
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

