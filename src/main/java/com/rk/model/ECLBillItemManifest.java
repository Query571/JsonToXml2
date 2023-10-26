package com.rk.model;

import java.time.LocalDate;

import jakarta.xml.bind.annotation.XmlAttribute;

public class ECLBillItemManifest {
    private int id;
    private Integer customGoodsRID;
    private Integer portAuthorityTariffTypeRID;
    private Integer packageTypeRID;
    private Integer ECLManifestContainerID;
    private Double goodsWeight;
    private Integer noOfPackages;
    private Integer measurement;
    private Integer content;
    private String STCUOMType;
    private String description;
    private String descriptionArabic;
    private String marksChassisNo;
    private Integer HSCode;
    private Integer storageLocationRID;
    private Boolean dangerousGoods;
    private Integer manifestContainerID;
    private Integer IMDGClassRID;
    private String createdBy;
    private LocalDate createdDate;
    private String updatedBy;
    private LocalDate updatedDate;
    private Boolean isActive;

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute
    public void setCustomGoodsRID(Integer customGoodsRID) {
        this.customGoodsRID = customGoodsRID;
    }

    @XmlAttribute
    public void setPortAuthorityTariffTypeRID(Integer portAuthorityTariffTypeRID) {
        this.portAuthorityTariffTypeRID = portAuthorityTariffTypeRID;
    }

    @XmlAttribute
    public void setPackageTypeRID(Integer packageTypeRID) {
        this.packageTypeRID = packageTypeRID;
    }

    @XmlAttribute
    public void setECLManifestContainerID(Integer eCLManifestContainerID) {
        ECLManifestContainerID = eCLManifestContainerID;
    }

    @XmlAttribute
    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    @XmlAttribute
    public void setNoOfPackages(Integer noOfPackages) {
        this.noOfPackages = noOfPackages;
    }

    @XmlAttribute
    public void setMeasurement(Integer measurement) {
        this.measurement = measurement;
    }

    @XmlAttribute
    public void setContent(Integer content) {
        this.content = content;
    }

    @XmlAttribute
    public void setSTCUOMType(String sTCUOMType) {
        STCUOMType = sTCUOMType;
    }

    @XmlAttribute
    public void setDescription(String description) {
        this.description = description;
    }

    @XmlAttribute
    public void setDescriptionArabic(String descriptionArabic) {
        this.descriptionArabic = descriptionArabic;
    }

    @XmlAttribute
    public void setMarksChassisNo(String marksChassisNo) {
        this.marksChassisNo = marksChassisNo;
    }

    @XmlAttribute
    public void setHSCode(Integer hSCode) {
        HSCode = hSCode;
    }

    @XmlAttribute
    public void setStorageLocationRID(Integer storageLocationRID) {
        this.storageLocationRID = storageLocationRID;
    }

    @XmlAttribute
    public void setDangerousGoods(Boolean dangerousGoods) {
        this.dangerousGoods = dangerousGoods;
    }

    @XmlAttribute
    public void setManifestContainerID(Integer manifestContainerID) {
        this.manifestContainerID = manifestContainerID;
    }

    @XmlAttribute
    public void setIMDGClassRID(Integer iMDGClassRID) {
        IMDGClassRID = iMDGClassRID;
    }

    @XmlAttribute
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @XmlAttribute
    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @XmlAttribute
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @XmlAttribute
    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    @XmlAttribute
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
