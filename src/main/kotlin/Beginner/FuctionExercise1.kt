package org.delcom.Beginner

import kotlin.math.PI

fun circleAreaInt(radius: Int): Double {
    return PI * radius * radius
}

fun main() {
    println(circleAreaInt(radius = 2))
}