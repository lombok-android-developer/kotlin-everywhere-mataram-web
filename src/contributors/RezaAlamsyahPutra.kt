class RezaAlamsyahPutra : Contributor {
    override val photoUrl: String?
        get() = "https://avatars2.githubusercontent.com/u/67163108?s=460&u=d699cf2b06081df29bac79017d78bbd622e51969&v=4"

    override val descriptions: String?
        get() = "i love kotlin"

    override val currentJob: String?
        get() = "Mahasiswa. \n" +
                "Android Dev. \n" +
                "Android Enthusias"

    override val idGithub: String
        get() = "Reas-19"

    override val name: String
        get() = "Reza Alamsyah Putra"

    override val email: String?
        get() = "rezaaalamsyah1996@gmail.com"

    override val linkedin: String?
        get() = ""

    override val stackOverflow: String?
        get() = ""

    override val idTelegram: String?
        get() = "@Reas_19"

    override val skillset: List<Skills>?
        get() = listOf(
                Skills("Kotlin"),
                Skills("Android Development"),
                Skills("Beginner Game Development")
        )

    override val location: String?
        get() = "Sukabumi, Jawa Barat"
    override val jobHistory: List<Jobs>?
        get() = listOf(
                Jobs(
                        "Android Developer",
                        "Mahasiswa",
                        "Universitas Muhammadiyah Sukabumi",
                        "2015",
                        "2020"
                )

        )
    override val educations: List<Educations>?
        get() = listOf(
                Educations(
                        "Dicoding Academy",
                        "Beginner",
                        "2020",
                        "Membuat Aplikasi Android Untuk Pemula"
                ),

                Educations(
                        "Dicoding Academy",
                        "Intermidate",
                        "2020",
                        "Belajar Fundamental Aplikasi Android"
                ),

                Educations(
                        "Dicooding Academy",
                        "Beginner",
                        "2020",
                        "Belajar membuat Game Untuk Pemula"
                ),

                Educations(
                        "Dicooding Academy",
                        "Beginner",
                        "2020",
                        "Belajar Prinsip Pemograman SOLID"
                ),

                Educations(
                        "Dicooding Academy",
                        "Beginner",
                        "2020",
                        "Memulai Pemograman dengan Kotlin"
                ),

                Educations(
                        "Universitas Muhammadiyah Sukabumi",
                        "S1",
                        "2015 - Now",
                        "Teknik Informatika"
                )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv_reza.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["rezaalamsyah1996@gmail.com"] = RezaAlamsyahPutra()

        }
    }
}