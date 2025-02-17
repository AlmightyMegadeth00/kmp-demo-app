package org.kmpdemo.project

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val device = Device.IOS
    override val osVersion: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()