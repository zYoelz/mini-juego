package entities.Class

interface InterfaceMonster {
    var drop: ArrayList<Object>
    var id: Int
    fun getId()
    fun dropped(drop: ArrayList<Object>): Object
}