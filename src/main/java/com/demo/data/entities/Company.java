package com.demo.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Company", schema = "dbo")
public class Company implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "accountid")
	private String accountId;
	@Column(name = "companyname")
	private String companyName;
	@Column(name = "preprevenue")
	private String prepRevenue;
	@Column(name = "prepquantity")
	private String prepQuantity;
	@Column(name = "examrevenue")
	private String examRevenue;
	@Column(name = "examquantity")
	private String examQuantity;
	@Column(name = "closedate")
	private String closeDate;
	@Column(name = "creditholdstatus")
	private Float creditHoldStatus;
	@Column(name = "lastinvoicedate")
	private String lastInvoiceDate;
	@Column(name = "firstinvoicedate")
	private String firstInvoiceDate;
	@Column(name = "streetaddress")
	private String streetAddress;
	@Column(name = "city")
	private String city;
	@Column(name = "postalcode")
	private Float postalCode;
	@Column(name = "state")
	private String state;
	@Column(name = "saleschannel")
	private String salesChannel;
	@Column(name = "phonenumber")
	private String phoneNumber;
	@Column(name = "totalinvoicedrevenue")
	private String totalInvoicedRevenue;
	@Column(name = "industry")
	private String industry;
	@Column(name = "accountgrade")
	private String accountGrade;
	@Column(name = "institutionuserassociatedexams")
	private String institutionUserAssociationExams;
	@Column(name = "numberofcontacts")
	private Float numberOfContacts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPrepRevenue() {
		return prepRevenue;
	}

	public void setPrepRevenue(String prepRevenue) {
		this.prepRevenue = prepRevenue;
	}

	public String getPrepQuantity() {
		return prepQuantity;
	}

	public void setPrepQuantity(String prepQuantity) {
		this.prepQuantity = prepQuantity;
	}

	public String getExamRevenue() {
		return examRevenue;
	}

	public void setExamRevenue(String examRevenue) {
		this.examRevenue = examRevenue;
	}

	public String getExamQuantity() {
		return examQuantity;
	}

	public void setExamQuantity(String examQuantity) {
		this.examQuantity = examQuantity;
	}

	public String getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public Float getCreditHoldStatus() {
		return creditHoldStatus;
	}

	public void setCreditHoldStatus(Float creditHoldStatus) {
		this.creditHoldStatus = creditHoldStatus;
	}

	public String getLastInvoiceDate() {
		return lastInvoiceDate;
	}

	public void setLastInvoiceDate(String lastInvoiceDate) {
		this.lastInvoiceDate = lastInvoiceDate;
	}

	public String getFirstInvoiceDate() {
		return firstInvoiceDate;
	}

	public void setFirstInvoiceDate(String firstInvoiceDate) {
		this.firstInvoiceDate = firstInvoiceDate;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Float getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Float postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTotalInvoicedRevenue() {
		return totalInvoicedRevenue;
	}

	public void setTotalInvoicedRevenue(String totalInvoicedRevenue) {
		this.totalInvoicedRevenue = totalInvoicedRevenue;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getAccountGrade() {
		return accountGrade;
	}

	public void setAccountGrade(String accountGrade) {
		this.accountGrade = accountGrade;
	}

	public String getInstitutionUserAssociationExams() {
		return institutionUserAssociationExams;
	}

	public void setInstitutionUserAssociationExams(String institutionUserAssociationExams) {
		this.institutionUserAssociationExams = institutionUserAssociationExams;
	}

	public Float getNumberOfContacts() {
		return numberOfContacts;
	}

	public void setNumberOfContacts(Float numberOfContacts) {
		this.numberOfContacts = numberOfContacts;
	}

}
