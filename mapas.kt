// creo un mapa inmutable
val mapa = mapOf( 1 to "Papaya", 2 to "Mango", 3 to "Guanabana" )

// creo el mapa mutable<
val mapa1 = mutableMapOf( 1 to "Papaya", 2 to "Mango", 3 to "Guanabana" )

// accedo a los elementos del mapa
println(mapa[1])

// lo itero con el indice
for ((indice, valor) in mapa) {
    println("Indice: $indice, Valor: $valor")
}

// accedo por llave
println(mapa.get(1))

// accedo por valor
println(mapa.containsValue("Papaya"))

// accedo por llave
println(mapa.containsKey(1))




// modifico elementos del mapa
mapa1.put(1, "Papaya") //! este mapa es mutable

mapa[1] = "Aguacate"



// recorro el mapa
for ((indice, valor) in mapa) {
    println("Indice: $indice, Valor: $valor")
}

// recorro el mapa con forEach
mapa.forEach { (indice, valor) -> println("Indice: $indice, Valor: $valor") }



