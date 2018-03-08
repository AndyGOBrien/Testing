package com.llamalabb.testing

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Created by andyg on 3/8/2018.
 */
class CheckParenthesesAlgoTest {
    val mainViewModel = MainViewModel()
    @Test
    fun parenTrue_1(){
        assertTrue(mainViewModel.checkForParentheses(""))
        assertTrue(mainViewModel.checkForParentheses("()"))
        assertTrue(mainViewModel.checkForParentheses("()()(())"))
        assertTrue(mainViewModel.checkForParentheses("()sdf( asf ) asdf ( asdfa (asdf (fd) fd) dfasdf)"))
    }

    @Test
    fun parenFalse_1(){
        assertFalse(mainViewModel.checkForParentheses("("))
        assertFalse(mainViewModel.checkForParentheses(")"))
        assertFalse(mainViewModel.checkForParentheses(")("))
        assertFalse(mainViewModel.checkForParentheses("())()("))
        assertFalse(mainViewModel.checkForParentheses("()()())("))
    }
}