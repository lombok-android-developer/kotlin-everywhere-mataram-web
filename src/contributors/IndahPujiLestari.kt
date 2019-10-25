package com.linov.community.contributors

import com.github.mustachejava.Mustache
import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class IndahPujiLestari : Contributor {
    override val idGithub: String
        get() = "@Indahpujilestari"
    override val name: String
        get() = "indah puji lestari"
    override val photoUrl: String?
        get() = "https://avatars0.githubusercontent.com/u/39992993?s=400&u=740eaf2c1c2c2d4587591acb0107bc9c5b49813f&v=4"
    override val currentJob: String?
        get() = "Mahasiswa Universitas Bumigora Mataram"
    override val email: String?
        get() = "lestariindahpuji6@gmail.com"
    override val descriptions: String?
        get() = "Mahasiswa"
    override val linkedin: String?
        get() = "-"
    override val stackOverflow: String?
        get() = "-"
    override val idTelegram: String?
        get() = "@indahpujilestari2"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Java"),
            Skills("Pyhton dasar"),
            Skills("Vb Net ")
        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "DSC Universitass Bumigora",
                "Mahasiswa ",
                "Member",
                "2019",
                "present"
            ),
            Jobs(
                "Android Developer",
                "Universitas Bumigora",
                "Tukang buat surat",
                "2019",
                "present"
            )


        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Universitas Bumigora",
                "S1",
                "2017 - present",
                "Ilmu Komputer"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>){
            map["indah"] = IndahPujiLestari()
        }
    }
}

