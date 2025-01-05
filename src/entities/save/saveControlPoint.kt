package entities.save

import java.io.File
import java.io.ObjectOutputStream

fun saveControlPoint(save: Save, fileName: String) {
    File(fileName).outputStream().use { fileOutput -> // Abre un flujo de salida al archivo
        ObjectOutputStream(fileOutput).use { objectOutput -> // Envuelve el flujo para serializar objetos
            objectOutput.writeObject(save) // Escribe el objeto serializable en el archivo
        } // El `ObjectOutputStream` se cierra automáticamente aquí
    } // El `FileOutputStream` se cierra automáticamente aquí
}