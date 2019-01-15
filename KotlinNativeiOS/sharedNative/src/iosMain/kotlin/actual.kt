package com.github.horita_yuya

import kotlinx.coroutines.*
import platform.Foundation.NSDate
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_main_queue
import kotlin.coroutines.CoroutineContext
import kotlin.native.concurrent.freeze
import kotlin.native.concurrent.isFrozen

actual fun currentTime(): String {
    return NSDate().toString()
}

fun crash() {
    throw Exception()
}