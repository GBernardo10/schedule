package com.schedule.kotlin.services

import com.schedule.kotlin.entity.user.User
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.persistence.EntityManager
import javax.ws.rs.core.Response

@ApplicationScoped
class UserService {

    @Inject
    lateinit var em: EntityManager

    fun findAll(): List<User> {
        return em.createNamedQuery("User.findAll", User::class.java).resultList
    }
}