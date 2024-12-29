package entities.Class

class Monster(
    name: String,

    override var drop: ArrayList<Object>,
    override var id: Int,
    ): Basic(name),InterfaceMonster {

    override fun getId() {
        TODO("Not yet implemented")
    }

    override fun dropped(drop: ArrayList<Object>): Object {
        TODO("Not yet implemented")
    }


}