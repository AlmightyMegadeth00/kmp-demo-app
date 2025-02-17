package org.kmpdemo.project

class JVMPlatform: Platform {
    override val device = Device.DESKTOP
    override val osVersion: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()