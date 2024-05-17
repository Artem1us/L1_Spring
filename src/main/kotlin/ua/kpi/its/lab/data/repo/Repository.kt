package ua.kpi.its.lab.data.repo

import org.springframework.data.jpa.repository.JpaRepository
import ua.kpi.its.lab.data.entity.Magazine
import ua.kpi.its.lab.data.entity.ScientificArticle

interface MagazineRepository : JpaRepository<Magazine, Long> {
    // додаткові методи, якщо потрібно
}

interface ScientificArticleRepository : JpaRepository<ScientificArticle, Long> {
    // додаткові методи, якщо потрібно
}