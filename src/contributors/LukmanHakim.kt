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
class LukmanHakim : Contributor {
    override val photoUrl: String?
        get() = "https://www.dicoding.com/images/small/avatar/2018101307164377b37ceb43195eaf6fe380e2884dcf7d.jpg"
    override val descriptions: String?
        get() = "I Have No Life"
    override val currentJob: String?
        get() = "Android Developer"
    override val idGithub: String
        get() = "@lukmancyb"
    override val name: String
        get() = "M Lukman Hakim"
    override val email: String?
        get() = "lukman821@gmail.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/mlukmanhakim/"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/10337052/lukman-hakim"
    override val idTelegram: String?
        get() = "@Mlukmanhakim"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Kotlin"),
            Skills("Android Development")
        )
    override val location: String?
        get() = "Praya, Lombok Tengah NTB"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Android Developer",
                "Diskominfo Loteng",
                "Datang Duduk Diam Pulang",
                "2018",
                "2020"
            )

        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Dicoding Academy",
                "Associate",
                "2018",
                "KADE"
            ),
            Educations(
                "STMIK Lombok Praya",
                "S1",
                "2014 - 2017",
                "Teknik Informatika"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["lukmancyb"] = LukmanHakim()

        }
    }
}