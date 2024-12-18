import com.sun.source.tree.BreakTree

fun main() {
    println("Bienvenido a Fisterra's Dungeon")
    var userDecision = menu()
    when (userDecision){
        1 ->{
            // CONTINUAR
        }
        2->{
            // NUEVA PARTIDA
        }
        0->{
            println("¡¡Adios intrépido aventurero!!")
        }
        else->{
            println("Error en Menu")
            //Variable userDecision no trae los valores esperados de 1 -> Continuar 2-> Nueva Partida o 0 -> Salir
        }
    }


}