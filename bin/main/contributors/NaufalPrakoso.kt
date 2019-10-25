package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class NaufalPrakoso : Contributor {
    override val idGithub: String
        get() = "@naufalprakoso"
    override val name: String
        get() = "Naufal Prakoso"
    override val photoUrl: String?
        get() = "https://scontent.fcgk18-2.fna.fbcdn.net/v/t1.0-9/70968952_1614258175378044_5361779357771628544_o.jpg?_nc_cat=100&_nc_oc=AQm7qMCm2334PfkykWXG4gw9boHntPGbutVWlH2uElp-GNmeFvPJiL45sTtmV978m-c&_nc_ht=scontent.fcgk18-2.fna&oh=200622cf149eeafeff318a53d2c4985e&oe=5E1E517E"
    override val currentJob: String?
        get() = "Android Developer"
    override val email: String?
        get() = "naufalprakoso24@gmail.com"
    override val descriptions: String?
        get() = "Hi, my name is Muhammad Naufal Firjatulloh Prakoso. You can call me Naufal. Aside a being a student, in binus university I also became a Subject Coordinator.\n " +
                "Subject Coordinator is a person that can improve and maintain student laboratory subject in Binus University. I am an Android enthusiast."
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/naufal-prakoso/"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/6148516/naufal-prakoso"
    override val idTelegram: String?
        get() = "@naufalprakoso"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Kotlin", expertiseRate = 88),
            Skills("Java", expertiseRate = 88),
            Skills("PHP", expertiseRate = 80),
            Skills("Flutter for Mobile", expertiseRate = 70),
            Skills("Android Kotlin", expertiseRate = 88),
            Skills("Android Java", expertiseRate = 80)
        )
    override val location: String?
        get() = "Bintaro, Indonesia"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Subject Coordinator",
                "Software Laboratory Center Binus University",
                "Person that can improve and maintain student laboratory subject in Binus University",
                "February 2019", "Present"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Bina Nusantara University",
                "Computer Science",
                "2017 - Present",
                ""
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("NaufalPrakoso_CvResume.hbs", mapOf("user" to this)))
    }

    companion object{
        fun initialize(map: MutableMap<String, Contributor>) {
            map["naufalprakoso"] = NaufalPrakoso()
        }
    }
}