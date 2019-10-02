package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class AhmadZafrullah : Contributor {
    override val photoUrl: String?
        get() = "https://avatars1.githubusercontent.com/u/1916749?s=460&v=4"
    override val descriptions: String?
        get() = "Tech. enthusiasm and loved to be a loyal Linux and Mac user.\n" +
                "Sometimes ride the highway by his old road bike, also happy to write things at his blog."
    override val currentJob: String?
        get() = "DevOps, LRsoft Corp."
    override val idGithub: String
        get() = "@23Pstars"
    override val name: String
        get() = "Ahmad Zafrullah"
    override val email: String?
        get() = "zaf@elektro08.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/23pstars/"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/1412798/23pstars"
    override val idTelegram: String?
        get() = "@AhmadZafrullah"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("C"),
            Skills("ReactJS"),
            Skills("Web Stack"),
            Skills("SysAdmin (Linux Server)"),
            Skills("Dekstop (Java, VB, Gambas)"),
            Skills("Databases (MySQL, MongoDB, PostgreSQL)")
        )
    override val location: String?
        get() = "Lombok Tengah"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "DevOps, Co-Founder",
                "LRsoft Corp.",
                "-",
                "2013"
            ),
            Jobs(
                "Technical Engineer",
                "INDOTRAVELONLINE",
                "-",
                "2014"
            ),
            Jobs(
                "Lecturer",
                "Universitas Mataram",
                "-",
                "2018"
            ),
            Jobs(
                "Project Manager",
                "PUSTIK Universitas Mataram",
                "-",
                "2018"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Universitas Gadjah Mada",
                "S2",
                "2015 - 2018",
                "Teknik Elektro dan Teknologi Informasi"
            ),
            Educations(
                "Universitas Mataram",
                "S1",
                "2008 - 2013",
                "Teknik Elektro"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["zaf"] = AhmadZafrullah()
        }
    }
}