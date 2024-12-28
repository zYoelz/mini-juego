import entities.output.printFrameMenu
import entities.output.printFrameOptionNoValid

fun menuFunctions(): Int {

    var repeat:Int
    do {
        printFrameMenu()
        val decision = readlnOrNull()?:"0"
        when (decision) {
            "1" -> return 1
            "2" -> return 2
            "0" -> return 0

            else -> {
                printFrameOptionNoValid()
                Thread.sleep(2000)
                repeat = 1
            }
        }

    } while (repeat == 1)

    return 0
}