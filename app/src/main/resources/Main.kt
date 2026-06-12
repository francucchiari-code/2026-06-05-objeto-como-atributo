package org.example

import org.example.app.App
import org.example.app.Polinomio
import org.example.app.Cuadratica

fun main(){
    println(App().mostrarFecha())
    val unpolinomio=Polinomio()
    println(unpolinomio)
    val unaCuadratica=Cuadratica()
    println(unaCuadratica)

var objeto: Polinomio 
objeto=Polinomio
objeto=Cuadratica()
println(objeto)
var lista=ArrayList<Polinomio>()

lista.add(Cuadratica())

lista.add(Polinomio())

lista.add(CuadraticaMejor())

for (var p : lista){
    println(p)
}