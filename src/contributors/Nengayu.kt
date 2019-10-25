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
class Nengayu : Contributor {
    override val photoUrl: String?
        get() = "https://avatars3.githubusercontent.com/u/56958510?s=400&u=4f5734057e85517dc61cf8a3a065d87cf6ad100b&v=4"
    override val descriptions: String?
        get() = "iku alur cerita"
    override val currentJob: String?
        get() = "Mahasiswi IT"
    override val idGithub: String
        get() = "@Nengayu"
    override val name: String
        get() = "Ayu Cahyablindar"
    override val email: String?
        get() = "ayucahyab1@gmail.com"
    override val linkedin: String?
        get() = ""
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = "@Nengayu"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("HTML"),
            Skills("Java")


        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(



            Jobs(
                "",
                "",
                "Kuliah",
                "2018"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Universitas Bumigora",
                "S1",
                "2018",
                ""
            ),
            Educations(
                "Universitas Bumigora",
                "S1",
                "2018",
                "Teknik Informatika"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["Nengayu"] = Nengayu()

        }
    }
}