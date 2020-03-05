package com.grela.shardingtests

import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickOn
import java.lang.Thread.sleep

class HomeScreenRobot {
    companion object {
        infix fun homeScreen(func: HomeScreenRobot.() -> Unit) = HomeScreenRobot().apply { func() }
    }

    fun screenIsShown() {
        assertDisplayed(R.id.nav_host_fragment)
    }

    fun tapOnNextButton() {
        clickOn(R.id.button_first)
    }

    fun firstFragmentIsShown() {
        sleep(100000)
        assertDisplayed(R.id.textview_first)
    }

    fun secondFragmentIsShown() {
        assertDisplayed(R.id.textview_second)
    }

    fun tapOnFab() {
        clickOn(R.id.fab)
    }

    fun snackbarIsShown() {
        assertDisplayed(InstrumentationHelper.getText(R.string.snackbar_text))
    }

    fun generateRandomFailure() {
        val random = (1..4).shuffled().first()
        if (random > 1) {
            assertDisplayed(R.id.textview_second)
        }
    }
}