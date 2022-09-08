package me.jimmyberg.jpa.member

import me.jimmyberg.jpa.entity.Member
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/member")
class MemberController(
    val memberService: MemberService
) {

    @GetMapping("/all")
    fun findAll(): List<Member> = memberService.findAll()

}