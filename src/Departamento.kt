import java.math.MathContext
import kotlin.math.round
import kotlin.math.roundToLong



class Departamento(nombre: String) {

    /*
    var tarifaPorHora: Double = tarifaPorHora
        set(value) {
            field = value.redondear()
        }
*/
    private val listEmpl = mutableListOf<Empleado>()

    fun agregarEmpleado(empleado: Empleado) {
        listEmpl.add(empleado)
    }

    fun mostrarEmpleados() {
        for (empleado in listEmpl) {
            println(empleado)
        }
    }

}