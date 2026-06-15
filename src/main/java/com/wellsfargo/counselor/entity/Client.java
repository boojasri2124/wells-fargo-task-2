package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;

    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisorId")
    private FinancialAdvisor financialAdvisor;

    protected Client() {}

    public Client(String firstName, String lastName, String email, FinancialAdvisor financialAdvisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.financialAdvisor = financialAdvisor;
    }

    public long getClientId() { return clientId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public FinancialAdvisor getFinancialAdvisor() { return financialAdvisor; }
    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) { this.financialAdvisor = financialAdvisor; }
}