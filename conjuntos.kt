//CREACION
//setof
val numeros = setOf(1, 2, 3, 4, 5);

//mutableSetOf

val numeros = mutableSetOf(1,2,3,4,5,6);

//ACCEDIEMNDO
val frutas = setOf(1, 2, 3, 4, 5);

for (numero in numeros) {
    println(numero[i])
}

//MODIFICANDO

val numeros = mutableSetOf(1, 2, 3, 4, 5)

numeros.remove(1)
numeros.add(9)

println(numeros)





// recorro
for (numero in numeros) {
    println(numero)
}

// recorro con indice
for (i in numeros.indices) {
    println(numeros[i])
}

