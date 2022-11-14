package com.tetrisnoactivity.storage

import android.content.Context
import android.content.SharedPreferences
// Context - доступ к ресурсам приложения.
class AppPreferences(ctx: Context) {
    var data: SharedPreferences = ctx.getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE)
    // Cохранение очков в файле настроек.
    fun saveHighScore(highScore: Int) {
        data.edit().putInt("HIGH_SCORE", highScore).apply()
    }
    // Возвращает наибольшее количество очков.
    fun getHighScore(): Int {
        return data.getInt("HIGH_SCORE", 0)
    }
    // Сбрасывает наибольшее значение очков.
    fun clearHighScore() {
        data.edit().putInt("HIGH_SCORE", 0).apply()
    }
}