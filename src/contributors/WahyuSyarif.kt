
package com.linov.community.contributors

import com.github.mustachejava.Mustache
import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class WahyuSyarif : Contributor {
    override val idGithub: String
        get() = "@wahyush04"
    override val name: String
        get() = "Wahyu Syarif"
    override val photoUrl: String?
        get() = "https://avatars2.githubusercontent.com/u/51279660?s=400&u=eb9ef992b2af09153c0ab77c6af4b70ff7bd00b7&v=4"
    override val currentJob: String?
        get() = "Mahasiswa"
    override val email: String?
        get() = "wahyush04@gmail.com"
    override val descriptions: String?
        get() = "Programmer Masih Newbie"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/wahyu-syarif-232a5b115/"
    override val stackOverflow: String?
        get() = "wahyush04"
    override val idTelegram: String?
        get() = "@wahyush4"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Kotlin"),
            Skills("Java"),
            Skills("Android Development")
        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "DSC Universitass Bumigora",
                "Google Developers",
                "pengikut aja",
                "2019",
                "present"
            ),
            Jobs(
                "Founder altairsgate.com",
                "Altairsgate",
                "Admin",
                "2017",
                "present"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Universitas Bumigora",
                "Semester 3",
                "2018 - present",
                "Ilmu Komputer"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>){
            map["wahyu"] = WahyuSyarif()
        }
    }
}

