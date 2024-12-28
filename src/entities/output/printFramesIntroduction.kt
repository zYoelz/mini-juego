package entities.output

import entities.output.Introduction.*

fun printFramesIntroduction() {
    frame1Introduction()
    var read = readlnOrNull() ?: "0"
    if (read == "1") return

    frame2Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return

    frame3Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return

    frame4Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return

    frame5Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return
}