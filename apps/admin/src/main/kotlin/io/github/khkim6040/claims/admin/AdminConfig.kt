package io.github.khkim6040.claims.admin

import io.github.khkim6040.claims.domain.ContractRepository
import io.github.khkim6040.claims.domain.InMemoryContractRepository
import io.github.khkim6040.claims.domain.SampleContracts
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration(proxyBeanMethods = false)
class AdminConfig {
    @Bean
    fun contractRepository(): ContractRepository =
        InMemoryContractRepository().apply { SampleContracts.all().forEach(::save) }
}
