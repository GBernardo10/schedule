package com.schedule.kotlin.entity.user

import javax.persistence.*

@Entity
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
class User() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    lateinit var login: String
    lateinit var password: String

}