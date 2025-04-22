package org.example

fun main(){
    println ("¡Hola, Kotlin!")
    nombre()
    mostrarTiposDeDatos()
    area()
}

fun nombre(){
    println ("Mi nombre es Mercedes Marón. Hoy es 22 de abril de 2025.")
}

fun mostrarTiposDeDatos() {
    val nombre: String = "Juan"
    val edad: Int = 25
    val altura: Double = 1.75
    val esEstudiante: Boolean = true
    
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")
}

fun area(){
    val base: Double = 4.78
    val altura: Double = 75.06
    val resultado= base*altura


    println ("El área del rectángulo es: $resultado")
}