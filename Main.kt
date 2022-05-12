import kotlin.math.roundToInt

class Exercises {

    fun numeroInvertir(): Unit {
        /*
        Para invertir los numeros, primeramente necesitamos recorrer la cadena desde la ultima posicion del arreglo de caracteres. Por lo que
        que tendriamos que imprimir el arreglo en la posicion dependiendo del tamaño del caracter. Basicamente
        tendrias que iterar esa cadena de caracteres y poner numero[numero.length - (n + 1)] donde n es el indice del for. Bueno, sabiendo eso
        por ejemplo, suponiendo que el tamaño de la cadena es 3 ("351") quedaria de la siguiente manera
        3 - (0 + 1) -> 3 - 1 -> EL resultado es 2, lo cual equivale a arreglo[2] (1)
        3 - (1 + 1) -> 3 - 2 -> EL resultado es 1, lo cual equivale a arreglo[1] (5)
        3 - (2 + 1) -> 3 - 3 -> EL resultado es 0, lo cual equivale a arreglo[0] (3)
        Impriendo al final el numero al revez "153"
        */
        print("Ingresa un numero: ")
        val numero = readLine()!!
        for (n in numero.indices) {
            print("${numero[numero.length - (n + 1)]}")
        }
    }

    fun horaFutura():Unit{
        println("Ingrese la hora actual: ")
        val horaActual = readLine()!!.toInt()
        println("Ingrese la cantidad de horas: ")
        val cantidadHoras = readLine()!!.toInt()
        val total = (cantidadHoras%12) + horaActual
        println("En $cantidadHoras, el reloj marcara las $total")
    }

    fun notasAlumno():Unit{
        //Aqui se usa despejes, favor de hacerlo en cuaderno XD
        // link donde viene la formula matematica del problema http://progra.usm.cl/apunte/ejercicios/1/que-nota-necesito.html
        // las incognitas son NC y C3 donde NC
        println("Ingrese la primera nota: ")
        val n1:Int = readLine()!!.toInt()
        println("Ingrese la segunda nota: ")
        val n2:Int = readLine()!!.toInt()
        println("Ingrese la nota del laboratorio: ")
        val notaLab = readLine()!!.toInt()
        val nc:Double = (60 - (notaLab*0.3))/0.7
        val c3 = (nc*3) - n1 - n2
        println("${c3.roundToInt()}")
    }

}

fun main(args: Array<String>) {
    val app = Exercises()
    app.notasAlumno()
}