package ua.kpi.its.lab.data.svc

import ua.kpi.its.lab.data.entity.Magazine
import ua.kpi.its.lab.data.entity.ScientificArticle

interface MagazineService {
     fun create(magazine: Magazine): Magazine
     fun retrieve(id: Long): Magazine?
     fun update(magazine: Magazine): Magazine
     fun delete(id: Long)
 }

 interface ScientificArticleService {
     fun create(scientificArticle: ScientificArticle): ScientificArticle
     fun retrieve(id: Long): ScientificArticle?
     fun update(scientificArticle: ScientificArticle): ScientificArticle
     fun delete(id: Long)
 }