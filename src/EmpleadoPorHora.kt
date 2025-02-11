class EmpleadoPorHora(val horasAlmes: Int, val tarifaPorHora: Double, nombre: String, id: Int): Empleado(nombre, id) {

    override fun calculaSalario(): Double {
        return horasAlmes * tarifaPorHora
    }

}