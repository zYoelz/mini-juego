import entities.newStart
import entities.output.printFrameEnd
import entities.output.printFrameErrorMenu

fun menuInicio() {
    val userDecision = menu()
    when (userDecision) {
        1 -> {
            // CONTINUAR

        }

        2 -> {
            // NUEVA PARTIDA
            newStart()

        }

        0 -> {
            printFrameEnd()

        }

        else -> {
            printFrameErrorMenu()
            //Variable userDecision no trae los valores esperados de 1 -> Continuar 2-> Nueva Partida o 0 -> Salir

        }
    }
}