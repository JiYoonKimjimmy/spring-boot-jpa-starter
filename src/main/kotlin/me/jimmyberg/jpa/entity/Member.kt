package me.jimmyberg.jpa.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "MEMBERS")
class Member(
    @Id
    val id: Long? = null,
    val name: String,
    val age: Long
)