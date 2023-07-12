package cz.edu.poc.keycloak

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PoCKeycloakApplication

fun main(args: Array<String>) {
	runApplication<PoCKeycloakApplication>(*args)
}
