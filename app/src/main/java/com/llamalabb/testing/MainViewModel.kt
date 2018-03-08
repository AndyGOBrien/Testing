package com.llamalabb.testing

import android.databinding.ObservableField
import android.graphics.Color

/**
 * Created by andyg on 3/8/2018.
 */
class MainViewModel {

    val sentence: ObservableField<String> = ObservableField("")
    val background = ObservableBackground()

    init{
        background.setColorValue(Color.LTGRAY)
    }

    fun checkForParentheses(str: String) : Boolean{
        var closeCount = 0
        var openCount = 0
        str.forEach{
            when {
                closeCount > openCount -> return false
                it == ')' -> closeCount++
                it == '(' -> openCount++
            }
        }
        return closeCount == openCount
    }

    fun checkButtonClicked(){
        sentence.notifyChange()
        val bool = checkForParentheses(sentence.get())

        if(bool){
            background.setColorValue(Color.GREEN)
        } else {
            background.setColorValue(Color.RED)
        }
    }

}