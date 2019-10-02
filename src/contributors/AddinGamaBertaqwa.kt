package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class AddinGamaBertaqwa : Contributor {
    override val photoUrl: String?
        get() = "https://www.dicoding.com/images/small/avatar/201906190950408095d0c8bc386c52fdbaa27e0f255608.jpeg"
    override val descriptions: String?
        get() = ""
    override val currentJob: String?
        get() = "Freelancer"
    override val idGithub: String
        get() = "@addingama"
    override val name: String
        get() = "Addin Gama Bertaqwa"
    override val email: String?
        get() = "addingama@gmail.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/addingama/"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/6506909/addin"
    override val idTelegram: String?
        get() = "@addingama"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("React Native"),
            Skills("PHP"),
            Skills("Java"),
            Skills("IOT"),
            Skills("Android Development"),
            Skills("Javascript"),
            Skills("Python"),
            Skills("Flutter"),
            Skills("Kotlin")
        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "PHP & Android Developer",
                "PT. Walden Global Services",
                "",
                "2012",
                "2015"
            ),
            Jobs(
                "Lead Developer",
                "Geeknesia",
                "",
                "2015",
                "2016"
            ),
            Jobs(
                "React Native Engineer",
                "Freelance",
                "",
                "2017"
            ),
            Jobs(
                "Software Engineer",
                "PT. Mitrais",
                "",
                "2017",
                "2017"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Dicoding Academi",
                "Associate",
                "2019",
                "MADE"
            ),
            Educations(
                "Institut Teknologi Bandung",
                "S2",
                "2013 - 2016",
                "Magister Informatika"
            ),
            Educations(
                "Universitas Mataram",
                "S1",
                "2008 - 2012",
                "Teknik Elektro"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["addingama"] = AddinGamaBertaqwa()
            map["addingama@gmail.com"] = AddinGamaBertaqwa()
            map["addin"] = AddinGamaBertaqwa()
        }
    }
}