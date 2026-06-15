package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long securityId;

    private String name;
    private String category;
    private double purchasePrice;
    private String purchaseDate;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    protected Security() {}

    public Security(String name, String category, double purchasePrice, String purchaseDate, int quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public long getSecurityId() { return securityId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(double purchasePrice) { this.purchasePrice = purchasePrice; }
    public String getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}