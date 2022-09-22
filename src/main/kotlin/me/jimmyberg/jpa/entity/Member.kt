package me.jimmyberg.jpa.entity

import javax.persistence.*

@Entity(name = "MEMBERS")
class Member(
    @Id
    @GeneratedValue
    val id: Long? = null,
    val name: String,
    var age: Long,
    @Embedded
    val address: Address? = null,
    @Embedded
    @AttributeOverrides(
        AttributeOverride(name = "zipCode", column = Column(name = "HOME_ZIP_CODE")),
        AttributeOverride(name = "baseAddress", column = Column(name = "HOME_BASE_ADDRESS")),
        AttributeOverride(name = "detailAddress", column = Column(name = "HOME_DETAIL_ADDRESS"))
    )
    val homeAddress: Address? = null
)

@Embeddable
data class Address(
    @Column(name = "ZIP_CODE")
    val zipCode: String,
    val baseAddress: String,
    val detailAddress: String
)