package com.kkxx.sputils

import android.content.SharedPreferences

class SPUtils private constructor() {
    private val spMutableMap: MutableMap<String, SharedPreferences> = mutableMapOf()
    private val spEditorMap: MutableMap<String, SharedPreferences> = mutableMapOf()

    companion object {
        val instance = SingletonHolder.holder
    }

    private object SingletonHolder {
        val holder = SPUtils()
    }
}