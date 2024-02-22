package Student
open class Applicant() {
    open var name=""
    /*open var name_=""*/
    open var faculty=""
    open var exams: MutableMap<String, Int> = mutableMapOf()
    var totalGrade = 0.0
    var isAccepted: Boolean = false


    open fun addExam() {
        try{
            println("kol-vo exams?")
            var kk=readln()!!.toInt()
            if(kk<=2||kk>5){ addExam()}
            else{
                var i=0
                do{
                    println("Exam:")
                    var exam=readln()
                    if(!exams.containsKey(exam)){
                        var grade:Int
                        do{
                            println("Grade:")
                            grade= readln()!!.toInt()
                        }while(grade<0||grade>100)
                        i++
                        exams[exam] = grade
                    }
                }while(i<kk)
            }
        }
        catch (e:Exception){
            println("Вы допустили ошибку при вводе поэтому давайте начнем с начала")
            addExam()
        }
    }

    open fun calculateAverageGrade(): Double {

        for (grade in exams.values) {
            totalGrade += grade
        }
        return totalGrade.toDouble() / exams.size
    }


}
