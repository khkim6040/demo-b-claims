package io.github.khkim6040.claims.api

import io.github.khkim6040.claims.domain.ContractRepository
import io.github.khkim6040.claims.domain.InMemoryContractRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration(proxyBeanMethods = false)
class ApiConfig {
    @Bean
    fun contractRepository(): ContractRepository = InMemoryContractRepository()
}
