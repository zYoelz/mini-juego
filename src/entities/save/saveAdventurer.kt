package entities.save

import entities.adventurer.Character
import java.io.File
import java.io.ObjectOutputStream

fun saveAdventurer(character: Character, fileName: String) {
    File(fileName).outputStream().use { fileOutput -> // Abre un flujo de salida al archivo
        ObjectOutputStream(fileOutput).use { objectOutput -> // Envuelve el flujo para serializar objetos
            objectOutput.writeObject(character) // Escribe el objeto serializable en el archivo
        } // El `ObjectOutputStream` se cierra automáticamente aquí
    } // El `FileOutputStream` se cierra automáticamente aquí
}