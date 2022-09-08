package me.jimmyberg.jpa.repository

import me.jimmyberg.jpa.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>