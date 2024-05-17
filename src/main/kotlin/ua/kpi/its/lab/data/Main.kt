package ua.kpi.its.lab.data

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import ua.kpi.its.lab.data.entity.Magazine
import ua.kpi.its.lab.data.entity.ScientificArticle
import ua.kpi.its.lab.data.svc.impl.MagazineServiceImpl
import ua.kpi.its.lab.data.svc.impl.ScientificArticleServiceImpl
import java.util.*

fun main() {
    val context = AnnotationConfigApplicationContext("ua.kpi.its.lab.data.config")
    val magazineService = context.getBean(MagazineServiceImpl::class.java)
    val scientificArticleService = context.getBean(ScientificArticleServiceImpl::class.java)

    val mag1 = Magazine(
        name = "Magazine 1",
        topic = "Topic 1",
        language = "Ukr",
        establishDate = Date(),
        issn = "0311-8101",
        priceRecommended = "150 грн",
        periodicity = true
    )
    val mag2 = Magazine(
        name = "Magazine 2",
        topic = "Topic 2",
        language = "Eng",
        establishDate = Date(),
        issn = "0312-8102",
        priceRecommended = "220 грн",
        periodicity = true
    )
    val mag3 = Magazine(
        name = "Magazine 3",
        topic = "Topic 3",
        language = "Ger",
        establishDate = Date(),
        issn = "0313-8103",
        priceRecommended = "250 грн",
        periodicity = true
    )
    val mag4 = Magazine(
        name = "Magazine 4",
        topic = "Topic 4",
        language = "Fra",
        establishDate = Date(),
        issn = "0314-8104",
        priceRecommended = "280 грн",
        periodicity = true
    )
    val mag5 = Magazine(
        name = "Magazine 5",
        topic = "Topic 5",
        language = "Pol",
        establishDate = Date(),
        issn = "0315-8105",
        priceRecommended = "300 грн",
        periodicity = true
    )

    val article1 = ScientificArticle(
        name = "Article 1",
        author = "Author 1",
        writingDate = Date(),
        wordCount = "1000",
        numberLinks = 10,
        origLang = true,
        magazine = mag1
    )

    magazineService.create(mag1)
    magazineService.create(mag2)
    magazineService.create(mag3)
    magazineService.create(mag4)
    magazineService.create(mag5)
    scientificArticleService.create(article1)

    println("Retrieved magazine: $mag3")

    magazineService.delete(4)
}