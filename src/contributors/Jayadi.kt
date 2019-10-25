package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class Jayadi : Contributor {
    override val photoUrl: String?
        get() = "https://avatars0.githubusercontent.com/u/56905630?s=400&u=fb8fcbd8c5a341c9229cf38d3a99d24fa649fa8a&v=4"
    override val descriptions: String?
        get() = " Pejuang RPL"
    override val currentJob: String?
        get() = "Mahasiswa"
    override val idGithub: String
        get() = "muhammadjayadi"
    override val name: String
        get() = "Muhammad Jayadi"
    override val email: String?
        get() = "muhammadjayadi754@gmail.com"
    override val linkedin: String?
        get() = "-"
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = "@jayadi06"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("java"),
            Skills("Kotlin")
        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Mahasiswa",
                "Universitas Bumigora",
                "bejalar dan ber-do'a",
                "2018",
                "Present"
            ),
            Jobs(
                "Mahasiswa",
                "Universitas Bumigora",
                "pejuang RPL",
                "2018",
                "Present"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Universitas Bumigora",
                "Smester 3",
                "2018",
                "Teknik Informatika"
            ),
            Educations(
                "Universitas Bumigora",
                "S1",
                "20018",
                "Teknik Informatika"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["jayadi"] = Jayadi()
        }
    }
}
