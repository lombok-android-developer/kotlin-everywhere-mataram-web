package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class Anwar907 : Contributor {
    override val idGithub: String
        get() = "@anwar907"
    override val name: String
        get() = "Anwar Sapi'i"
    override val photoUrl: String?
        get() = "https://avatars0.githubusercontent.com/u/35429445?s=460&v=4"
    override val currentJob: String?
        get() = "Android Developer"
    override val email: String?
        get() = "rilltheend@gmail.com"
    override val descriptions: String?
        get() = "OTW Android Developer"
    override val linkedin: String?
        get() = "https://kuasaitechnology.blogspot.com/"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/11240948/anwar"
    override val idTelegram: String?
        get() = "@MbunMalam"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Kotlin"),
            Skills("Flutter"),
            Skills("Java"),
            Skills("C++"),
            Skills("Potoshop"),
            Skills("CorelDraw"),
            Skills("Android Development"),
            Skills("CSS"),
            Skills("Bootsrap")
        )
    override val location: String?
        get() = "Mataram Lombok NTB"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Staff",
                "UD. GLOBAL TEKNIK",
                "Tukang Service",
                "2013",
                "2014"
            ),
            Jobs(
                "Staff",
                "Rental Ungu Komputer",
                "Tukang Edit",
                "2015",
                "2017"
            ),
            Jobs(
                "Staff",
                "Lombok Developer",
                "Tukang ketik",
                "2017",
                "2018"
            ),
            Jobs(
                "Android Developer",
                "Lumbung Inovasi",
                "Menunggu Hilal",
                "2018",
                "2019"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Udacity",
                "Beginner",
                "2019",
                "Flutter for Beginner"
            ),
            Educations(
                "Dicoding Academy",
                "Beginner",
                "2018",
                "Kelas Android untuk pemula"
            ),
            Educations(
                "Universitas Mataram",
                "S1",
                "2015",
                "Elevtrical Engineering"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("war_css.hbs", mapOf("user" to this)))
    }

    companion object{
        fun initialize(map: MutableMap<String, Contributor>){
            map["anwar907"] = Anwar907()
        }
    }
}