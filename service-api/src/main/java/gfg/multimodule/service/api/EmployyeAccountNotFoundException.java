package gfg.multimodule.service.api;

public class EmployyeAccountNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3891534644498426670L;

    public EmployyeAccountNotFoundException(String accountId) {
        super("No such account with id: " + accountId);
    }
}

