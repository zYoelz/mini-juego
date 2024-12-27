import entities.output.printFrameMenu
import entities.output.printFrameOptionNoValid

fun menu(charPerLine:Int,totalLines:Int): Int {

    var repeat:Int
    do {
        printFrameMenu(charPerLine,totalLines)
        val decision = readlnOrNull()?:"0"
        when (decision) {
            "1" -> return 1
            "2" -> return 2
            "0" -> return 0

            else -> {
                printFrameOptionNoValid(charPerLine, totalLines)
                Thread.sleep(2000)
                repeat = 1
            }
        }

    } while (repeat == 1)

    return 0
}