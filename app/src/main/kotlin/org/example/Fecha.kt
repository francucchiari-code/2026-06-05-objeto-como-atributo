package org.example.app

class Fecha (private var dia: Int, private var mes: Int, private var año: Int) {
     override fun toString():String{    
     return "fecha(${dia}/${mes}/${año})"
    }
}