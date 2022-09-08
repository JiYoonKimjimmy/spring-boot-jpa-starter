package me.jimmyberg.jpa.member

import me.jimmyberg.jpa.entity.Member
import me.jimmyberg.jpa.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
    val memberRepository: MemberRepository
) {

    fun findAll(): List<Member> = memberRepository.findAll()

}