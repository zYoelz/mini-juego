package entities

import entities.adventurer.Character
import entities.output.introduction.frameGetClass
import entities.output.introduction.frameGetName
import entities.output.introduction.printFrameClassNoValid
import entities.output.introduction.printFrameNameNoValid
import entities.output.printFramesIntroduction
import entities.save.Save
import entities.save.saveAdventurer
import entities.save.saveControlPoint

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
            }

        }

    } while (end != 2)

    val adventurer = Character(
        charName,
        charClass
    )
    println(adventurer)
    saveAdventurer(adventurer, "adventurer.dat")
    val save=Save(adventurer,0,0)
    saveControlPoint(save,"save.dat")

    return adventurer
}


