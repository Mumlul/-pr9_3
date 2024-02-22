package ss
import Student.*
open class Teacher(): Applicant() {
    var name_=""

    fun input(){
        println("Name Student:")
        name=readln()
        println("Name Professor:")
        name_= readln()
        println("Faceltaty:")
        faculty= readln()
        addExam()
    }

    fun Accepted(){
        if(totalGrade>270)
        {
            isAccepted=true
        }
    }
    fun Output(){
        println("Name Student:$name")
        println("Name Professor:$name_")
        println("Faceltaty:$faculty")
        println("Grade Point Average:${calculateAverageGrade()}")
        println("Acepted:$isAccepted")
        for (grade in exams.values) {
            println("Exam:${exams.filterValues { it==grade }.keys.firstOrNull()} Grade:${grade}")
        }

    }
}