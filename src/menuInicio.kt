import entities.output.printFrameEnd
import entities.output.printFrameErrorMenu

fun menuInicio(charPerLine:Int, totalLines:Int) {
    val userDecision = menu(charPerLine,totalLines)
    when (userDecision) {
        1 -> {
            // CONTINUAR

        }

        2 -> {
            // NUEVA PARTIDA

        }

        0 -> {
            printFrameEnd(charPerLine, totalLines)

        }

        else -> {
            printFrameErrorMenu(charPerLine, totalLines)
            //Variable userDecision no trae los valores esperados de 1 -> Continuar 2-> Nueva Partida o 0 -> Salir

        }
    }
}