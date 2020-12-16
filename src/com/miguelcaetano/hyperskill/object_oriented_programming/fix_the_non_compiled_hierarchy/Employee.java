package com.miguelcaetano.hyperskill.object_oriented_programming.fix_the_non_compiled_hierarchy;

class Employee {

    protected String name;
    protected String birthDate;

    public Employee(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}

class RegularEmployee extends Employee {

    protected long salary;
    protected String hireDate;

    public RegularEmployee(String name, String birthDate, long salary, String hireDate) {
        super(name, birthDate);
        this.salary = salary;
        this.hireDate = hireDate;
    }
}

class ContractEmployee extends Employee {

    protected long payPerHour;
    protected String contractPeriod;

    public ContractEmployee(String name, String birthDate, long payPerHour, String contractPeriod) {
        super(name, birthDate);
        this.payPerHour = payPerHour;
        this.contractPeriod = contractPeriod;
    }
}
