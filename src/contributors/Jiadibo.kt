package com.linov.community.contributors

import com.github.mustachejava.Mustache
import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class Jiadibo : Contributor {
    override val idGithub: String
        get() = "@jiadibo"
    override val name: String
        get() = "Al Jihad"
    override val photoUrl: String?
        get() = "https://avatars2.githubusercontent.com/u/27887827?s=460&v=4"
    override val currentJob: String?
        get() = "Android Developer"
    override val email: String?
        get() = "jihad.strange@gmail.com"
    override val descriptions: String?
        get() = "Programmer bukan kaleng - kaleng"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/miftahuljihad/"
    override val stackOverflow: String?
        get() = "jiadibostack"
    override val idTelegram: String?
        get() = "@jiadibo"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Kotlin"),
            Skills("Java"),
            Skills("Pyhton"),
            Skills("Flutter"),
            Skills("Dart"),
            Skills("Android Development")
        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "DSC Lead Universitass Bumigora",
                "Google Developers",
                "Ketua aja",
                "2019",
                "present"
            ),
            Jobs(
                "Android Developer",
                "Lumbung Inovasi",
                "Tukang ngetik aja",
                "2018",
                "present"
            ),
            Jobs(
                "Network Techinician",
                "NETZEN",
                "Tukang setting",
                "2017",
                "2018"
            )

        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Universitas Bumigora",
                "S1",
                "2016 - present",
                "Ilmu Komputer"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>){
            map["jihad"] = Jiadibo()
        }
    }
}

