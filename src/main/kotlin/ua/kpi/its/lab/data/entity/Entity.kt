package ua.kpi.its.lab.data.entity

import jakarta.persistence.*
import java.util.*


@Entity
data class Magazine(
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
     val id: Long = 0,

     val name: String,
     val topic: String,
     val language: String,
     val establishDate: Date,
     val issn: String,
     val priceRecommended: String,
     val periodicity: Boolean,

) : Comparable<Magazine> {
     override fun compareTo(other: Magazine): Int {
         val nameComparison = name.compareTo(other.name)
         return if (nameComparison != 0) nameComparison else id.compareTo(other.id)
     }
 }

 @Entity
 data class ScientificArticle(
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
     val id: Long = 0,

     val name: String,
     val author: String,
     val writingDate: Date,
     val wordCount: String,
     val numberLinks: Long,
     val origLang: Boolean,

     @ManyToOne
     @JoinColumn(name = "magazine_id")
     val magazine: Magazine?
 )