package me.jimmyberg.jpa.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "MEMBERS")
class Member(
    @Id
    @GeneratedValue
    val id: Long? = null,
    val name: String,
    var age: Long
)