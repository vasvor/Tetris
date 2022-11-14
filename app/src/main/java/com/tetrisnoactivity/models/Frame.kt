package com.tetrisnoactivity.models

import com.tetrisnoactivity.helper.array2dOfByte

// Объектные модели. Width - ширина генерируемого фрейма.
class Frame(private val width: Int) {
    val data: ArrayList<ByteArray> = ArrayList() //data - список элементов массива в пространстве ByteArray.

    // addRow - преобразует отдельный элемент строки в байтовое представление и добавляет в массив row.
    fun addRow(byteStr: String): Frame {
        val row = ByteArray(byteStr.length)

        for (index in byteStr.indices) {
            row[index] = "${byteStr[index]}".toByte()
        }
        data.add(row) // Добавляем массив в список данных.
        return this
    }
    // Преобразуем сптсок данных в байтовый массив.
    fun as2dByteArray(): Array<ByteArray> {
        val bytes = array2dOfByte(data.size, width)
        return data.toArray(bytes)
    }


}