package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class RahmatFathoni : Contributor {
    override val photoUrl: String?
        get() = "https://scontent.fdps4-1.fna.fbcdn.net/v/t1.0-9/481936_396255217099577_575913010_n.jpg?_nc_cat=104&_nc_eui2=AeHDRHG0QvaTf6WS4-6kmtncRqHq77WQRvpnJTEYExP4b6fWUG-AeidcsEnEyOB9XsI4Je1yFWETpezMG2jOkctajS8quThzu6ZEzANCtq-VoA&_nc_oc=AQkoWL4-wH9V9q0LDxnXApRbFoFOWnzXlzB3GhRWlVSr59QTX-1cUWk4fYZyckKUNHQ&_nc_ht=scontent.fdps4-1.fna&oh=295d7662756e6809b1840e29fabb237d&oe=5DF629C8"
    override val descriptions: String?
        get() = "Sukses itu jika kita mendapat ridho Allah"
    override val currentJob: String?
        get() = "Software Engineer"
    override val idGithub: String
        get() = "@ftamhar"
    override val name: String
        get() = "Rahmat Fathoni"
    override val email: String?
        get() = "noti.rahmat@gmail.com"
    override val linkedin: String?
        get() = null
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = "@f_tamhar"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Java"),
            Skills("C/C++"),
            Skills("AI"),
            Skills("Python"),
            Skills("JavaScript"),
            Skills("PHP"),
            Skills("otw Flutter")
        )
    override val location: String?
        get() = "Praya"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "MIS",
                "MP3",
                "Tukang ngetik aja",
                "2018",
                "2018"
            ),
            Jobs(
                "Software Engineer",
                "Dinas",
                "Tukang ngetik aja",
                "2018"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "DTS AI",
                "Beginner",
                "2019",
                "Scholarship "
            ),
            Educations(
                "STMIK Bumigora",
                "S1",
                "2014 - 2018",
                "Teknik Informatika"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["rahmatf"] = RahmatFathoni()
        }
    }
}