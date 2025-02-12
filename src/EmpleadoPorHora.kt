class EmpleadoPorHora(nombre: String, id: Int, val horasAlmes: Int, val tarifaPorHora: Double): Empleado(nombre, id) {

    override fun calculaSalario(): Double {
        return horasAlmes * tarifaPorHora
    }



}