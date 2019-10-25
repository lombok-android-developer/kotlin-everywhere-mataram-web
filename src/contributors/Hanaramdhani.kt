package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class Hanaramdhani : Contributor {
    override val photoUrl: String?
        get() = "https://avatars2.githubusercontent.com/u/56961607?s=400&u=25dc5494ce4781ff5be53f370345b7b56d29a6a6&v=4"
    override val descriptions: String?
        get() = "hanya manusia yang haus ilmu"
    override val currentJob: String?
        get() = "pencari ilmu"
    override val idGithub: String
        get() = "@hanaramdhani"
    override val name: String
        get() = "Hana  Ramdhani"
    override val email: String?
        get() = "hanawesave@gmail.com"
    override val linkedin: String?
        get() = " "
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = " "
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("designer"),
            Skills("java"),
            Skills("css")
        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "penuntut ilmu",
                "UBG",
                "menjalankan kewajiban",
                "2019",
                "Present"
            ),
            Jobs(
                "engineering",
                "Freelance",
                "Kerja keras",
                "2017",
                "Present"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "KAMIL",
                "Associate",
                "2018",
                "KADER"
            ),
            Educations(
                "Universitas Bumigora",
                "S1",
                "20018 - 2022",
                "Teknik Informatika"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["Hana Ramdhani"] = Hanaramdhani()
        }
    }
}