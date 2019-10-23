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
        get() = "koding"
    override val email: String?
        get() = "jihad.strange@gmail.com"
    override val descriptions: String?
        get() = "Koding"
    override val linkedin: String?
        get() = "linkdin"
    override val stackOverflow: String?
        get() = "gapunya"
    override val idTelegram: String?
        get() = "@jiadibo"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Kotlin"),
            Skills("Java"),
            Skills("C/C++"),
            Skills("IOT"),
            Skills("Android Development"),
            Skills("Kotlin Web"),
            Skills("Kotlin API"),
            Skills("Full-stack Kotlin"),
            Skills("Flutter"),
            Skills("Flutter Web"),
            Skills("Flutter Desktop")
        )
    override val location: String?
        get() = "mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Android Developer",
                "Samsung",
                "Tukang ngetik aja",
                "2013",
                "2015"
            ),
            Jobs(
                "Android Developer",
                "Tokopedia",
                "Tukang ngetik aja",
                "2015",
                "2016"
            ),
            Jobs(
                "Android Developer",
                "Freelance",
                "Tukang ngetik aja",
                "2016",
                "2017"
            ),
            Jobs(
                "Android Developer",
                "Bukalapak",
                "Tukang ngetik aja",
                "2018"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Dicoding Academi",
                "Associate",
                "2018",
                "KADE"
            ),
            Educations(
                "AKAKOM Yogyakarta",
                "S1",
                "2006 - 2010",
                "Teknik Informatika"
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

