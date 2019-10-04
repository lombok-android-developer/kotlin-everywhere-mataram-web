package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond


class YudaKarnaen : Contributor {
    override val photoUrl: String?
        get() = "https://www.dicoding.com/images/small/avatar/2019043011481843d75ca9558530b7db3ae88085dd0228.png"
    override val descriptions: String?
        get() = "Suka ngoding dan gaming hehe"
    override val currentJob: String?
        get() = "Freelancer | Mahasiswa"
    override val idGithub: String
        get() = "@yudartcode"
    override val name: String
        get() = "L Yuda Rahmani Karnaen"
    override val email: String?
        get() = "yuda.karnaen11@gmail.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/yuda-karnaen-3b1421138/"
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = "@yudakarnaen"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Java"),
            Skills("Kotlin"),
            Skills("Android Development"),
            Skills("Python"),
            Skills("Laravel"),
            Skills(".NET")
        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Web Developer",
                "Mascavio",
                "Divisi Web Developer",
                "2019"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Dicoding Academi",
                "Fundamental",
                "2019",
                "Android Fundamental"
            ),
            Educations(
                "Dicoding Academi",
                "Fundamental",
                "2019",
                "Kotlin Fundamental"
            ),
            Educations(
                "Dicoding Academi",
                "Fundamental",
                "2019",
                "Web Fundamental"
            ),
            Educations(
                "SMK Negeri 1 Selong",
                "SLTA",
                "2014 - 2017",
                "Teknik Komputer dan Informatika"
            ),

            Educations(
                "Universitas Bumigora",
                "S1",
                "2017 - Now",
                "Ilmu Komputer"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["yuda"] = YudaKarnaen()
            map["yudakarnaen"] = YudaKarnaen()
            map["yudartcode"] = YudaKarnaen()
        }
    }
}