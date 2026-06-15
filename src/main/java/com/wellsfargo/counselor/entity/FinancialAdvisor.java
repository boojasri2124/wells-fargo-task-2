package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long advisorId;

    private String firstName;
    private String lastName;
    private String email;

    @OneToMany(mappedBy = "financialAdvisor")
    private List<Client> clients;

    protected FinancialAdvisor() {}

    public FinancialAdvisor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getAdvisorId() { return advisorId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public List<Client> getClients() { return clients; }
}