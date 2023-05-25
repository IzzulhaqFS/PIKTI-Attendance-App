package id.ac.its.izzulhaq.piktiattendanceapp.model

import id.ac.its.izzulhaq.piktiattendanceapp.AttendanceState
import java.sql.Time
import java.util.Date

data class CourseSession(
    val sessionId: Int,
    val date: Date,
    val timeStart: Time,
    val timeStop: Time,
    val course: Course,
    val lecturerAttendance: AttendanceState,
    val assistantAttendance: AttendanceState,
    val studentsAttendance: HashMap<Int, AttendanceState>
)
