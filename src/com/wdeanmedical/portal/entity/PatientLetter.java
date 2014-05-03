package com.wdeanmedical.portal.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "patient_letter")
public class PatientLetter extends BaseEntity implements Serializable {
  private static final long serialVersionUID = 7809888187633850594L;
  private Patient patient;
  private Date date;
  private PatientLetterStatus status;
  private PatientLetterReason reason;
  private Clinician clinician;
  private String content;
  private Boolean readByRecipient;
  

  public PatientLetter() {
  }
  
  
  @JoinColumn(name = "patient", referencedColumnName = "id")
  @ManyToOne(optional = false)
  public Patient getPatient() {
    return patient;
  }
  public void setPatient(Patient patient) {
    this.patient = patient;
  }
  
  @Column(name = "date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  
  @JoinColumn(name = "status", referencedColumnName = "id")
  @ManyToOne(optional = false)
  public PatientLetterStatus getStatus() {
    return status;
  }
  public void setStatus(PatientLetterStatus status) {
    this.status = status;
  }
  
  @JoinColumn(name = "reason", referencedColumnName = "id")
  @ManyToOne(optional = false)
  public PatientLetterReason getReason() {
    return reason;
  }
  public void setReason(PatientLetterReason reason) {
    this.reason = reason;
  }

  @JoinColumn(name = "clinician", referencedColumnName = "id")
  @ManyToOne(optional = false)
  public Clinician getClinician() {
    return clinician;
  }
  public void setClinician(Clinician clinician) {
    this.clinician = clinician;
  }
  
  @Column(name = "content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  @Column(name = "read_by_recipient")
  public Boolean getReadByRecipient() {
    return readByRecipient;
  }
  public void setReadByRecipient(Boolean readByRecipient) {
    this.readByRecipient = readByRecipient;
  }
}
