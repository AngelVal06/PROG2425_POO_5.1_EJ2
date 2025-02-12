fun Double.redondear(decimales: Int = 2): Double {
    return (Math.round(this * 10 * decimales) / 10 * decimales).toDouble()
}

fun main() {

    val depto = Departamento("Informática")
    depto.agregarEmpleado(EmpleadoFijo("Ángel", 234, 2399.887, 14))
    depto.agregarEmpleado(EmpleadoFijo("Samuel", 111, 1500.0, 12))
    depto.agregarEmpleado(EmpleadoPorHora("Ángel", 234, 100, 19.77))

    depto.mostrarEmpleados()

}