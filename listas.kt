//CREACION DE LISTAS
//SUBCLASES
//mutableListOf
    val listaAnimales = mutableListOf("perro", "gato", "oso","dinosaurio");
//listOf

val listaPaises = listOf("USA", "España", "naranNew York","Paris");

//ACCEDIENDO

val listaAnimales = listOf("perro", "gato", "oso","dinosaurio");

// ultimo elemento
val animalFinal = listaAnimales[listaAnimales.size - 1] 

//primer elemento
val primerAnimal = listaAnimales[0] 


//  posición específica
val algunAnimal = listaAnimales[2] 

//MODIFICANDO

val animales = mutableListOf("perro", "gato", "oso","dinosaurio");

//agregar
animales.add("Leon") 

// Actualizar
animales[1] = "Tigre" 

// Eliminar
animales.remove("Ballena") 

//RECORRIENDO

val animal = listOf("perro", "gato", "oso","dinosaurio");

for (anim in animales) {
    println(anim[i])
}

