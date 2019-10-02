package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class RiyanRizkiyawan : Contributor {
    override val photoUrl: String?
        get() = "https://www.dicoding.com/images/small/avatar/20191002100044718cea2136f4cb31a9ac16c8537b84c4.jpg"
    override val descriptions: String?
        get() = "Masih Belajar"
    override val currentJob: String?
        get() = "Freelancer"
    override val idGithub: String
        get() = "@riyanrizky"
    override val name: String
        get() = "Riyan Rizkiyawan"
    override val email: String?
        get() = "rizkiyawanriyan@gmail.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/riyan-rizkiyawan-a31379175"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/6506909/addin"
    override val idTelegram: String?
        get() = "@riyanrizky"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Javascript"),
            Skills("Node.js")
        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Freelance Designer",
                "PesanSayur.id",
                "Design",
                "2018",
                "2019"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Universitas Mataram",
                "S1",
                "2014",
                "Teknik Elektro"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["riyanrizky"] = RiyanRizkiyawan()
            map["rizkiyawanriyan@gmail.com"] = RiyanRizkiyawan()
        }
    }
}
