package org.kmpdemo.project

interface Platform {
    val device: Device
    val osVersion: String
}

expect fun getPlatform(): Platform

enum class Device(val deviceName: String) {
    ANDROID("Android"),
    IOS("IOS"),
    DESKTOP("DESKTOP")
}