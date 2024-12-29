package entities.output

import config
import entities.output.Introduction.*


fun printFramesIntroduction() {

    frame1Introduction()
    var read = readlnOrNull() ?: "0"
    if (read == "1") return
    else if (read !="") config.totalJoke+=1
    println("${config.totalJoke}")

    frame2Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return
    else if (read !="") config.totalJoke+=1
    println("${config.totalJoke}")

    frame3Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return
    else if (read !="") config.totalJoke+=1
    println("${config.totalJoke}")

    frame4Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return
    else if (read !="") config.totalJoke+=1
    println("${config.totalJoke}")

    frame5Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return
    else if (read !="") config.totalJoke+=1
    println("${config.totalJoke}")

}