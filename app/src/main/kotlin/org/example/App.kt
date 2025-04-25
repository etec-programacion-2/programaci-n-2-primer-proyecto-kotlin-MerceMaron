package org.example

fun main(){
    println ("¡Hola, Kotlin!")
    nombre()
    mostrarTiposDeDatos()
    area()
    val numero: Int = 4
    val par=esParOImpar(numero)
    val tipo=tipoNumero(numero)
    println(par)
    println(tipo)
    mostrarNumerosConLoops()
    numerosPares()

    exponente()

}

fun nombre(){
    println ("Mi nombre es Mercedes Marón. Hoy es 22 de abril de 2025.")
}
//------------------------------
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
//------------------------------------

fun esParOImpar(numero: Int): String {
    return when {
        numero % 2 == 0 -> "Par"
        else -> "Impar"
    }
}

fun tipoNumero(numero: Int): String {
    return when {
        numero < 0 -> "Negativo"
        numero > 0 -> "Positivo"
        else -> "Cero"
    }
}
//----------------------------
fun mostrarNumerosConLoops() {
    // Usando for
    println("Usando for:")
    for (i in 1..10) {
        println(i)
    }
    
    // Usando while
    println("\nUsando while:")
    var j = 1
    while (j <= 10) {
        println(j)
        j++
    }
    
    // Usando do-while
    println("\nUsando do-while:")
    var k = 1
    do {
        println(k)
        k++
    } while (k <= 10)
}


fun numerosPares(){
    println("Números pares usando for: ")
    for (i in 2..20 step 2){
        println(i)
    }
    println("Números pares usando while: ")
    var contador: Int = 2
    while (contador <= 20){
        if (contador %2==0) println(contador)
        contador++
    }
    println("Números pares usando do-while: ")
    var a = 2 
    do {
        println(a)
        a=a+2
    } while (a <= 20)
}

//--------------------------------


//Crear una función que calcule la potencia de un número (base elevada a exponente)


fun exponente (): Int {
    var a = 2 // base
    var b = 5 // exponente
    var c = 1
    var resultado=1
    println("El resultado de la potencia es:")
    do {
        resultado=resultado*a
        println(resultado)
        c++
    } while (b>=c)
    return resultado
}