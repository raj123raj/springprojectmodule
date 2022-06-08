package gfg.multimodule.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gfg.multimodule.domain.entity.SalaryAccount;

@Repository
public interface SalaryAccountRepository extends CrudRepository<SalaryAccount, Long> {

	SalaryAccount findByEmployeeAccountNumber(String employeeAccountNumber);

}
