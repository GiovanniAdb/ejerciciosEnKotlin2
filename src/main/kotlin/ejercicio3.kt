import kotlin.math.*

fun desempenio(nota: Int):String{
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

fun calificaciones1(notas: Array<Int>){
    for(i in 0..notas.size-1){
        println(notas.get(i).toString()+""+desempenio(notas.get(i)))
    }
}

fun main(){
    val notas= arrayOf<Int>(70,100,100,90,75)
    calificaciones1(notas)
}