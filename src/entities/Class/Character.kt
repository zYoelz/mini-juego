package entities.Class

class Character(

    name: String,
    override val characterClass: String
) : Basic(name),
    InterfaceCharacter {

    override val gear: ArrayList<Object> = TODO()
    override fun getstatsforclass(characterClass: String) {
        when (characterClass) {
            "Barbarian" -> {
                strength = 10
                intelligence = 7
                dexterity = 8
            }

            "Rogues" -> {
                strength = 8
                intelligence = 7
                dexterity = 10
            }

            "Sorcerers" -> {
                strength = 7
                intelligence = 10
                dexterity = 8
            }

        }

    }

    override fun getStatsInGear(gear: ArrayList<Object>) {
        TODO("Not yet implemented")
    }


}