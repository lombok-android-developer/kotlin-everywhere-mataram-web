package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond


class Fathurrahman : Contributor {
    val birth : String = "24 August 1999"
    val age : Int = 20
    val phoneNumber : String = "+6283142808426"
    override val photoUrl: String?
        get() = "https://www.dicoding.com/images/small/avatar/2019040917343047ff214c7a8d07ee3b5aea1f6451b1fd.jpg"
    override val descriptions: String?
        get() = "Belajar itu tidak mengenal tempat atau waktu jadi terus belajar adalah keharusan, dan suksess itu tidak mengenal latar belakang jadi berusaha untuk sukses adalah hal yang wajar, tapi jangan lupa berdoa"
    override val currentJob: String?
        get() = "Mahasiswa"
    override val idGithub: String
        get() = "@nersus15"
    override val name: String
        get() = "Fathurrahman"
    override val email: String?
        get() = "fathur.ashter15@gmail.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/fathur-ashter-417921173/"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/10285684/fathur"
    override val idTelegram: String?
        get() = "@fathur_ashter15"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Java"),
            Skills("PHP Laravel"),
            Skills("HTML"),
            Skills("CSS"),
            Skills("Javascript"),
            Skills("NodeJs")
        )
    override val location: String?
        get() = "Mataram, Indonesia"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Asisten dosen",
                "Universitas Bumigora Mataram",
                "Mata Kuliah Logika Algoritma - Java",
                "2019"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Dicoding Academi",
                "Intermediate",
                "2019",
                "Membuat Aplikasi Android Untuk Pemula"
            ),
            Educations(
                "Dicoding Academi",
                "Fundamental",
                "2019",
                "Web Fundamental"
            ),
            Educations(
                "Udemy",
                "The complete NestJS developer. Enterprise Node.js framework",
                "2019",
                "Node Js"
            ),        
            Educations(
                "Universitas Bumigora Mataram",
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
            map["fathurrahman"] = Fathurrahman()
        }
    }
}
