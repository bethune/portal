package com.wdeanmedical.portal.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "encounter_question")
public class EncounterQuestion extends BaseEntity implements Serializable {

  private static final long serialVersionUID = -5235097606726399045L;
  private String question = "&nbsp;";
  private String response = "&nbsp;";
  private int encounterId;

  public EncounterQuestion() {
  }

  @Column(name = "question")
  public String getQuestion() { return question; }
  public void setQuestion(String question) { this.question = question; }

  @Column(name = "response")
  public String getResponse() { return response; }
  public void setResponse(String response) { this.response = response; }
  
  @Column(name = "encounter_id")
  public int getEncounterId() { return encounterId; }
  public void setEncounterId(int encounterId) { this.encounterId = encounterId; }
  
}
