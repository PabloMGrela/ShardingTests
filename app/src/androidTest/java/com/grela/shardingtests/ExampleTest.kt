package com.grela.shardingtests

import androidx.test.rule.ActivityTestRule
import com.grela.shardingtests.HomeScreenRobot.Companion.homeScreen
import org.junit.Rule
import org.junit.Test

class ExampleTest {
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
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_when_next_button_is_clicked_then_fragment_is_changed() {
        init()
        homeScreen {
            firstFragmentIsShown()
            tapOnNextButton()
            generateRandomFailure()
            secondFragmentIsShown()
        }
    }

    @Test
    fun given_new_user_when_fab_button_is_pressed_then_snackbar_is_shown() {
        init()
        homeScreen {
            firstFragmentIsShown()
            tapOnFab()
            generateRandomFailure()
            snackbarIsShown()
        }
    }

    @Test
    fun given_new_user_home_screen_is_displayed_copy() {
        init()
        homeScreen {
            screenIsShown()
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_when_next_button_is_clicked_then_fragment_is_changed_copy() {
        init()
        homeScreen {
            firstFragmentIsShown()
            tapOnNextButton()
            secondFragmentIsShown()
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_when_fab_button_is_pressed_then_snackbar_is_shown_copy() {
        init()
        homeScreen {
            firstFragmentIsShown()
            tapOnFab()
            snackbarIsShown()
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_home_screen_is_displayed_copy1() {
        init()
        homeScreen {
            screenIsShown()
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_home_screen_is_displayed_copy2() {
        init()
        homeScreen {
            screenIsShown()
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_home_screen_is_displayed_copy3() {
        init()
        homeScreen {
            screenIsShown()
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_home_screen_is_displayed_copy4() {
        init()
        homeScreen {
            screenIsShown()
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_home_screen_is_displayed_copy5() {
        init()
        homeScreen {
            screenIsShown()
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_home_screen_is_displayed_copy6() {
        init()
        homeScreen {
            screenIsShown()
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_home_screen_is_displayed_copy7() {
        init()
        homeScreen {
            screenIsShown()
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_home_screen_is_displayed_copy8() {
        init()
        homeScreen {
            screenIsShown()
            generateRandomFailure()
        }
    }

    @Test
    fun given_new_user_home_screen_is_displayed_copy9() {
        init()
        homeScreen {
            screenIsShown()
            generateRandomFailure()
        }
    }
}