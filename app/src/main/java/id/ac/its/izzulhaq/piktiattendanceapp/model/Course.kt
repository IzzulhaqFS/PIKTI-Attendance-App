package id.ac.its.izzulhaq.piktiattendanceapp.model

data class Course(
    val courseId: Int,
    val courseName: String,
    val lecturer: Lecturer,
    val assistant: Assistant,
    val students: List<Student>,
    val sessions: List<CourseSession>
)
