package entities.output.introduction

import config.charPerLine
import entities.output.printFramesEndLines
import entities.output.printFramesStartLines

fun frame5Introduction() {
    val occupiedLines = 17 // mínimo 4
    val addStartLines = 0
    val addEndLines = 0
    var length = 0

    val lineaAdd = printFramesStartLines(occupiedLines, addStartLines)

    length = "La alianza Nunca Mais fue una agrupación de científicos y grandes corporaciones ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "La alianza Nunca Mais fue una agrupación de científicos y grandes corporaciones " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "que tenían una cosa muy clara en mente. ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "que tenían una cosa muy clara en mente. " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length =
        "Esto era el desarrollo de las modificaciones genéticas y corporales para luchar contra la nueva amenaza,".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Esto era el desarrollo de las modificaciones genéticas y corporales para luchar contra la nueva amenaza," + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "ya que poco a poco los soldados y agentes de protección civil se veían abrumados. ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "ya que poco a poco los soldados y agentes de protección civil se veían abrumados. " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "Pocos años después las primeras modificaciones fueron puestas a prueba y fué todo un éxito, ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Pocos años después las primeras modificaciones fueron puestas a prueba y fué todo un éxito, " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length =
        "los gobiernos dejaron de destinar grandes sumas de dinero a los ejércitos y empresas armamentísticas para destinarlas ahora ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "los gobiernos dejaron de destinar grandes sumas de dinero a los ejércitos y empresas armamentísticas para destinarlas ahora " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "al desarrollo genético y a Nunca Mais ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "al desarrollo genético y a Nunca Mais " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "No todo fué perfecto en esta solución pero ya pasaron más de 20 años y".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "No todo fué perfecto en esta solución pero ya pasaron más de 20 años y" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "por eso estas tu aquí, para someterte a las pruebas de compatibilidad e intentar".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "por eso estas tu aquí, para someterte a las pruebas de compatibilidad e intentar" + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )
    length = "convertirte en un nuevo aventurero superhumano. ".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "convertirte en un nuevo aventurero superhumano. " + " ".repeat(
            (charPerLine - 2 - length) / 2
        ) + "+"
    )

    length = "Esperemos tener éxito.".length
    println(
        "+" + " ".repeat((charPerLine - 2 - length) / 2) + "Esperemos tener éxito." + " ".repeat(
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