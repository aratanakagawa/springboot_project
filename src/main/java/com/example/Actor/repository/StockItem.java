package com.example.Actor.repository;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stockItem")
public class StockItem extends Item{

    @Id
    @Column(name = "ownerCode")
    private String ownerCode;
    @Column(name = "expirationDateManageFlag")
    private String expirationDateManageFlag;
    @Column(name = "productionLotManageFlag")
    private String productionLotManageFlag;
    @Column(name = "handlingClassification")
    private String handlingClassification;
    @Column(name = "stockItemClassification")
    private String stockItemClassification;

    public String getExpirationDateManageFlag() {
        return expirationDateManageFlag;
    }

    public String getProductionLotManageFlag() {
        return productionLotManageFlag;
    }

    public String getHandlingClassification() {
        return handlingClassification;
    }

    public String getStockItemClassification() {
        return stockItemClassification;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public void setExpirationDateManageFlag(String expirationDateManageFlag) {
        this.expirationDateManageFlag = expirationDateManageFlag;
    }

    public void setProductionLotManageFlag(String productionLotManageFlag) {
        this.productionLotManageFlag = productionLotManageFlag;
    }

    public void setHandlingClassification(String handlingClassification) {
        this.handlingClassification = handlingClassification;
    }

    public void setStockItemClassification(String stockItemClassification) {
        this.stockItemClassification = stockItemClassification;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

}
