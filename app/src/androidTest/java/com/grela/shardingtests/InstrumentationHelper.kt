package com.grela.shardingtests

import androidx.test.platform.app.InstrumentationRegistry

object InstrumentationHelper {

    fun getText(stringResource: Int) = InstrumentationRegistry.getInstrumentation().targetContext.getString(stringResource)
}