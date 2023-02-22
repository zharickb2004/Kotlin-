// creo un par
val par = Pair(1, "uno")
// otra forma de crear
val par2 = 1 to "uno"


// accedo a los elementos del par
println(par.first) // 1
println(par.second) // "uno"

// otra forma de acceder
println(par.component1()) // 1
println(par.component2()) // "uno"

// desempaquetado
val (a, b) = par
println(a) // 1
println(b) // "uno"

// modificando
val par3 = par.copy(first = 2)
println(par3) // (2, "uno")

// otra forma de modificar
val par4 = par.copy(second = "dos")
println(par4) // (1, "dos")


// recorrer el par
par.toList().forEach { println(it) }
// 1
// uno

// otra forma de recorrer
par.toList().forEach { (a, b) -> println("$a $b") }
// 1 uno

// recorrer el par con for
for ((a, b) in par) {
    println("$a $b")
}
// 1 uno
