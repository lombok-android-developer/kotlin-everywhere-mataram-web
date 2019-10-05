package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

/**
 * SAMPLE CV yang menggunakan standard template
 * Pastikan nama class nya adalah Unique,
 * misalnya nama Anda: Husein Abdullah,
 * maka nama classnya bisa: HAbdullah, HuseinAbdullah, HuseinAbd123, dll.
 * Jika sudah ada yang menggunakan nama class tersebut, tolong gunakan nama yang lain.
 */
class EbySofyan : Contributor {
    override val photoUrl: String?
        get() = "https://avatars0.githubusercontent.com/u/11751662?s=400&v=4"
    override val descriptions: String?
        get() = "Tidak ada yang perlu di jelaskan, aku begini adanya . . . ."
    override val currentJob: String?
        get() = "Software Developer"
    override val idGithub: String
        get() = "@ebysofyan"
    override val name: String
        get() = "Eby Sofyan"
    override val email: String?
        get() = "ebysofyan.kt@gmail.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/ebysofyan/"
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = "@ebysofyan"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Eleven Finger Typer"),
            Skills("Sitting Sleeper"),
            Skills("Python"),
            Skills("Django"),
            Skills("Kotlin"),
            Skills("Android Development")
        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Software Developer",
                "CMI",
                "Ngetik apa yang perlu di ketik",
                "2019",
                "Present"
            ),
            Jobs(
                "Software Developer",
                "Freelance",
                "Kerja lembur bagai kuda",
                "2017",
                "Present"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Dicoding Academi",
                "Associate",
                "2018",
                "KADE"
            ),
            Educations(
                "ES TE EM I KAH Bumigora",
                "S1",
                "20014 - 2018",
                "Teknik Informatika"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["ebysofyan"] = EbySofyan()
        }
    }
}