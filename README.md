# springprojectmodule
Adding multiple module dependencies and executing the whole project as a single one

├── application
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── gfg
│           │       └── multimodule
│           │           ├── GfgWebJspApplication.java
│           │           └── web
│           │               └── WelcomeController.java
│           └── resources
│               ├── application.properties
│               └── templates
│                   └── welcome
│                       └── show.html
├── model
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── gfg
│                   └── multimodule
│                       └── domain
│                           └── entity
│                               └── SalaryAccount.java
├── pom.xml

├── repository
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── gfg
│                   └── multimodule
│                       └── repository
│                           └── SalaryAccountRepository.java
├── service-api
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── gfg
│                   └── multimodule
│                       └── service
│                           └── api
│                               ├── EmployeeAccountNotFoundException.java
│                               └── EmployeeAccountService.java
└── service-impl
    ├── pom.xml
    └── src
        └── main
            └── java
                └── gfg
                    └── multimodule
                        └── service
                            └── impl
                                └── EmployeeAccountServiceImpl.java
