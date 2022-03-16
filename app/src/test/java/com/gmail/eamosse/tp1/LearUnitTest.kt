package com.gmail.eamosse.tp1

import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class LearUnitTest {
    @Test
    fun odd_or_event_isCorrect() {
        assertTrue(oddOrEven("even", 0).isEmpty())
        assertArrayEquals(oddOrEven("even", 1).toTypedArray(), arrayOf(0))
        assertArrayEquals(oddOrEven("even", 3).toTypedArray(), arrayOf(0, 1, 3))
        assertArrayEquals(oddOrEven("odd", 3).toTypedArray(), arrayOf(0, 2, 4))

    }
    @Test
    fun facto_isCorrect() {
        assertEquals(facto(5), 120)
    }

    @Test
    fun fibo_isCorrect() {
        assertArrayEquals(fibo(5).toTypedArray(), arrayOf(0, 1, 1, 2, 3))
    }

    @Test
    fun isPrime_isCorrect() {
        assertTrue(isPrime(7))
        assertFalse(isPrime(8))
    }

    @Test
    fun prime_isCorrect() {
        assertTrue(prime(0).isEmpty())
        assertArrayEquals(prime(5).toTypedArray(), arrayOf(0, 1, 3, 5, 7))
    }


}