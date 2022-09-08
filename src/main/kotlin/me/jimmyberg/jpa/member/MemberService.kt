package me.jimmyberg.jpa.member

import me.jimmyberg.jpa.entity.Member
import me.jimmyberg.jpa.repository.MemberRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class MemberService(
    val memberRepository: MemberRepository
) {

    fun findAll(): List<Member> = memberRepository.findAll()

    fun save(member: Member) = memberRepository.save(member)

    @Transactional
    fun save() {
        println("======================= [ START ] =============================")
        val member = Member(name = "KIM JIM", age = 33)
        save(member)
        member.age = 34
        println("======================== [ END ] ==============================")
    }

}