package com.linov.community.contributors
import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class medicare : Contributor {
    override val photoUrl: String?
        get() = "https://secure.meetupstatic.com/photos/member/d/2/c/f/member_293993967.jpeg"
    override val descriptions: String?
        get() = "Mahasiswa Computer since Bumigora University"
    override val currentJob: String?
        get() = "Lecture assistance Bumigora University"
    override val idGithub: String
        get() = "medicare-github"
    override val name: String
        get() = "Medicare"
    override val email: String?
        get() = "mcareducation@gmail.com"
    override val linkedin: String?
        get() = "-"
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = "@anakbayan"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("WEB Development"),
            Skills("Flutter")
        )
    override val location: String?
        get() = "Bayan"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Lecture Assistance Bumigora University",
                "Bumigora",
                "Tukang ngajar",
                "2019",
                "2020"
            ),
            Jobs(
                "member Forkim",
                "Media informasi KLU",
                "Jurnalis",
                "2019",
                "2020"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "SMAN 1 BAYAN",
                "Senior Hight School",
                "2016",
                "Student Of SMAN 1 Bayan"
            ),
            Educations(
                "Bumigora University",
                "S1",
                "2019",
                "Student Of UBG"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv_medicare.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["medicare-github"] = medicare()
            map["medicare-github"] = medicare()
            map["medicare-github"] = medicare()
        }
    }
}