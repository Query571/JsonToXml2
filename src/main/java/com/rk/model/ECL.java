package com.rk.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ECL {

	    private int id;
	    private Integer manifestIEID;
	    private Integer eDeliveryOrderID;
	    private int eclAmendmentTypeRID;
	    private long crn;
	    private String filepath;
	    private int approvalStatusRID;
	    private String createdBy;
	    private LocalDateTime createdDate;
	    private String updatedBy;
	    private LocalDateTime updatedDate;
	    private boolean isActive;
	    private List<ECLManifest> eclManifestModels;

	    @XmlAttribute
	    public void setId(int id) {
	        this.id = id;
	    }

	    @XmlAttribute
	    public void setManifestIEID(Integer manifestIEID) {
	        this.manifestIEID = manifestIEID;
	    }

	    @XmlAttribute
	    public void seteDeliveryOrderID(Integer eDeliveryOrderID) {
	        this.eDeliveryOrderID = eDeliveryOrderID;
	    }

	    @XmlAttribute
	    public void setEclAmendmentTypeRID(int eclAmendmentTypeRID) {
	        this.eclAmendmentTypeRID = eclAmendmentTypeRID;
	    }

	    @XmlAttribute
	    public void setCrn(long crn) {
	        this.crn = crn;
	    }

	    @XmlAttribute
	    public void setFilepath(String filepath) {
	        this.filepath = filepath;
	    }

	    @XmlAttribute
	    public void setApprovalStatusRID(int approvalStatusRID) {
	        this.approvalStatusRID = approvalStatusRID;
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
	    public void setEclManifestModels(List<ECLManifest> eclManifestModels) {
	        this.eclManifestModels = eclManifestModels;
	    }

		public int getId() {
			return id;
		}

		public Integer getManifestIEID() {
			return manifestIEID;
		}

		public Integer geteDeliveryOrderID() {
			return eDeliveryOrderID;
		}

		public int getEclAmendmentTypeRID() {
			return eclAmendmentTypeRID;
		}

		public long getCrn() {
			return crn;
		}

		public String getFilepath() {
			return filepath;
		}

		public int getApprovalStatusRID() {
			return approvalStatusRID;
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

		public List<ECLManifest> getEclManifestModels() {
			return eclManifestModels;
		}	
	    
	    
	    
	    
}
