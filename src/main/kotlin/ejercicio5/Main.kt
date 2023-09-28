package ejercicio5

fun main(){

    val temperaturaCelsius = -273.0
    val temperaturaFahrenheit = -459.0

    println("$temperaturaCelsius grados celsius equivalen a ${celsiusToFahrenheit(temperaturaCelsius)} grados fahrenheit")
    println("$temperaturaFahrenheit grados fahrenheit equivalen a ${fahrenheitToCelsius(temperaturaFahrenheit)} grados celsius")

}

fun fahrenheitToCelsius(tempFahrenheit: Double): Double{
    return (tempFahrenheit - 32) / 1.8
}

fun celsiusToFahrenheit(tempCelsius: Double): Double{
    return tempCelsius * 1.8 +32
}
