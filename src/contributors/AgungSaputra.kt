package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class AgungSaputra : Contributor {
    val zipcode = "83362"
    val phonenumber = "+62831 2919 2728"
    val birth = "09 Mei, 1999"
    val twitter = "https://twitter.com/@__agungsptr"
    val fb = "https://facebook.com/profile.php?id=100010969991694"

    override val idGithub: String
        get() = "@agungsptr"

    override val name: String
        get() = "Agung Eka Saputra"

    override val photoUrl: String?
        get() = "https://www.dicoding.com/images/small/avatar/20191006152011f14dfa2720b7e9eaa5e6c95517930eac.jpeg"

    override val currentJob: String?
        get() = "Web Devloper"

    override val email: String?
        get() = "agung.eka1999@gmail.com"

    override val descriptions: String?
        get() = "I am a Computer Science student who studies the fields of Web Programming, mobile programming Android, and Machine Learning."

    override val linkedin: String?
        get() = "linkedin.com/in/agung-saputra-0b5a3912a"

    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/12163886/agung-saputra"

    override val idTelegram: String?
        get() = "@agungsptr"

    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Python", expertiseRate = 75, expertise = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Python-logo-notext.svg/500px-Python-logo-notext.svg.png"),
            Skills("PHP Laravel", expertiseRate = 60, expertise = "https://logodix.com/logo/2150958.png"),
            Skills("HTML5", expertiseRate = 85, expertise = "https://appliedparticletechnology.com/wp-content/uploads/2016/03/html5-logo.png"),
            Skills("Bootsrap", expertiseRate = 70, expertise = "https://i1.wp.com/appliedparticletechnology.com/wp-content/uploads/2016/03/bootstrap-logo.jpg?fit=500%2C500&ssl=1"),
            Skills("CSS", expertiseRate = 75, expertise = "https://appliedparticletechnology.com/wp-content/uploads/2016/03/css-logo.png"),
            Skills("Android Development", expertiseRate = 80, expertise = "https://cdn.usbrandcolors.com/images/logos/android-logo.svg"),
            Skills("Kotlin", expertiseRate = 78, expertise = "https://mk0sigezamu77feo2fi6.kinstacdn.com/wp-content/uploads/2017/07/logo_500x500.png"),
            Skills("Java", expertiseRate = 80, expertise = "https://bigrivertech.com/wp-content/uploads/2014/10/java-logo-1.jpg"),
            Skills("Adobe Pohtoshop", expertiseRate = 80, expertise = "https://store.oceansystems.com/wp-content/uploads/2015/02/PhotoshopCC.jpg"),
            Skills("Adobe Premiere", expertiseRate = 65, expertise = "https://cdn.shopify.com/s/files/1/0013/7202/collections/Adobe-Premiere-Colour_d495517f-863c-45e8-b4ab-4c2c2c457eac_800x800.progressive.jpg?v=1535989091")
        )

    override val location: String?
        get() = "West Nusa Tenggara Province, Indonesia"

    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Web Developer",
                "Mascavio",
                "PHP Programmer",
                "2019",
                "Now"
            ),
            Jobs(
                "IT Solution",
                "Mascavio",
                "Tukang Service PC",
                "2019",
                "Now"
            ),
            Jobs(
                "Web Developer",
                "Freelancer",
                "Web Development SIMRS Permata Hati",
                "2019",
                "Now"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Universitas Bumigora Mataram",
                "S1",
                "2017 - 2021",
                "Ilmu Komputer"
            ),
            Educations(
                "Dicoding Indonesia",
                "Pico Diploma",
                "2019",
                "Android Fundamental"
            ),
            Educations(
                "Dicoding Indonesia",
                "Pico Diploma",
                "2019",
                "Kotlin Fundamental"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("agungsptr.hbs", mapOf("user" to this)))
    }

    companion object{
        fun initialize(map: MutableMap<String, Contributor>){
            map["agungsptr"] = AgungSaputra()
        }
    }
}