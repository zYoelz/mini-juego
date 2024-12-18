package entities.Class

class Character(

    name: String,
    id: Int,
    strength: Int,
    intelligence: Int,
    dexterity: Int, attack: Int,
    magicAttack: Int,
    defense: Int,
    maxLife: Int,
    criticRate: Int,
    magicDefense: Int,
    override val nick: String,
    override val gear: ArrayList<Object>,
    override val characterClass: String
) : Basic(name, id, strength, intelligence, dexterity, attack, magicAttack, defense, maxLife, criticRate, magicDefense),
    InterfaceCharacter {
    override fun getStatsInGear(gear: ArrayList<Object>) {
        TODO("Not yet implemented")
    }


}