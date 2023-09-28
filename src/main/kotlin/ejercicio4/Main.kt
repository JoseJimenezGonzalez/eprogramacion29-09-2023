package ejercicio4

fun informacionPersonal(nombre: String, edad: Int, ciudad: String) {
    println("Hola soy $nombre, tengo $edad años y vivo en $ciudad")
}

fun main(){
    val nombre: String = "Jose Francisco Jiménez González"
    val edad: Int = 30
    val ciudad: String = "Granada"

    informacionPersonal(nombre, edad, ciudad)
}
