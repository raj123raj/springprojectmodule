package gfg.multimodule.service.api;

import java.util.List;
import gfg.multimodule.domain.entity.SalaryAccount;

public interface EmployeeAccountService {

    /**
     * Finds the account with the provided account number.
     * 
     * @param number The account number
     * @return The account
     * @throws EmployyeAccountNotFoundException If no such account exists.
     */
    SalaryAccount findOne(String number) throws EmployyeAccountNotFoundException;

    /**
     * Creates a new account.
     * 
     * @param number
     * @return created account
     */
    SalaryAccount createAccountByEmployeeAccountNumber(String number);
}
