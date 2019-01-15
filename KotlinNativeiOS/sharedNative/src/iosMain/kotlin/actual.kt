package com.github.horita_yuya

import platform.Foundation.NSDate

actual fun currentTime(): String {
    return NSDate().toString()
}

fun crash() {
    throw Exception()
}