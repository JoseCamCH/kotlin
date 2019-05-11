/** prueba 01 */
fun main(parametro: Array<String>) {
    println("Hola Chancho")
    val valor1: Int
    val valor2: Int
    valor1 = 100
    valor2 = 400
    var resultado: Int
    resultado = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $resultado")
    resultado = valor1 * valor2
    println("El producto de $valor1 * $valor2 es $resultado")
    println("------------------------------------")
    print("Ingrese primer valor:")
    var valor10 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    var valor20 = readLine()!!.toInt()
    val suma = valor10 + valor20
    println("La suma de $valor10 y $valor20 es $suma")
    val producto = valor10 * valor20
    println("El producto de $valor10 y $valor20 es $producto")
}