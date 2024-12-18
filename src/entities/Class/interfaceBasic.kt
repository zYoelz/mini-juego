package entities.Class

interface interfaceBasic {
    val name: String
    val id:Int
    var strength: Int
    var intelligence : Int
    var dexterity: Int
    var attack: Int
    var magicAttack: Int
    var defense: Int
    var magicDefense: Int
    var maxLife: Int
    var criticRate: Int

    fun getAttack (strength: Int)
    fun getMagicAttack (intelligence: Int)
    fun getDefense (strength: Int,dexterity: Int)
    fun getMagicDefense (intelligence: Int,dexterity: Int)
    fun getMaxLife (strength: Int, intelligence: Int)
    fun getCriticRate (dexterity: Int)


}