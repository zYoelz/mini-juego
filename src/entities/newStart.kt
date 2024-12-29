package entities

import config
import entities.Class.Character
import entities.output.Introduction.frameGetClass
import entities.output.Introduction.frameGetName
import entities.output.Introduction.printFrameClassNoValid
import entities.output.Introduction.printFrameNameNoValid
import entities.output.printFramesIntroduction

fun newStart():Character {

    printFramesIntroduction()

    var end = 0

    config.totalNoValid = 0
    config.totalJoke=0
    var charName : String = ""
    do {

        frameGetName()
        charName = readlnOrNull() ?: ""
        if (charName.length < 3 || charName.length > 20) {
            printFrameNameNoValid()
            config.totalNoValid += 1
            println("${config.totalNoValid}")
        }
        else end = 1

    } while (end != 1)
    var charClass : String = ""
    do {

        frameGetClass()
        val option = readlnOrNull() ?: ""
        when (option) {
            "1" -> {
                charClass = "Barbarian"
                end = 2

            }

            "3" -> {
                charClass = "Rogues"
                end = 2
            }

            "5" -> {
                charClass = "Sorcerers"
                end = 2
            }

            else -> {
                config.totalNoValid+=1
                printFrameClassNoValid()
                println("${config.totalNoValid}")

            }

        }

    } while (end != 2)

    var adventurous = Character(
        charName,
        charClass
    )

    return adventurous
}