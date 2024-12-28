package entities.output

import entities.output.Introduction.frame2Introduction
import entities.output.Introduction.frame1Introduction
import entities.output.Introduction.frame3Introduction
import entities.output.Introduction.frame4Introduction


fun printFramesIntroduction() {
    frame1Introduction()
    var read=readlnOrNull()?:"0"
    if (read == "1")return

    frame2Introduction()
    read=readlnOrNull()?:"0"
    if (read == "1")return

    frame3Introduction()
    read=readlnOrNull()?:"0"
    if (read == "1")return

    frame4Introduction()
    read=readlnOrNull()?:"0"
    if (read == "1")return
}