package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class BagiHartawan : Contributor{
    override val idGithub: String
        get() = "bagih"
    override val name: String
        get() = "Bagi Hartawan"
    override val photoUrl: String?
        get() = "https://avatars2.githubusercontent.com/u/26532758?s=400&v=4"
    override val currentJob: String?
        get() = "Mahasiswa"
    override val email: String?
        get() = "hartawanbagie@gmail.com"
    override val descriptions: String?
        get() = "Linux Enthusiast & Web Developer"
    override val linkedin: String?
        get() = ""
    override val stackOverflow: String?
        get() = ""
    override val idTelegram: String?
        get() = "Awan404"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Java"),
            Skills("Node JS"),
            Skills("Web Development"),
            Skills("Android Development"),
            Skills("Linux Administrator"),
            Skills("Bootsrap 4"),
            Skills("HTML5"),
            Skills("CSS")
        )
    override val location: String?
        get() = "Lombok NTB"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Magang PKL",
                "PT Aplikanusa Lintasarta",
                "Tukang Naik Tower",
                "2017",
                "2017"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "SDN Aik Ampat",
                "Graduate",
                "2012",
                ""

            ),
            Educations(
                "SMPN 3 Jonggat",
                "Graduate",
                "2015",
                ""
            ),
            Educations(
                "SMKN 2 Kuripan",
                "Graduate",
                "2018",
                ""
            ),
            Educations(
                "Universitas Mataram",
                "Undergraduate",
                "2018",
                ""
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>){
            map["Bagi Hartawan"] = BagiHartawan()
        }
    }
}

