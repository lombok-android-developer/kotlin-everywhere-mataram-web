package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class AnasSegafMulachela : Contributor {
    override val idGithub: String
        get() = "anasmc97"
    override val name: String
        get() = "Anas Segaf Mulachela"
    override val photoUrl: String?
        get() = "https://avatars0.githubusercontent.com/u/52484204?s=400&v=4"
    override val currentJob: String?
        get() = "Mahasiswa"
    override val email: String?
        get() = "anas.segafmulachela@gmail.com"
    override val descriptions: String?
        get() = "Android developer & Web Developer"
    override val linkedin: String?
        get() = ""
    override val stackOverflow: String?
        get() = ""
    override val idTelegram: String?
        get() = "anasmc97"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Flutter"),
            Skills("Java"),
            Skills("Code Igniter"),
            Skills("Web Development"),
            Skills("Android Development"),
            Skills("CSS"),
            Skills("Bootsrap"),
            Skills("HTML5"),
            Skills("Dart")
        )
    override val location: String?
        get() = "Lombok NTB"
    override val jobHistory: List<Jobs>?
        get() = listOf()
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "SDN 5 Ampenan",
                "Graduate",
                "2009",
                ""

            ),
            Educations(
                "SMPN 10 Mataram",
                "Graduate",
                "2012",
                ""
            ),
            Educations(
                "SMAN 2 Mataram",
                "Graduate",
                "2015",
                ""
            ),
            Educations(
                "Universitas Mataram",
                "Undergraduate",
                "2015",
                "Electrical Engineering focus on informatics Engineering"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>){
            map["Anas Segaf Mulachela"] = AnasSegafMulachela()
        }
    }

}