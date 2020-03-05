package com.grela.shardingtests

import androidx.test.rule.ActivityTestRule
import com.grela.shardingtests.HomeScreenRobot.Companion.homeScreen
import org.junit.Rule
import org.junit.Test

class ExampleTests {
    @get: Rule
    val homeActivityTestRule = object : ActivityTestRule<MainActivity>(MainActivity::class.java, false, false) {}

    private fun init() {
        homeActivityTestRule.launchActivity(null)
    }

    @Test
    fun given_new_user_home_screen_is_displayed() {
        init()
        homeScreen {
            screenIsShown()
        }
    }

    @Test
    fun given_new_user_when_next_button_is_clicked_then_fragment_is_changed() {
        init()
        homeScreen {
            firstFragmentIsShown()
            tapOnNextButton()
            secondFragmentIsShown()
        }
    }

    @Test
    fun given_new_user_when_fab_button_is_pressed_then_snackbar_is_shown() {
        init()
        homeScreen {
            firstFragmentIsShown()
            tapOnFab()
            snackbarIsShown()
        }
    }

    @Test
    fun given_new_user_home_screen_is_displayed_copy() {
        init()
        homeScreen {
            screenIsShown()
        }
    }

    @Test
    fun given_new_user_when_next_button_is_clicked_then_fragment_is_changed_copy() {
        init()
        homeScreen {
            firstFragmentIsShown()
            tapOnNextButton()
            secondFragmentIsShown()
        }
    }

    @Test
    fun given_new_user_when_fab_button_is_pressed_then_snackbar_is_shown_copy() {
        init()
        homeScreen {
            firstFragmentIsShown()
            tapOnFab()
            snackbarIsShown()
        }
    }
}