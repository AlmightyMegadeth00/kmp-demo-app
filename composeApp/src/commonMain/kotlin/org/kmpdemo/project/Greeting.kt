package org.kmpdemo.project

import kmpbluetoothdemoapp.composeapp.generated.resources.Res
import kmpbluetoothdemoapp.composeapp.generated.resources.android_teacher
import kmpbluetoothdemoapp.composeapp.generated.resources.apple_logo_black
import org.jetbrains.compose.resources.DrawableResource

class Greeting {
    companion object {
        fun getGreetingImage(): DrawableResource {
            return when(getPlatform().device) {
                Device.ANDROID -> Res.drawable.android_teacher
                Device.IOS -> Res.drawable.apple_logo_black
                Device.DESKTOP -> Res.drawable.android_teacher
                else -> throw IllegalStateException("Device not supported")
            }
        }
    }

    private val platform = getPlatform()

    fun greet(): String {
        return "Hello from ${platform.osVersion}!"
    }
}