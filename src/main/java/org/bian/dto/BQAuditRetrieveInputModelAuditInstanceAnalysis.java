package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuditRetrieveInputModelAuditInstanceAnalysis
 */
public class BQAuditRetrieveInputModelAuditInstanceAnalysis   {
  private String auditInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return auditInstanceAnalysisReference
  **/

  public String getAuditInstanceAnalysisReference() {
    return auditInstanceAnalysisReference;
  }

  public void setAuditInstanceAnalysisReference(String auditInstanceAnalysisReference) {
    this.auditInstanceAnalysisReference = auditInstanceAnalysisReference;
  }


}

