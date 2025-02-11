class EmpleadoFijo(val salarioFijo: Double, val numPagas: Double, nombre: String, id: Int): Empleado(nombre, id) {
    override fun calculaSalario(): Double {
        return salarioFijo * numPagas
    }
}