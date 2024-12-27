package entities.Class

class Monster(
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
    override var drop: ArrayList<Object>,
    override var id: Int,
    ): Basic(name, strength, intelligence, dexterity, attack, magicAttack, defense, maxLife, criticRate, magicDefense),InterfaceMonster {
    override fun getId() {
        TODO("Not yet implemented")
    }

    override fun dropped(drop: ArrayList<Object>): Object {
        TODO("Not yet implemented")
    }


}