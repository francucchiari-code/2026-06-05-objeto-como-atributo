package org.example

fun main() {
    println(Persona("Juana", "Muriel", Fecha(5, 6, 2026)))

    val polinomio: Polinomio = Polinomio()
    println(polinomio)

    val cuadratica: Cuadratica = Cuadratica()
    println(cuadratica)

    val cuadraticamejor: CuadraticaMejor = CuadraticaMejor()
    println(cuadraticamejor)

    var objeto: Polinomio
    objeto = Cuadratica()
    println(objeto)
    objeto = CuadraticaMejor()
    println(objeto)

    var lista = ArrayList<Polinomio>()
    lista.add(Cuadratica())
    lista.add(Polinomio())
    lista.add(CuadraticaMejor())
    for (p in lista) {
        println(p)
    }

    // Código de Terminos corregido y acomodado adentro del main
    val t1 = Termino(2,2)
    val t2 = Termino(4,1)
    val t3 = Termino(-3,0)
    val p1 = Polinomio(listOf(t1,t2,t3))
    val t4 = Termino(1,3)
    val t5 = Termino(0,2)
    val t6 = Termino(-1,1)
    val t7 = Termino(2,0)
    val p2 = Polinomio(listOf(t4, t5, t6, t7))
    
    println(p1)
    println(p2)
}


