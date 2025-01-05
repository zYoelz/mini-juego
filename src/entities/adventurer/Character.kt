package entities.adventurer
import balanceConfig
import java.io.Serializable

class Character(

    override val name: String,
    override val characterClass: String

) : InterfaceCharacter,Serializable {

    init {
        setStrengthForClass(characterClass)
        setIntelligenceForClass(characterClass)
        setDexterityForClass(characterClass)
    }



    override var strength: Int
        get() = calculateStrength()
        set(value) {
            baseStrength = value
        }
    override var intelligence: Int
        get() = calculateIntelligence()
        set(value) {
            baseIntelligence = value
        }
    override var dexterity: Int
        get() = calculateDexterity()
        set(value) {
            baseDexterity = value
        }
    override var attack: Int
        get() = getAttack(strength)
        set(value) {}
    override var magicAttack: Int
        get() = getMagicAttack(intelligence)
        set(value) {}
    override var criticRate: Int
        get() = getCriticRate(dexterity)
        set(value) {}
    override var defense: Int
        get() = getDefense(strength, dexterity)
        set(value) {}
    override var magicDefense: Int
        get() = getMagicDefense(intelligence, dexterity)
        set(value) {}
    override var maxLife: Int
        get() = getMaxLife(strength, intelligence)
        set(value) {

        }

    private var baseStrength: Int = 0
    private fun getStrengthForClass(characterClass: String): Int {
        return when (characterClass) {
            "Barbarian" -> 20
            "Rogues" -> 15
            "Sorcerers" -> 12
            else -> 0

        }

    }

    fun setStrengthForClass(characterClass: String) {
        baseStrength = getStrengthForClass(characterClass)
    }

    private fun calculateStrength(): Int {
        val gearBonus = 0
        return baseStrength + gearBonus
    }


    private var baseIntelligence: Int = 0
    private fun getIntelligenceForClass(characterClass: String): Int {
        return when (characterClass) {
            "Barbarian" -> 10
            "Rogues" -> 12
            "Sorcerers" -> 20
            else -> 0
        }
    }

    fun setIntelligenceForClass(characterClass: String) {
        baseIntelligence = getIntelligenceForClass(characterClass)
    }

    private fun calculateIntelligence(): Int {
        val gearBonus = 0
        return baseIntelligence + gearBonus
    }


    private var baseDexterity: Int = 0
    private fun getDexterityForClass(characterClass: String): Int {
        return when (characterClass) {
            "Barbarian" -> 15
            "Rogues" -> 20
            "Sorcerers" -> 10
            else -> 0
        }
    }

    fun setDexterityForClass(characterClass: String) {
        baseDexterity = getDexterityForClass(characterClass)
    }

    private fun calculateDexterity(): Int {
        val gearBonus = 0
        return baseDexterity + gearBonus
    }

    override fun getAttack(strength: Int): Int {
        return balanceConfig.attackConfig * strength
    }

    override fun getMagicAttack(intelligence: Int): Int {
        return balanceConfig.magicAttackConfig * intelligence
    }

    override fun getDefense(strength: Int, dexterity: Int): Int {
        return balanceConfig.defenseConfig * (strength + 0.2 * dexterity).toInt()
    }

    override fun getMagicDefense(intelligence: Int, dexterity: Int): Int {
        return balanceConfig.magicDefenseConfig * (intelligence + 0.2 * dexterity).toInt()
    }

    override fun getMaxLife(strength: Int, intelligence: Int): Int {
        return balanceConfig.maxLifeConfig * (10 * strength + 10 * intelligence)
    }

    override fun getCriticRate(dexterity: Int): Int {
        return balanceConfig.criticRateConfig * (5 + (0.2 * dexterity).toInt())
    }


    override fun toString(): String {
        return """
            Nombre=$name           Clase:$characterClass
            Fuerza=$strength         Ataque=$attack                    Vida=$maxLife
            Destreza=$dexterity          Ataque Mágico=$magicAttack           Defensa=$defense
            Inteligencia=$intelligence     Probabilidad de Crítico=$criticRate        Defensa Magica=$magicDefense
            """.trimIndent()
    }

}


