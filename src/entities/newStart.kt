package entities

import entities.adventurer.Character
import entities.output.introduction.frameGetClass
import entities.output.introduction.frameGetName
import entities.output.introduction.printFrameClassNoValid
import entities.output.introduction.printFrameNameNoValid
import entities.output.printFramesIntroduction
import entities.save.saveAdventurer

fun newStart(): Character {

    var totalJoke = printFramesIntroduction()

    var end = 0

    var totalNoValid = 0
    var charName: String = ""
    do {

        frameGetName()
        charName = readlnOrNull() ?: ""
        if (charName.length < 3 || charName.length > 20) {
            printFrameNameNoValid()
            totalNoValid += 1
            println("${totalNoValid}")
        } else end = 1

    } while (end != 1)
    var charClass: String = ""
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
                totalNoValid += 1
                printFrameClassNoValid(totalNoValid, totalJoke)
                println("${totalNoValid}")

            }

        }

    } while (end != 2)

    val adventurer = Character(
        charName,
        charClass
    )
    println(adventurer)
    saveAdventurer(adventurer, "adventours.dat")

    return adventurer
}


