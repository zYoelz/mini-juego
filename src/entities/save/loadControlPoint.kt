package entities.save
import entities.output.printFrameError
import java.io.File
import java.io.ObjectInputStream

fun loadControlPoint(fileName: String): Save? {
    return if (File(fileName).exists()) {
        File(fileName).inputStream().use { fileInput ->
            ObjectInputStream(fileInput).use { objectInput ->
                val save = objectInput.readObject() as Save
                save
            }
        }
    } else {
        printFrameError()
        null
    }
}