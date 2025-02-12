abstract class Empleado(val nombre: String, private val id: Int) {

    abstract fun calculaSalario(): Double

    override fun toString(): String {
        return "$nombre con ID-${"%04d".format(id)} tiene un salario de ${"%.2f".format(calculaSalario())} al mes."
    }
}


