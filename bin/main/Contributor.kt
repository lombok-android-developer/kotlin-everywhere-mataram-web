package com.linov.community

import io.ktor.application.ApplicationCall

interface Contributor {
    val idGithub: String
    val name: String
    val photoUrl: String?
    val currentJob: String?
    val email: String?
    val descriptions: String?
    val linkedin: String?
    val stackOverflow: String?
    val idTelegram: String?
    val skillset: List<Skills>?
    val location: String?
    val jobHistory: List<Jobs>?
    val educations: List<Educations>?
    suspend fun response(call: ApplicationCall)
}

data class Educations(
    val institution: String,
    val grade: String,
    val years: String,
    val descriptions: String
)

data class Jobs(
    val position: String,
    val company: String,
    val jobDesc: String,
    val startYears: String,
    var endYears: String = "Present"
)

data class Skills(
    val name: String,
    var expertise: String? = null,
    var expertiseRate: Int? = null
)