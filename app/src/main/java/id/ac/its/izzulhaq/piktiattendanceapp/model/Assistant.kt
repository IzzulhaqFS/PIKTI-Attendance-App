package id.ac.its.izzulhaq.piktiattendanceapp.model

data class Assistant(
    val assistantId: Int,
    val assistantName: String,
    val courses: List<Course>
)
