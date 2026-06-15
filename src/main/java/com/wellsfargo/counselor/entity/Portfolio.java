package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "clientId")
    private Client client;

    protected Portfolio() {}

    public Portfolio(Client client) {
        this.client = client;
    }

    public long getPortfolioId() { return portfolioId; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
}