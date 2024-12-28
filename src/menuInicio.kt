import entities.newStart
import entities.output.printFrameEnd
import entities.output.printFrameErrorMenu

fun menuInicio() {
    var salir = 0
    do {
        val userDecision = menuFunctions()
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
                salir = 1
            }

            else -> {
                printFrameErrorMenu()
                //Variable userDecision no trae los valores esperados de 1 -> Continuar 2-> Nueva Partida o 0 -> Salir

            }
        }
    } while (salir != 1)
}