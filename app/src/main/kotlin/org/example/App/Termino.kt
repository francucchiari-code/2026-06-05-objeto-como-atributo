package org.example

data class Termino(
    val coeficiente: Int = 2
    val exponente: Int = 3
    override fun toString(): String {
        return "${coeficiente}x^${exponente}"
    }