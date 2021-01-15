package com.irfan.sharedpref

import android.content.Context
import java.lang.IllegalStateException


/**
 * Auhtor: Irfan Khan
 * Date:   07/01/2021.
 */

class SharedPref private constructor(name: String, context: Context) {
    private val sharePref = context.getSharedPreferences(name, Context.MODE_PRIVATE)
    private val editor = sharePref.edit()

    //Reading
    fun read(key: String, defaultValue: String): String {
        return sharePref.getString(key, defaultValue)!!
    }

    fun read(key: String, defaultValue: Boolean): Boolean {
        return sharePref.getBoolean(key, defaultValue)
    }

    fun read(key: String, defaultValue: Int): Int {
        return sharePref.getInt(key, defaultValue)
    }

    fun read(key: String, defaultValue: Long): Long {
        return sharePref.getLong(key, defaultValue)
    }

    fun read(key: String, defaultValue: Float): Float {
        return sharePref.getFloat(key, defaultValue)
    }

    //writing

    fun save(key: String, value: String) {
        editor.putString(key, value)
        editor.commit()
    }

    fun save(key: String, value: Boolean) {
        editor.putBoolean(key, value)
        editor.commit()
    }

    fun save(key: String, value: Int) {
        editor.putInt(key, value)
        editor.commit()
    }

    fun save(key: String, value: Long) {
        editor.putLong(key, value)
        editor.commit()
    }

    fun save(key: String, value: Float) {
        editor.putFloat(key, value)
        editor.commit()
    }


    companion object {
        private var instance: SharedPref? = null

        @JvmStatic
        fun initialize(name: String = "mysharedPref", context: Context) {

            if (instance == null)
                instance = SharedPref(name, context)
            else
                throw IllegalStateException("SharedPrefUtils is already initialised")

        }

        fun getInstance(): SharedPref {
            if (instance == null)
                throw IllegalStateException("SharedPrefUtils is not initialised")
            return instance!!
        }


    }
}