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
class Regina : Contributor {
    override val photoUrl: String?
        get() = "https://avatars2.githubusercontent.com/u/56951519?s=400&u=183aea63a0d5a5cbeab908a568d57d9c5ca8917a&v=4"
    override val descriptions: String?
        get() = "Jalani Saja"
    override val currentJob: String?
        get() = "Mahasiswi Ilkom"
    override val idGithub: String
        get() = "@reginaapriliariberu"
    override val name: String
        get() = "Regina Aprilia"
    override val email: String?
        get() = "reginaaprilia2000@gmail.com"
    override val linkedin: String?
        get() = ""
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = ""
    override val skillset: List<Skills>?
        get() = listOf(

            Skills("Java")

        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Mahasiswi",
                "Universitas Bumigora",
                "Tukang Kuliah Aja",
                "2018",
                ""

            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Universitas Bumigora",
                "S1",
                "2018",
                "Ilmu Komputer"

            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["Regina-Aprilia"] = Regina()

        }
    }
}