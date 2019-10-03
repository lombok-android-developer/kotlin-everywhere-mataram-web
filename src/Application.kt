package com.linov.community

import com.github.mustachejava.DefaultMustacheFactory
import freemarker.cache.ClassTemplateLoader
import freemarker.cache.TemplateLoader
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.freemarker.FreeMarker
import io.ktor.gson.gson
import io.ktor.html.respondHtml
import io.ktor.http.ContentType
import io.ktor.http.content.*
import io.ktor.mustache.Mustache
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond
import io.ktor.response.respondFile
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.thymeleaf.Thymeleaf
import kotlinx.html.*
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver
import java.io.File

/**
 * DILARANG MENGUBAH FILE INI!!!
 */
fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates") as TemplateLoader?
    }

    install(Mustache) {
        mustacheFactory = DefaultMustacheFactory("templates/mustache")
    }

    install(Thymeleaf) {
        setTemplateResolver(ClassLoaderTemplateResolver().apply {
            prefix = "templates/thymeleaf/"
            suffix = ".html"
            characterEncoding = "utf-8"
        })
    }

    install(ContentNegotiation) {
        gson { }
    }

    routing {
//        get("/") {
//            call.respondHtml {
//                head { }
//                body {
//                    h1 { +"SELAMAT DATANG DI KOTLIN/EVERYWHERE & HACKTOBERFEST MATARAM" }
//                    p {
//                        +"Website ini berisi daftar kontributor dalam event Kotlin/Everywhere dan Hacktoberfest Mataram 2019"
//                    }
//                    p {
//                        +"Daftar Rewards:"
//                        ul {
//                            li { +"Swags dari Tokopedia" }
//                            li { +"Swags dari Lumbung Inovasi" }
//                            li { +"Swags dari Kotlin/Everywhere Mataram" }
//                            li { +"Swags dari Digitalocean" }
//                        }
//                    }
//                    p {
//                        +"Daftar Contributor:"
//                        ul {
//                            ContributorHelper?.contributors?.forEach { key, user ->
//                                li { a("/hack/$key") { +"${user.name} - ${user.currentJob}" } }
//                            }
//                        }
//                    }
//                }
//            }
//        }
        static {
            resources("res")
        }
        get("/") {
            call.respond(MustacheContent("index.hbs", mapOf("user" to "")))
        }
        get("/hack/{id}") {
            ContributorHelper.response(call)
        }

        // todo problem on serving static content
        get("default.css") {
            call.respondFile(File("resources/res/default.css"))
        }

    }

//    routing {
//        static {
//            resources("res")
//        }
//        get("/") {
//            call.respond(
//                MustacheContent("index.html", mapOf("contributors" to ContributorHelper.mapIdToContributor()))
//            )
//        }
//
//        get("/hack/{id}") {
//            ContributorHelper.response(call)
//        }
//        // todo problem on serving static content
////        get("default.css") {
////            call.respondFile(File("resources/res/default.css"))
////        }
//    }
}
