package io.ktor.start.features

import io.ktor.start.*
import io.ktor.start.project.*

object AuthLdapFeature : Feature(ApplicationKt, AuthFeature) {
    override val repos = Repos.ktor
    override val artifacts = listOf("io.ktor:ktor-auth-ldap:\$ktor_version")
    override val id = "auth-ldap"
    override val title = "Authentication LDAP"
    override val description = "Handle JDAP authentication"
    override val documentation = "https://ktor.io/features/authentication/ldap.html"
}