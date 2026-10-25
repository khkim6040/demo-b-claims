package io.github.khkim6040.claims.admin

import io.github.khkim6040.claims.domain.Contract
import io.github.khkim6040.claims.domain.ContractRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/admin/contracts")
class AdminContractController(private val repository: ContractRepository) {
    @GetMapping
    fun list(): List<Contract> = repository.findAll()

    @PostMapping("/{id}/suspend")
    fun suspend(@PathVariable id: String): Contract = repository.save(repository.findById(id).suspend())
}
