import ss.Teacher
import ss.Teacher as NewStudent

fun main(){
    try{
        var student1=NewStudent()
        var student2=Teacher()
        student1.input()
        student1.calculateAverageGrade()
        student1.Accepted()
        student1.Output()
        student2.input()
        student2.calculateAverageGrade()
        student2.Accepted()
        student2.Output()
    }
    catch (e:Exception){
        println("NO")
    }


}