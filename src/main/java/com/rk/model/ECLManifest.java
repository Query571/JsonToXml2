package com.rk.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;


public class ECLManifest {
    private int id;
    private int manifestTypeId;
    private int manifestFileTypeRID;
    private String manifestFilePath;
    private long crn;
    private long manifestNo;
    private LocalDateTime manifestDate;
    private int voyageRID;
    private int loadingDischargePortRID;
    private LocalDateTime dischargeLoadingDate;
    private LocalDateTime eta;
    private LocalDateTime etd;
    private int totalNoOfCrewPassengers;
    private int totalNoOfBill;
    private int totalContainers;
    private String remark;
    private int approvalStatusRID;
    private int cargoTypeRID;
    private String captainNameEnglish;
    private String captainNameArabic;
    private int tankerGrossWeight;
    private int tankerNetWeight;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
    private boolean isActive;
    private String Vcn;
    private String VesselNameEnglish;
    private String VesselNameArabic;
    private List<ECLBillManifest> eclManifestBillModels;

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute
    public void setManifestTypeId(int manifestTypeId) {
        this.manifestTypeId = manifestTypeId;
    }

    @XmlAttribute
    public void setManifestFileTypeRID(int manifestFileTypeRID) {
        this.manifestFileTypeRID = manifestFileTypeRID;
    }

    @XmlAttribute
    public void setManifestFilePath(String manifestFilePath) {
        this.manifestFilePath = manifestFilePath;
    }

    @XmlAttribute
    public void setCrn(long crn) {
        this.crn = crn;
    }

    @XmlAttribute
    public void setManifestNo(long manifestNo) {
        this.manifestNo = manifestNo;
    }

    @XmlAttribute
    public void setManifestDate(LocalDateTime manifestDate) {
        this.manifestDate = manifestDate;
    }

    @XmlAttribute
    public void setVoyageRID(int voyageRID) {
        this.voyageRID = voyageRID;
    }

    @XmlAttribute
    public void setLoadingDischargePortRID(int loadingDischargePortRID) {
        this.loadingDischargePortRID = loadingDischargePortRID;
    }

    @XmlAttribute
    public void setDischargeLoadingDate(LocalDateTime dischargeLoadingDate) {
        this.dischargeLoadingDate = dischargeLoadingDate;
    }

    @XmlAttribute
    public void setEta(LocalDateTime eta) {
        this.eta = eta;
    }

    @XmlAttribute
    public void setEtd(LocalDateTime etd) {
        this.etd = etd;
    }

    @XmlAttribute
    public void setTotalNoOfCrewPassengers(int totalNoOfCrewPassengers) {
        this.totalNoOfCrewPassengers = totalNoOfCrewPassengers;
    }

    @XmlAttribute
    public void setTotalNoOfBill(int totalNoOfBill) {
        this.totalNoOfBill = totalNoOfBill;
    }

    @XmlAttribute
    public void setTotalContainers(int totalContainers) {
        this.totalContainers = totalContainers;
    }

    @XmlAttribute
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @XmlAttribute
    public void setApprovalStatusRID(int approvalStatusRID) {
        this.approvalStatusRID = approvalStatusRID;
    }

    @XmlAttribute
    public void setCargoTypeRID(int cargoTypeRID) {
        this.cargoTypeRID = cargoTypeRID;
    }

    @XmlAttribute
    public void setCaptainNameEnglish(String captainNameEnglish) {
        this.captainNameEnglish = captainNameEnglish;
    }

    @XmlAttribute
    public void setCaptainNameArabic(String captainNameArabic) {
        this.captainNameArabic = captainNameArabic;
    }

    @XmlAttribute
    public void setTankerGrossWeight(int tankerGrossWeight) {
        this.tankerGrossWeight = tankerGrossWeight;
    }

    @XmlAttribute
    public void setTankerNetWeight(int tankerNetWeight) {
        this.tankerNetWeight = tankerNetWeight;
    }

    @XmlAttribute
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @XmlAttribute
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @XmlAttribute
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @XmlAttribute
    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @XmlAttribute
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @XmlAttribute
    public void setVcn(String vcn) {
        Vcn = vcn;
    }

    @XmlAttribute
    public void setVesselNameEnglish(String vesselNameEnglish) {
        VesselNameEnglish = vesselNameEnglish;
    }

    @XmlAttribute
    public void setVesselNameArabic(String vesselNameArabic) {
        VesselNameArabic = vesselNameArabic;
    }

    @XmlAttribute
    public void setEclManifestBillModels(List<ECLBillManifest> eclManifestBillModels) {
        this.eclManifestBillModels = eclManifestBillModels;
    }

	public int getId() {
		return id;
	}

	public int getManifestTypeId() {
		return manifestTypeId;
	}

	public int getManifestFileTypeRID() {
		return manifestFileTypeRID;
	}

	public String getManifestFilePath() {
		return manifestFilePath;
	}

	public long getCrn() {
		return crn;
	}

	public long getManifestNo() {
		return manifestNo;
	}

	public LocalDateTime getManifestDate() {
		return manifestDate;
	}

	public int getVoyageRID() {
		return voyageRID;
	}

	public int getLoadingDischargePortRID() {
		return loadingDischargePortRID;
	}

	public LocalDateTime getDischargeLoadingDate() {
		return dischargeLoadingDate;
	}

	public LocalDateTime getEta() {
		return eta;
	}

	public LocalDateTime getEtd() {
		return etd;
	}

	public int getTotalNoOfCrewPassengers() {
		return totalNoOfCrewPassengers;
	}

	public int getTotalNoOfBill() {
		return totalNoOfBill;
	}

	public int getTotalContainers() {
		return totalContainers;
	}

	public String getRemark() {
		return remark;
	}

	public int getApprovalStatusRID() {
		return approvalStatusRID;
	}

	public int getCargoTypeRID() {
		return cargoTypeRID;
	}

	public String getCaptainNameEnglish() {
		return captainNameEnglish;
	}

	public String getCaptainNameArabic() {
		return captainNameArabic;
	}

	public int getTankerGrossWeight() {
		return tankerGrossWeight;
	}

	public int getTankerNetWeight() {
		return tankerNetWeight;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public String getVcn() {
		return Vcn;
	}

	public String getVesselNameEnglish() {
		return VesselNameEnglish;
	}

	public String getVesselNameArabic() {
		return VesselNameArabic;
	}

	public List<ECLBillManifest> getEclManifestBillModels() {
		return eclManifestBillModels;
	}
    
    
}
