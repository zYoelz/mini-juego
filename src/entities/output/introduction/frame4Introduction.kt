package entities.output.introduction

import entities.output.printFramesStartLines
import entities.output.printFramesEndLines
import config.charPerLine


fun frame4Introduction() {
    val occupiedLines = 16 // mínimo 4
    val addStartLines = 0
    val addEndLines = 0
    var length = 0

    val lineaAdd = printFramesStartLines(occupiedLines, addStartLines)

    length = "Paso ya casi un año y las denuncias de vecinos y ganaderos se empezaron a acumular,".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Paso ya casi un año y las denuncias de vecinos y ganaderos se empezaron a acumular," + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length =
        ("la desaparición de sus mascotas y el ganado eran los motivos que, al añadirle el reporte de los biólogos,").length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "la desaparición de sus mascotas y el ganado eran los motivos que, al añadirle el reporte de los biólogos," + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "hizo saltar todas las alarmas.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "hizo saltar todas las alarmas." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Estaban desapareciendo poco a poco los grandes mamíferos de las zonas cercas a la costa y".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Estaban desapareciendo poco a poco los grandes mamíferos de las zonas cercas a la costa y" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "también humanos.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "también humanos." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Las pruebas apuntaban a una suposición en particular, los insectos han crecido.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Las pruebas apuntaban a una suposición en particular, los insectos han crecido." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Su corta esperanza de vida y su alta reproducción hizo que las modificaciones genéticas que".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Su corta esperanza de vida y su alta reproducción hizo que las modificaciones genéticas que" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "propiciaron el compuesto extraterrestre se hicieran visibles muy rápido.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "propiciaron el compuesto extraterrestre se hicieran visibles muy rápido." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Pronto se extendió a otras especies y los grandes problemas empezaron.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Pronto se extendió a otras especies y los grandes problemas empezaron." + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "La única solución la ofreció la alianza NUNCA MAIS.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "La única solución la ofreció la alianza NUNCA MAIS." + " ".repeat(
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