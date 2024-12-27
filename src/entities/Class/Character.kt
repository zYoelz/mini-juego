package entities.Class

class Character(

    name: String,
    strength: Int,
    intelligence: Int,
    dexterity: Int,
    attack: Int,
    magicAttack: Int,
    defense: Int,
    maxLife: Int,
    criticRate: Int,
    magicDefense: Int,
    override val nick: String,
    override val gear: ArrayList<Object>,
    override val characterClass: String
) : Basic(name, strength, intelligence, dexterity, attack, magicAttack, defense, maxLife, criticRate, magicDefense),
    InterfaceCharacter {
    override fun getstatsforclass(characterClass: String) {
        when (characterClass){
            "Barbarian" ->{
                strength = 10
                intelligence = 7
                dexterity = 8
            }
            "Rogues" ->{
                strength= 8
                intelligence= 7
                dexterity= 10
            }
            "Sorcerers"-> {
                strength=7
                intelligence=10
                dexterity=8
            }

        }

    }

    override fun getStatsInGear(gear: ArrayList<Object>) {
        TODO("Not yet implemented")
    }


}