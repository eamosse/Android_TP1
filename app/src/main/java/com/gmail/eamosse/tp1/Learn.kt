package com.gmail.eamosse.tp1

/**
 * Fonction qui retourne les x premiers nombres pairs ou impairs
 */
fun oddOrEven(type: String, x: Int): List<Int> {
    if (x == 0) {
        return emptyList()
    }
    val result = mutableListOf(0)
    if (type == "even" && x > 1) {
        result.add(1)
    }
    while (result.size < x) {
        result.add(result.last() + 2)
    }
    return result
}

/**
 * Fonction qui calcule les n premirs nombres de la suite fibonacci
 */
fun fibo(nb: Int): List<Int> {
    if (nb == 0)
        return listOf()
    var nb1 = 0
    var nb2 = 1
    val result = mutableListOf<Int>()
    result.add(nb1)
    result.add(nb2)
    for (i in 1..nb) {
        nb1 = result.getOrElse(i - 1) {
            nb1
        }
        nb2 = result.getOrElse(i + 1) {
            nb2
        }
        result.add(nb1 + nb2)
    }

    return result

}

/**
 * Calcule le factoriel d'un nombre
 */
fun facto(x: Int = 10): Int {
    var facto = 1
    for (i in x downTo 1) {
        facto *= i
    }
    return facto
}

fun isPrime(nb: Int): Boolean {
    if (nb <= 3) {
        return true
    }
    for (i in 2 until nb) {
        if (nb % i == 0) {
            return false
        }
    }
    return true;
}

/**
 * Calcule les x premiers nombre premiers
 */
fun prime(nb: Int): List<Int> {
    val primes = mutableListOf<Int>()
    if (nb == 0) {
        return listOf()
    }
    for (i in 1..nb) {
        if (isPrime(i)) {
            primes.add(i)
        }
    }
    print(primes)
    return primes
}
