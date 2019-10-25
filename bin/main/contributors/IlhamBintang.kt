package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class IlhamBintang : Contributor {
    override val photoUrl: String?
        get() = "https://i.imgur.com/6XDaq5v.png"
    override val descriptions: String?
        get() = "Machine Learning Eng. Math Learniner. Proud Geek.\n" +
                "Food Reviewer."
    override val currentJob: String?
        get() = "Machine Learning Eng., KeyReply. Pte. Ltd."
    override val idGithub: String
        get() = "@nullphantom"
    override val name: String
        get() = "Ilham Bintang"
    override val email: String?
        get() = "nullphantom@icloud.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/nullphantom/"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/1412798/23pstars"
    override val idTelegram: String?
        get() = "@nullphantom"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Python"),
            Skills("Machine Learning"),
            Skills("Natural Language Processing")
        )
    override val location: String?
        get() = "Sekarbela, Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Machine Learning Engineer",
                "KeyReply, Lte. Ptd.",
                "NLP Tasks",
                "August 2019"
            ),
            Jobs(
                "Machine Learning Engineer",
                "GleeTrees, Lte. Ptd.",
                "-",
                "March 2019",
                "July 2019"
            ),
            Jobs(
                "Web Developer",
                "Universitas Mataram",
                "-",
                "January 2019",
                "March 2019"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Universitas Mataram",
                "S1",
                "2015 - 2019",
                "Teknik Informatika"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["bintang"] = IlhamBintang()
        }
    }
}
