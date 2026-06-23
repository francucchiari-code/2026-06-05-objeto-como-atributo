package org.example

class Persona(
    private var nombre: String,
    private var apellido: String,
    private var nacimiento: Fecha
) {
    override fun toString(): String {
        return "Persona(nombre=$nombre, apellido=$apellido, nacimiento=$nacimiento)"
    }
}