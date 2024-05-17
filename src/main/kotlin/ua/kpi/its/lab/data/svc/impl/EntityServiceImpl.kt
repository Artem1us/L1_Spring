package ua.kpi.its.lab.data.svc.impl

import org.springframework.stereotype.Service
import ua.kpi.its.lab.data.entity.Magazine
import ua.kpi.its.lab.data.entity.ScientificArticle
import ua.kpi.its.lab.data.repo.MagazineRepository
import ua.kpi.its.lab.data.repo.ScientificArticleRepository
import ua.kpi.its.lab.data.svc.MagazineService
import ua.kpi.its.lab.data.svc.ScientificArticleService

@Service
class MagazineServiceImpl(private val repo: MagazineRepository) : MagazineService {
    override fun create(magazine: Magazine) = repo.save(magazine)
    override fun retrieve(id: Long) = repo.findById(id).orElse(null)
    override fun update(magazine: Magazine) = repo.save(magazine)
    override fun delete(id: Long) = repo.deleteById(id)
}

@Service
class ScientificArticleServiceImpl(private val repo: ScientificArticleRepository) : ScientificArticleService {
    override fun create(scientificArticle: ScientificArticle) = repo.save(scientificArticle)
    override fun retrieve(id: Long) = repo.findById(id).orElse(null)
    override fun update(scientificArticle: ScientificArticle) = repo.save(scientificArticle)
    override fun delete(id: Long) = repo.deleteById(id)
}