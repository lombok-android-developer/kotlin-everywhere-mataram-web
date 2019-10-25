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
class RickyAnwar : Contributor {
    override val photoUrl: String?
        get() = "https://avatars2.githubusercontent.com/u/36995966?s=460&v=4"
    override val descriptions: String?
        get() = "I am junior web developer experienced in PHP using laravel framework.an now trying to use Kotlin."
    override val currentJob: String?
        get() = "Web Developer"
    override val idGithub: String
        get() = "@rickyanwar"
    override val name: String
        get() = "ricky"
    override val email: String?
        get() = "rickyanwar777@gmail.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/rickyanwarr/"
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = "rickyanwar"
    override val skillset: List<Skills>?
          get() = listOf(
            Skills("PHP"),
            Skills("Javascript"),
            Skills("Wordpress"),
            Skills("Hugo"),
            Skills("Web Devlopment")
        )
    override val location: String?
        get() = "Mataram Nusa Tenggara Barat "
    override val jobHistory: List<Jobs>?
        get() = listOf(

            Jobs(
                "Blogger",
                "Freelance",
                "Tukang Ketik",
                "2014",
                "2017"
            ),
              Jobs(
                "WEB Developer",
                "Kantor Sendiri",
                "Tukang ngetik aja",
                "2017",
                "2020"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(

            Educations(
                "Universita Bumigora Mataram",
                "S1",
                "2016 - 2020",
                "Teknik Informatika"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv_ricky.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["cv-ricky"] = RickyAnwar()
            map["rickyanwar"] = RickyAnwar()
            map["ricky"] = RickyAnwar()
        }
    }
} 