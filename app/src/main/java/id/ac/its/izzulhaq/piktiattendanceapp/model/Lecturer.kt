package id.ac.its.izzulhaq.piktiattendanceapp.model

data class Lecturer(
    val lecturerId: Int,
    val lecturerName: String,
    val courses: List<Course>
)
