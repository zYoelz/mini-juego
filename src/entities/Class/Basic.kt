package entities.Class

open class Basic(
    override val name: String,
    override val id: Int,
    override var strength: Int,
    override var intelligence: Int,
    override var dexterity: Int,
    override var attack: Int,
    override var magicAttack: Int,
    override var defense: Int,
    override var maxLife: Int,
    override var criticRate: Int,
    override var magicDefense: Int

): interfaceBasic {
    override fun getAttack(strength: Int) {
        TODO("Not yet implemented")
    }

    override fun getMagicAttack(intelligence: Int) {
        TODO("Not yet implemented")
    }

    override fun getDefense(strength: Int, dexterity: Int) {
        TODO("Not yet implemented")
    }

    override fun getMagicDefense(intelligence: Int, dexterity: Int) {
        TODO("Not yet implemented")
    }

    override fun getMaxLife(strength: Int, intelligence: Int) {
        TODO("Not yet implemented")
    }

    override fun getCriticRate(dexterity: Int) {
        TODO("Not yet implemented")
    }


}