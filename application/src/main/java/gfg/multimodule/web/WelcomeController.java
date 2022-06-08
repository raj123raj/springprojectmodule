package gfg.multimodule.web;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import gfg.multimodule.domain.entity.SalaryAccount;
import gfg.multimodule.service.api.EmployeeAccountService;
@Controller
public class WelcomeController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

  @Autowired
  protected EmployeeAccountService accountService;

	@RequestMapping("/")
  public String welcome(Map<String, Object> model) {
    // Trying to obtain for account 100
    SalaryAccount account = accountService.findOne("100");
    if(account == null){
      // If there's some problem creating account, return show view with error status
      model.put("message", "Error getting account!");
      model.put("account", "");
      return "welcome/show";
    }
    
    // Return show view with 100 account info
    String accountInfo = "Your account number is ".concat(account.getEmployeeAccountNumber());
    model.put("message", this.message);
    model.put("account", accountInfo);
		return "welcome/show";
	}

	@RequestMapping("foo")
	public String foo(Map<String, Object> model) {
		throw new RuntimeException("Foo");
	}

}
