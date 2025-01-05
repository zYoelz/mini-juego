package entities.adventurer


interface InterfaceCharacter {
    val name: String
    val characterClass: String
    var strength: Int
    var intelligence: Int
    var dexterity: Int
    var attack: Int
    var magicAttack: Int
    var defense: Int
    var magicDefense: Int
    var maxLife: Int
    var criticRate: Int

    fun getAttack(strength: Int): Int
    fun getMagicAttack(intelligence: Int): Int
    fun getDefense(strength: Int, dexterity: Int): Int
    fun getMagicDefense(intelligence: Int, dexterity: Int): Int
    fun getMaxLife(strength: Int, intelligence: Int): Int
    fun getCriticRate(dexterity: Int): Int
}