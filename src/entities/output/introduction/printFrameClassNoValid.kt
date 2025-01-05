package entities.output.introduction

import config.charPerLine
import entities.output.printFramesEndLines
import entities.output.printFramesStartLines

fun  printFrameClassNoValid(totalNoValid:Int,totalJoke:Int) {
    var getocupiedLines=10
    println("total no valid ${totalNoValid}")
    println("total joke ${totalJoke}")
    if (totalNoValid > 3)getocupiedLines+=1
    if (totalJoke > 2)getocupiedLines+=1
    if (totalNoValid > 2 && totalJoke > 3) getocupiedLines+=1
    val occupiedLines = getocupiedLines
    val addStartLines = 0
    val addEndLines = 0
    var time: Long=3000

    val lineaAdd = printFramesStartLines(occupiedLines, addStartLines)

    val length =
        "               ¡Eeeeeooooo! Tu valor de inteligencia no debe llegar a 5. Elige correctamente la clase.                ".length
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
    if (totalNoValid > 3) {
        var lengthNovalid = "Te lo digo por que parece que te estrellas en todas las preguntas, ¿sabes leer?".length
        println(
            "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+" + " ".repeat(
                (length - lengthNovalid-2)/2
            )+"Te lo digo por que parece que te estrellas en todas las preguntas, ¿sabes leer? "+ " ".repeat(
                (length - lengthNovalid-2)/2
            )+ "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+"
        )
        time+=2000

    }
    if (totalJoke > 2) {
        var lengthJoke = "Además deja de escribir tonterías cuando no hace falta, pareces un niño pequeño con un folio en blanco.".length
        println(
            "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+" + " ".repeat(
                (length - lengthJoke-2)/2
            )+"Además deja de escribir tonterías cuando no hace falta, pareces un niño pequeño con un folio en blanco. "+ " ".repeat(
                (length - lengthJoke-2)/2
            )+ "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+"
        )
        time+=3000
    }
    if (totalNoValid > 3 && totalJoke > 2) {
        var lengthNoValidJoke = "Menos mal que esta modificación te curará tu tara. ".length
        println(
            "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+" + " ".repeat(
                (length - lengthNoValidJoke-2)/2
            )+"Menos mal que esta modificación te curará tu tara.  "+ " ".repeat(
                (length - lengthNoValidJoke-2)/2
            )+ "+" + " ".repeat((charPerLine - 2 - length) / 2) + "+"
        )
        time+=3000
    }
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
    printFramesEndLines(occupiedLines, addEndLines)

    Thread.sleep(time)


}