package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond


class YudaKarnaen1 : Contributor {
    override val photoUrl: String?
        get() = "https://www.dicoding.com/images/small/avatar/2019043011481843d75ca9558530b7db3ae88085dd0228.png"
    override val descriptions: String?
        get() = "I'm a junior fullstack developer. learning web development from high school, mobile development and machine learning until now, I like design, I familiar with photoshop but now i'm        studying adobe illustrator. I love food and beach because Lombok has many beautiful beaches, i like ride a bike and sometimes i playing game for fun."
    override val currentJob: String?
        get() = "Software Engineer"
    override val idGithub: String
        get() = "yudartcode"
    override val name: String
        get() = "L Yuda Rahmani Karnaen"
    override val email: String?
        get() = "yuda.karnaen11@gmail.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/yuda-karnaen-3b1421138/"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/12163888/yuda-karnaen"
    override val idTelegram: String?
        get() = "@yudakarnaen"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Java", expertiseRate= 70),
            Skills("Kotlin", expertiseRate= 75),
            Skills("Android", expertiseRate= 65),
            Skills("Python", expertiseRate= 60),
            Skills("PHP Laravel", expertiseRate= 80),
            Skills("HTML", expertiseRate= 90),
            Skills("CSS", expertiseRate= 85),
            Skills("Javascript", expertiseRate= 60),
            Skills(".NET", expertiseRate= 75)
        )
    override val location: String?
        get() = "Mataram, Indonesia"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Magang",
                "STT Hamzanwadi Pancor",
                "Praktek Kerja Lapangan SMKN 1 Selong",
                "2013"
            ),
            Jobs(
                "Web Developer",
                "Mascavio",
                "Web Development Division",
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
                "Memulai Pemrograman Denan Kotlin"
            ),
            Educations(
                "Dicoding Academi",
                "Fundamental",
                "2019",
                "Web Fundamental"
            ),
            Educations(
                "Vocational High School 1 Selong",
                "Student of The Year 2017",
                "2014 - 2017",
                "Teknik Komputer dan Informatika"
            ),
            Educations(
                "Universitas Bumigora Mataram",
                "S1",
                "2017 - Now",
                "Ilmu Komputer"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv_yuda.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["yudakarnaen1"] = YudaKarnaen1()
        }
    }
}