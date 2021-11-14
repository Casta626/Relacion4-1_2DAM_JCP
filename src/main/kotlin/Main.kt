/*
Crea un programa para mantener las notas de los alumnos.
El programa tendrá la siguiente estructura. Los datos de inicialización estarían hardcodeados.

Existirán las siguientes clases:
Módulo, que tendrá
un array de los alumnos matriculados, al listarse quedarán ordenados por el identificador del alumno.
un array bidimensional, 3 evaluaciones + uno final, que almacena un array de notas de alumnos ordenadas según el orden de los alumnos.
 (Guarda la información de la nota el mismo valor del índice en el que se encuentra el alumno. Es decir, si por ejemplo el estudiante
 Pedro está en la posición 2 del array de estudiantes del módulo, su nota estaría en la posición 2 del array de notas.)
Alumnos
identificador numérico en el instituto.
nombre y apellidos.
Crea las clases y métodos que creas conveniente para realizar las operaciones que se listan a continuación.
*Crea un programa con 1 módulo de 15 alumnos, matricular 10 alumnos. Rellena las notas de la 1, 2 y 3 Evaluación.
*Calcula la nota final de los módulos como la media de las 3 Evaluaciones.
*Obtener lista de alumnos, nota con las notas por evaluación, por defecto final.
*Para un módulo, calcular cuantos alumnos han aprobado por evaluación, por defecto final.
Para un módulo, calcular la nota más baja por evaluación, por defecto final.
Para un módulo, calcular la nota más alta por evaluación, por defecto final.
Para un módulo, calcular la nota media entre todos los alumnos por evaluación, por defecto final.
Para un módulo, calcular si alguno tiene un 10 por evaluación, por defecto final.
Para un módulo, calcular si hay alumnos aprobados por evaluación, por defecto final.
Para un módulo, calcular la primera nota que no ha superado el 5 por evaluación, por defecto final.
Obtener una lista con los alumnos ordenados ascendiente según su nota por evaluación, por defecto final.
*Poder matricular alumnos siempre que no se llegue al máximo de alumnos.
*Dar de baja alumnos.
Opcional: Puedes hacer un menu para cada opción.

IMPORTANTE: Comenta el código e identifica claramente que parte del ejercicio estas resolviendo, haciendo referencia a
los puntos del ejercicio.

Crear, realizar y entregar el ejercicio:
*/
class Modulo{
    //Crear el array de las id de los alumnos que se van matriculando.
    var alumnos: Array<Int> = arrayOf(15)
    var alumnosMatriculados= arrayOf(10)
    //Crear una var eva para la nota final siendo esta la media de las tres.
    //Crear una función para la misma.
    private fun calculaEvaluacionFinal(): Float {
        val eva=evaluacion.average().toFloat()
        return eva
    }



    //Crear el array bidimensional
    var trimestre: Array<String> = arrayOf("1","2","3","Final")
    var evaluacion: FloatArray = floatArrayOf(1f, 3f, 5f, calculaEvaluacionFinal())




    val doble= arrayOf(evaluacion, trimestre)

    //var aa = Array(4,FloatArray(15,1))
    fun Modulo(maxAlumnos:Int){
        alumnos.size

    }

    fun establecerNota(idAlumno:Int, trimestre:String, evaluacion:Float): Boolean {
        //Entiendo el establecer la nota pero no entiendo para que es el Boolean.
        return true
    }

    fun listaNotas(trimestre:String): List<Char> {
        return trimestre.toList()
    }

    fun numeroAprobados(trimestre:String): Int {
        var contador=0
        for (evaluacion in doble){
            if (evaluacion>=5){
                contador++
            }
        }
        var cont=contador
        return cont
    }

    fun notaMasBaja(trimestre:String) {
        evaluacion.minOrNull()
    }

    fun notaMasAlta(trimestre:String) {
        evaluacion.maxOrNull()
    }

    fun notaMedia(): Float {
        val media=evaluacion.average().toFloat()
        return media

    }

    fun hayAlumnosConDiez(trimestre:String): Boolean {
        var alumnosConDiez:Boolean=false
        for (evaluacion in doble){
            if (evaluacion==10){
                alumnosConDiez=true
            }
        }
        return  alumnosConDiez

    }

    fun hayAlumnosAprobados(trimestre:String): Boolean {
        var alumnosAprobados:Boolean=false
        for (evaluacion in doble){
            if (evaluacion>=5){
                alumnosAprobados=true
            }
        }
        return  alumnosAprobados
    }

    fun primeraNotaNoAprobada(trimestre:String): Float {
        var salir:Boolean=false
        var nota:Float =0.0f
        while (salir!=true){
            for (evaluacion in doble){
                if (evaluacion<5){
                    nota= evaluacion as Float
                }
            }
            salir=true

        }
        return nota
    }

    fun listaNotasOrdenados(evaluacion:String): List<Char> {
        return evaluacion.toList()
    }



}

class Alumno constructor(//Crear la variable de id de instituto para el alumno
    val id: Int, nombre:String, apellido1:String, apellido2:String){
    val nombre:String=nombre
    val apellido1:String=apellido1
    val apellido2:String=apellido2
    var matricula:Boolean=false

    val muestraAlumnos get() = "|ID= "+id+"|NOMBRE= "+nombre.uppercase()+"|APELLIDOS= "+apellido1.uppercase()+" "+apellido2.uppercase()+"| Matriculado: "+matricula

    /*
    fun matricularAlumno(alumno:Alumno): Boolean {
        //le da un alumno y lo matricula
        var matricula:Boolean=true

    }
    */

    constructor():this(0,"","",""){}

    fun matricularAlumno(alumno:Alumno): Boolean {
        matricula = true
        return matricula
    }

    fun bajaAlumno(alumno:Alumno): Boolean {
        matricula=false
        return matricula
    }
}

fun main() {

    val a1=Alumno(1,"Juan","Palomo","Meloguiso")
    println(a1.muestraAlumnos)
    a1.matricularAlumno(a1)
    println(a1.muestraAlumnos)
    a1.bajaAlumno(a1)
    println(a1.muestraAlumnos)

}
/*
Modulo
propiedades
- alumnos
- evaluaciones
metodos
- (1) Modulo(maxAlumnos:Int), establecerNota(idAlumno:String, evaluacion:String, nota:Float): Boolean
X (2) calculaEvaluacionFinal() ***************************
- (3) listaNotas(evaluacion:String): List<Pair>
- (4) numeroAprobados(evaluacion:String): Int
- (5) notaMasBaja(evaluacion:String): Float
- (6) notaMasAlta(evaluacion:String): Float
- (7) notaMedia(evaluacion:String): Float
- (8) hayAlumnosConDiez(evaluacion:String): Boolean
- (9) hayAlumnosAprobados(evaluacion:String): Boolean
- (10) primeraNotaNoAprobada(evaluacion:String): Float
- (11) listaNotasOrdenados(evaluacion:String): List<Pair>
- (12) matricularAlumno(alumno:Alumno): Boolean
_ (13) bajaAlumno(idAlumno:String): Boolean

Alumnos
propiedades
- id: String
- nombre: String
- ap1: String
- ap2: String
*/
