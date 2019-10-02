package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.AplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

/**
 * SAMPLE CV yang menggunakan standard template
 * Pastikan nama class nya adalah Unique,
 * misalnya nama Anda: Husein Abdullah,
 * maka nama classnya bisa: HAbdullah, HuseinAbdullah, HuseinAbd123, dll.
 * Jika sudah ada yang menggunakan nama class tersebut, tolong gunakan nama yang lain.
 */
class GustiCahya : Contributor {
    override val photoUrl: String?
        get() = "https://www.dicoding.com/images/small/avatar/201909251907057dc5cc8e2d2bc86e8afb55f47c816a5b.jpg"
    override val descriptions: String?
        get() = "Seorang pelajar yang gemar mendalami setiap aspek teknologi"
    override val currentJob: String?
        get() = "Pelajar"
    override val idGithub: String
        get() = "@GustiCahya"
    override val name: String
        get() = "Gusti Cahya"
    override val email: String?
        get() = "gusticahyax@yahoo.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/gusti-cahya-68590517b/"
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = "@GustiCahya"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Kotlin"),
            Skills("Javascript"),
            Skills("PHP"),
            Skills("Front-end Developer"),
            Skills("Back-end Developer"),
            Skills("Codeigniter"),
            Skills("Vuejs"),
            Skills("Angularjs"),
            Skills("HTML5 Canvas"),
            Skills("TypeScript"),
            Skills("Python"),
            Skills("Ionic"),
            Skills("Java")
        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = null
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Dicoding Academi",
                "Associate",
                "2019 - on-going",
                "KADE"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["gusticahya"] = GustiCahya()
        }
    }
}
