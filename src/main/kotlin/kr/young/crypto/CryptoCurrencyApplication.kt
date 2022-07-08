package kr.young.crypto

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CryptoCurrencyApplication

fun main(args: Array<String>) {
	runApplication<CryptoCurrencyApplication>(*args)
}
