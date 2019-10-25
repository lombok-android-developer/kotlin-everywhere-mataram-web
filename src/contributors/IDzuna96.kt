import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class IDzuna96 : Contributor {
    override val idGithub: String
        get() = "iDzuna96"
    override val name: String
        get() = "Dzuna"
    override val photoUrl: String?
        get() = "https://avatars2.githubusercontent.com/u/32156865?s=400&u=dcdd3c05fd207d337564c3a1bb9d363b611adbd5&v=4"
    override val currentJob: String?
        get() = "Mahasiswa"
    override val email: String?
        get() = "dzuna9636@gmail.com"
    override val descriptions: String?
        get() = ". . . ."
    override val linkedin: String?
        get() = "www.linkedin.com/in/iDzuna96"
    override val stackOverflow: String?
        get() = "link"
    override val idTelegram: String?
        get() = "iDzuna96"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("C#"),
            Skills("Java"),
            Skills("Pyhton"),
            Skills("Web Development")
        )
    override val location: String?
        get() = "Monjok, Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Mahasiswa",
                "Universitas Bumigora",
                "Tukang gelamang",
                "2016",
                "present"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(

            Educations(
                "Wearness Education Center",
                "D1",
                "2015 - 2016",
                "Teknik Informatika"
            ),
            Educations(
                "Universitas Bumigora",
                "S1",
                "2016 - present",
                "Ilmu Komputer"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>){
            map["idzuna"] = IDzuna96()
        }
    }
}