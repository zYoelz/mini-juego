package entities.Class

class Monster(
    name: String,
    id: Int,
    strength: Int,
    intelligence: Int,
    dexterity: Int,
    attack: Int,
    magicAttack: Int,
    defense: Int,
    maxLife: Int,
    criticRate: Int,
    magicDefense: Int,
    override var drop: ArrayList<Object>,
    ): Basic(name, id, strength, intelligence, dexterity, attack, magicAttack, defense, maxLife, criticRate, magicDefense),InterfaceMonster {
    override fun dropped(drop: ArrayList<Object>): Object {
        TODO("Not yet implemented")
    }


}