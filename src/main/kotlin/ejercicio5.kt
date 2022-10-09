class inmuebles(var anio: Int, var metros: Int, var habitaciones: Int, var garaje: Boolean, var zona: Char)

fun precioInmueble(houses: List<inmuebles>, precio: Double): List<Pair<String, Double>> {
    val precioCasa: MutableList<Pair<String, Double>> = mutableListOf()
    var price = 0.0
    for (i in houses.indices) {
        if (houses[i].zona == 'A') {
            price = if (houses[i].garaje) {
                ((houses[i].metros * 1000 + houses[i].habitaciones * 5000 + 15000) * (2022 - houses[i].anio / 100)).toDouble()
            } else {
                ((houses[i].metros * 1000 + houses[i].habitaciones * 5000) * (2022 - houses[i].anio / 100)).toDouble()
            }
        } else if (houses[i].zona == 'B') {
            price = if (houses[i].garaje) {
                (houses[i].metros * 1000 + houses[i].habitaciones * 5000 + 15000) * (2022 - houses[i].anio / 100) * 1.5
            } else {
                (houses[i].metros * 1000 + houses[i].habitaciones * 5000) * (2022 - houses[i].anio / 100) * 1.5
            }
        }
        if (price <= price) {
            val listaInmuebles =
                "Habitaciones: " + houses[i].habitaciones.toString() + ", " +
                    "Año: " + houses[i].anio.toString() + ", " + "Garage: " +
                        houses[i].garaje.toString() + ", " + "Zona: " +
                        houses[i].zona.toString() + ", " + "Metros: " +
                        houses[i].metros.toString() +
                    ", Precio Total:"
            precioCasa.add(Pair(listaInmuebles, price))
        }
    }
    return precioCasa
}

fun main() {
    val pisos = listOf(
        inmuebles(2000, 100, 3, true, 'A'),
        inmuebles(2011, 60, 2, true, 'B'),
        inmuebles(1980, 120, 4, false, 'A'),
        inmuebles(2005, 75, 3, true, 'B'),
        inmuebles(2015, 90, 2, false, 'A')
    )
    println(precioInmueble(pisos, 260000000.0))
}