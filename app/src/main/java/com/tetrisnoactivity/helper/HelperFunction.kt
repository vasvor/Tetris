package com.tetrisnoactivity.helper
// Вспомогательные функции.
fun array2dOfByte(sizeOuter: Int, sizeInner: Int): Array<ByteArray> =
    Array(sizeOuter) { ByteArray(sizeInner) }

