package org.example

class Fecha (private var dia: Int, private var mes: Int, private var año: Int) {
    override fun toString():String{    
    return "fecha(${dia}/${mes}/${año})"
    }
}