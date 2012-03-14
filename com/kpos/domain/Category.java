package com.kpos.domain;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kpos.
 * Author: kkwang
 * Date: 3/9/12 10:07 PM
 */
@Entity
@Table(name = "CATEGORY")
public class Category extends AbstractDomainObject {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "tax_rate", nullable = true)
    private double taxRate;

    @Column(name = "is_allowed_hh", nullable = false)
    private boolean isAllowedHH = false; //is category allowed for happy hour?

    @Column(name = "hh_rate", nullable = true)
    private double hhRate = 1; //happy hour rate

    @Column(name = "hh_price", nullable = true)
    private double hh_price;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category", orphanRemoval = true, fetch = FetchType.LAZY)
    @ForeignKey(name = "OPTION_2_CAT_FK")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<CategoryOption> options = new ArrayList<CategoryOption>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category", orphanRemoval = true, fetch = FetchType.LAZY)
    @ForeignKey(name = "SALEITEM_2_CAT_FK")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<SaleItem> saleItems = new ArrayList<SaleItem>();

    @Column(name = "notes", nullable = true)
    private String notes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category", orphanRemoval = true, fetch = FetchType.LAZY)
    @ForeignKey(name = "PRINTER_2_CAT_FK")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Printer> printers = new ArrayList<Printer>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public boolean isAllowedHH() {
        return isAllowedHH;
    }

    public void setAllowedHH(boolean allowedHH) {
        isAllowedHH = allowedHH;
    }

    public double getHhRate() {
        return hhRate;
    }

    public void setHhRate(double hhRate) {
        this.hhRate = hhRate;
    }

    public double getHh_price() {
        return hh_price;
    }

    public void setHh_price(double hh_price) {
        this.hh_price = hh_price;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<CategoryOption> getOptions() {
        return options;
    }

    public void setOptions(List<CategoryOption> options) {
        this.options = options;
    }

    public List<SaleItem> getSaleItems() {
        return saleItems;
    }

    public void setSaleItems(List<SaleItem> saleItems) {
        this.saleItems = saleItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (Double.compare(category.hhRate, hhRate) != 0) return false;
        if (Double.compare(category.hh_price, hh_price) != 0) return false;
        if (isAllowedHH != category.isAllowedHH) return false;
        if (Double.compare(category.taxRate, taxRate) != 0) return false;
        if (id != null ? !id.equals(category.id) : category.id != null) return false;
        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = taxRate != +0.0d ? Double.doubleToLongBits(taxRate) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isAllowedHH ? 1 : 0);
        temp = hhRate != +0.0d ? Double.doubleToLongBits(hhRate) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = hh_price != +0.0d ? Double.doubleToLongBits(hh_price) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
