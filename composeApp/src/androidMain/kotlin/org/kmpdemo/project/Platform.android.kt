package org.kmpdemo.project

import android.os.Build

class AndroidPlatform : Platform {
    override val osVersion: String = "Android SDK v${Build.VERSION.SDK_INT}"
    override val device = Device.ANDROID
}

actual fun getPlatform(): Platform = AndroidPlatform()