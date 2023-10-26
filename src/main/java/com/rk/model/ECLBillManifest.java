package com.rk.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;


public class ECLBillManifest {
    private int id;
    private int shippingAgentRID;
    private int storageLocationRID;
    private String billNo;
    private int billTypeRID;
    private int originDestinationCountryRID;
    private int loadingDischargePortRID;
    private int finalDestinationPortRID;
    private int shipmentTypeRID;
    private int lineID;
    private double totalWeight;
    private int noOfPackages;
    private int totalContainers;
    private int totalNoOfLineItems;
    private int portContractorRID;
    private String description;
    private String remark;
    private int consistencyLevel;
    private String ownerNameEnglish;
    private String ownerNameArabic;
    private Long ownerPhone;
    private Long ownerFax;
    private String ownerPostbox;
    private String postalCode;
    private String buyerName;
    private double tonsQuantity;
    private int barrelQuantity;
    private Long noPortOfDischarge;
    private boolean isDraft;
    private String createdBy;
    private LocalDate createdDate;
    private String updatedBy;
    private LocalDate updatedDate;
    private boolean isActive;
    private List<ECLBillItemManifest> eclManifestBillItems;

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute
    public void setShippingAgentRID(int shippingAgentRID) {
        this.shippingAgentRID = shippingAgentRID;
    }

    @XmlAttribute
    public void setStorageLocationRID(int storageLocationRID) {
        this.storageLocationRID = storageLocationRID;
    }

    @XmlAttribute
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    @XmlAttribute
    public void setBillTypeRID(int billTypeRID) {
        this.billTypeRID = billTypeRID;
    }

    @XmlAttribute
    public void setOriginDestinationCountryRID(int originDestinationCountryRID) {
        this.originDestinationCountryRID = originDestinationCountryRID;
    }

    @XmlAttribute
    public void setLoadingDischargePortRID(int loadingDischargePortRID) {
        this.loadingDischargePortRID = loadingDischargePortRID;
    }

    @XmlAttribute
    public void setFinalDestinationPortRID(int finalDestinationPortRID) {
        this.finalDestinationPortRID = finalDestinationPortRID;
    }

    @XmlAttribute
    public void setShipmentTypeRID(int shipmentTypeRID) {
        this.shipmentTypeRID = shipmentTypeRID;
    }

    @XmlAttribute
    public void setLineID(int lineID) {
        this.lineID = lineID;
    }

    @XmlAttribute
    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    @XmlAttribute
    public void setNoOfPackages(int noOfPackages) {
        this.noOfPackages = noOfPackages;
    }

    @XmlAttribute
    public void setTotalContainers(int totalContainers) {
        this.totalContainers = totalContainers;
    }

    @XmlAttribute
    public void setTotalNoOfLineItems(int totalNoOfLineItems) {
        this.totalNoOfLineItems = totalNoOfLineItems;
    }

    @XmlAttribute
    public void setPortContractorRID(int portContractorRID) {
        this.portContractorRID = portContractorRID;
    }

    @XmlAttribute
    public void setDescription(String description) {
        this.description = description;
    }

    @XmlAttribute
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @XmlAttribute
    public void setConsistencyLevel(int consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
    }

    @XmlAttribute
    public void setOwnerNameEnglish(String ownerNameEnglish) {
        this.ownerNameEnglish = ownerNameEnglish;
    }

    @XmlAttribute
    public void setOwnerNameArabic(String ownerNameArabic) {
        this.ownerNameArabic = ownerNameArabic;
    }

    @XmlAttribute
    public void setOwnerPhone(Long ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    @XmlAttribute
    public void setOwnerFax(Long ownerFax) {
        this.ownerFax = ownerFax;
    }

    @XmlAttribute
    public void setOwnerPostbox(String ownerPostbox) {
        this.ownerPostbox = ownerPostbox;
    }

    @XmlAttribute
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @XmlAttribute
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @XmlAttribute
    public void setTonsQuantity(double tonsQuantity) {
        this.tonsQuantity = tonsQuantity;
    }

    @XmlAttribute
    public void setBarrelQuantity(int barrelQuantity) {
        this.barrelQuantity = barrelQuantity;
    }

    @XmlAttribute
    public void setNoPortOfDischarge(Long noPortOfDischarge) {
        this.noPortOfDischarge = noPortOfDischarge;
    }

    @XmlAttribute
    public void setDraft(boolean isDraft) {
        this.isDraft = isDraft;
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
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @XmlAttribute
    public void setEclManifestBillItems(List<ECLBillItemManifest> eclManifestBillItems) {
        this.eclManifestBillItems = eclManifestBillItems;
    }

	public int getId() {
		return id;
	}

	public int getShippingAgentRID() {
		return shippingAgentRID;
	}

	public int getStorageLocationRID() {
		return storageLocationRID;
	}

	public String getBillNo() {
		return billNo;
	}

	public int getBillTypeRID() {
		return billTypeRID;
	}

	public int getOriginDestinationCountryRID() {
		return originDestinationCountryRID;
	}

	public int getLoadingDischargePortRID() {
		return loadingDischargePortRID;
	}

	public int getFinalDestinationPortRID() {
		return finalDestinationPortRID;
	}

	public int getShipmentTypeRID() {
		return shipmentTypeRID;
	}

	public int getLineID() {
		return lineID;
	}

	public double getTotalWeight() {
		return totalWeight;
	}

	public int getNoOfPackages() {
		return noOfPackages;
	}

	public int getTotalContainers() {
		return totalContainers;
	}

	public int getTotalNoOfLineItems() {
		return totalNoOfLineItems;
	}

	public int getPortContractorRID() {
		return portContractorRID;
	}

	public String getDescription() {
		return description;
	}

	public String getRemark() {
		return remark;
	}

	public int getConsistencyLevel() {
		return consistencyLevel;
	}

	public String getOwnerNameEnglish() {
		return ownerNameEnglish;
	}

	public String getOwnerNameArabic() {
		return ownerNameArabic;
	}

	public Long getOwnerPhone() {
		return ownerPhone;
	}

	public Long getOwnerFax() {
		return ownerFax;
	}

	public String getOwnerPostbox() {
		return ownerPostbox;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public double getTonsQuantity() {
		return tonsQuantity;
	}

	public int getBarrelQuantity() {
		return barrelQuantity;
	}

	public Long getNoPortOfDischarge() {
		return noPortOfDischarge;
	}

	public boolean isDraft() {
		return isDraft;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public List<ECLBillItemManifest> getEclManifestBillItems() {
		return eclManifestBillItems;
	}
    
    
}
   
