package id.ac.its.izzulhaq.piktiattendanceapp.model

data class Student(
    val studentId: Int,
    val studentName: String,
    val courses: List<Course>
)
