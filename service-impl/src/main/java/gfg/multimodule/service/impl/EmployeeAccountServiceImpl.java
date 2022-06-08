package gfg.multimodule.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import gfg.multimodule.domain.entity.SalaryAccount;
import gfg.multimodule.repository.SalaryAccountRepository;
import gfg.multimodule.service.api.EmployeeAccountService;
import gfg.multimodule.service.api.EmployyeAccountNotFoundException;

@Service
public class EmployeeAccountServiceImpl implements EmployeeAccountService {

    @Value("${dummy.type}")
    private String dummyType;

    @Autowired
    private SalaryAccountRepository accountRepository;

    /**
     * {@inheritDoc}
     * <p/>
     * Dummy method for testing purposes.
     * 
     * @param employeeAccountNumber The account number. Set 0000 to get an {@link EmployyeAccountNotFoundException} 
     */
    @Override
    public SalaryAccount findOne(String employeeAccountNumber) throws EmployyeAccountNotFoundException {
        if(employeeAccountNumber.equals("0000")) {
            throw new EmployyeAccountNotFoundException("0000");
        }
        
        SalaryAccount salaryAccount = accountRepository.findByEmployeeAccountNumber(employeeAccountNumber);
        if(salaryAccount == null){
          salaryAccount = createAccountByEmployeeAccountNumber(employeeAccountNumber);
        }

        return salaryAccount;
    }

    @Override
    public SalaryAccount createAccountByEmployeeAccountNumber(String employeeAccountNumber) {
        SalaryAccount account = new SalaryAccount();
        account.setEmployeeAccountNumber(employeeAccountNumber);
        return accountRepository.save(account);
    }

    public String getDummyType() {
        return dummyType;
    }

    public void setDummyType(String dummyType) {
        this.dummyType = dummyType;
    }

}
