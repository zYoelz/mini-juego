package entities.output

import entities.output.introduction.*


fun printFramesIntroduction():Int {
    var totalJoke = 0
    frame1Introduction()
    var read = readlnOrNull() ?: "0"
    if (read == "1") return 0
    else if (read !="") totalJoke+=1
    println("${totalJoke}")

    frame2Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return 0
    else if (read !="") totalJoke+=1
    println("${totalJoke}")

    frame3Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return 0
    else if (read !="") totalJoke+=1
    println("${totalJoke}")

    frame4Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return 0
    else if (read !="") totalJoke+=1
    println("${totalJoke}")

    frame5Introduction()
    read = readlnOrNull() ?: "0"
    if (read == "1") return 0
    else if (read !="") totalJoke+=1
    println("${totalJoke}")

    return totalJoke

}