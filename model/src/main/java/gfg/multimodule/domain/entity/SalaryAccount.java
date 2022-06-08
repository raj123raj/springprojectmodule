package gfg.multimodule.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class SalaryAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeAccountId;

    private String employeeAccountNumber;

    private String type;

    private String creditCardNumber;

    /**
     * Create an empty account.
     */
    public SalaryAccount() {

    }
    
    /**
     * Create a new account.
     * 
     * @param employeeAccountNumber
     *            the account number
     * @param employeeAccountId
     *            the account id
     */
    public SalaryAccount(Long employeeAccountId, String employeeAccountNumber) {
        this.employeeAccountNumber = employeeAccountNumber;
        this.employeeAccountId = employeeAccountId;
    }

    

    

	public Long getEmployeeAccountId() {
		return employeeAccountId;
	}

	public void setEmployeeAccountId(Long employeeAccountId) {
		this.employeeAccountId = employeeAccountId;
	}

	public String getEmployeeAccountNumber() {
		return employeeAccountNumber;
	}

	public void setEmployeeAccountNumber(String employeeAccountNumber) {
		this.employeeAccountNumber = employeeAccountNumber;
	}

	public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

}
