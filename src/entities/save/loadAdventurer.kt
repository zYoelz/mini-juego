package entities.save
import entities.output.printFrameError
import java.io.File
import java.io.ObjectInputStream

fun loadAdventurer(fileName: String): Character? {
    return if (File(fileName).exists()) {
        File(fileName).inputStream().use { fileInput ->
            ObjectInputStream(fileInput).use { objectInput ->
                val character = objectInput.readObject() as Character
                character
            }
        }
    } else {
        printFrameError()
        null
    }
}