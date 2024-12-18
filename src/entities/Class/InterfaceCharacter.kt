package entities.Class


interface InterfaceCharacter {
    val nick: String
    val characterClass:String
    val gear: ArrayList<Object>

    fun getStatsInGear (gear:ArrayList<Object>)

}