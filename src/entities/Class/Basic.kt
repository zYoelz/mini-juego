package entities.Class

import balanceConfig

open class Basic(
    override val name: String,
    override var strength: Int,
    override var intelligence: Int,
    override var dexterity: Int,
    override var attack: Int,
    override var magicAttack: Int,
    override var defense: Int,
    override var maxLife: Int,
    override var criticRate: Int,
    override var magicDefense: Int

) : interfaceBasic {
    override fun getAttack(strength: Int) {
        attack = balanceConfig.attackConfig * strength
    }

    override fun getMagicAttack(intelligence: Int) {
        magicAttack = balanceConfig.magicAttackConfig * intelligence
    }

    override fun getDefense(strength: Int, dexterity: Int) {
        defense = balanceConfig.defenseConfig * (strength + 0.2 * dexterity).toInt()
    }

    override fun getMagicDefense(intelligence: Int, dexterity: Int) {
        magicDefense = balanceConfig.magicDefenseConfig * (intelligence + 0.2 * dexterity).toInt()
    }

    override fun getMaxLife(strength: Int, intelligence: Int) {
        maxLife = balanceConfig.maxLifeConfig * (10 * strength + 10 * intelligence)
    }

    override fun getCriticRate(dexterity: Int) {
        criticRate = balanceConfig.criticRateConfig * (5 + (0.2 * dexterity).toInt())
    }


}