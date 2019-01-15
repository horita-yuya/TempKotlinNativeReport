package com.github.horita_yuya

expect fun currentTime(): String

fun showCurrentTime() {
    println(currentTime())
}