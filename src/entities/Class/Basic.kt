package entities.Class

import balanceConfig

open class Basic(
    override val name: String,


) : interfaceBasic {

    override var strength: Int = 0
    override var intelligence: Int = 0
    override var dexterity: Int = 0
    override var attack: Int = 0
    override var magicAttack: Int = 0
    override var defense: Int = 0
    override var maxLife: Int = 0
    override var criticRate: Int = 0
    override var magicDefense: Int = 0

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