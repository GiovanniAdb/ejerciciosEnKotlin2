import kotlin.math.*

fun calificarDesempeño(nota: Int):String{
    if(nota <= 100 && nota >= 95){
        return ": Excelente"
    }
    else if(nota <= 94 && nota >= 85){
        return ": Notable"
    }
    else if(nota <= 84 && nota >= 75){
        return ": Bueno"
    }
    else if(nota <= 74 && nota >= 70){
        return ": Suficiente"
    }
    else return ": Desempeño insuficiente"
}

fun calificaciones(asignaturas: Array<String>,notas: Array<Int>){
    for(i in 0..asignaturas.size-1){
        println(asignaturas.get(i).toUpperCase()+" "+calificarDesempeño(notas.get(i)))
    }
}

fun main(){
    val asignaturas= arrayOf<String>("ecuaciones diferenciales","programacion movil","programacion web",
        "Ingles 8","Enru.Conm.Redes")
    val notas= arrayOf<Int>(70,100,100,90,75)
    calificaciones(asignaturas,notas)
}