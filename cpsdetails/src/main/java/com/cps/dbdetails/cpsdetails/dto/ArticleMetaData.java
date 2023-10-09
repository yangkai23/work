package com.cps.dbdetails.cpsdetails.dto;

import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@Component
public class ArticleMetaData {
    private String ID;
    private String CONTENT_PREP_ID;
    private String JOURNAL_TITLE;
    private String PUBLISHER_NAME;
    private String VOLUME;
    private String ISSUE;
    private String YEAR;
    private String SOURCE_URI;
    private String FPAGE;
    private String ARTICLEID;
    private String PISSN;
    private String EISSN;
    private String INPUTBUNDLENAME;
    private String OUTPUTBUNDLENAME;
    private String CPSTIMESTAMP;
    private String AMPACQUISITIONID;
    private String CPSACQUISITIONTIMESTAMP;
    private String CPSDELIVERYTIMESTAMP;
    private String FEEDTYPE;
    private String CREATED_DATE;
    private String MODIFIED_DATE;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCONTENT_PREP_ID() {
        return CONTENT_PREP_ID;
    }

    public void setCONTENT_PREP_ID(String CONTENT_PREP_ID) {
        this.CONTENT_PREP_ID = CONTENT_PREP_ID;
    }

    public String getJOURNAL_TITLE() {
        return JOURNAL_TITLE;
    }

    public void setJOURNAL_TITLE(String JOURNAL_TITLE) {
        this.JOURNAL_TITLE = JOURNAL_TITLE;
    }

    public String getPUBLISHER_NAME() {
        return PUBLISHER_NAME;
    }

    public void setPUBLISHER_NAME(String PUBLISHER_NAME) {
        this.PUBLISHER_NAME = PUBLISHER_NAME;
    }

    public String getVOLUME() {
        return VOLUME;
    }

    public void setVOLUME(String VOLUME) {
        this.VOLUME = VOLUME;
    }

    public String getISSUE() {
        return ISSUE;
    }

    public void setISSUE(String ISSUE) {
        this.ISSUE = ISSUE;
    }

    public String getYEAR() {
        return YEAR;
    }

    public void setYEAR(String YEAR) {
        this.YEAR = YEAR;
    }

    public String getSOURCE_URI() {
        return SOURCE_URI;
    }

    public void setSOURCE_URI(String SOURCE_URI) {
        this.SOURCE_URI = SOURCE_URI;
    }

    public String getFPAGE() {
        return FPAGE;
    }

    public void setFPAGE(String FPAGE) {
        this.FPAGE = FPAGE;
    }

    public String getARTICLEID() {
        return ARTICLEID;
    }

    public void setARTICLEID(String ARTICLEID) {
        this.ARTICLEID = ARTICLEID;
    }

    public String getPISSN() {
        return PISSN;
    }

    public void setPISSN(String PISSN) {
        this.PISSN = PISSN;
    }

    public String getEISSN() {
        return EISSN;
    }

    public void setEISSN(String EISSN) {
        this.EISSN = EISSN;
    }

    public String getINPUTBUNDLENAME() {
        return INPUTBUNDLENAME;
    }

    public void setINPUTBUNDLENAME(String INPUTBUNDLENAME) {
        this.INPUTBUNDLENAME = INPUTBUNDLENAME;
    }

    public String getOUTPUTBUNDLENAME() {
        return OUTPUTBUNDLENAME;
    }

    public void setOUTPUTBUNDLENAME(String OUTPUTBUNDLENAME) {
        this.OUTPUTBUNDLENAME = OUTPUTBUNDLENAME;
    }

    public String getCPSTIMESTAMP() {
        return CPSTIMESTAMP;
    }

    public void setCPSTIMESTAMP(String CPSTIMESTAMP) {
        this.CPSTIMESTAMP = CPSTIMESTAMP;
    }

    public String getAMPACQUISITIONID() {
        return AMPACQUISITIONID;
    }

    public void setAMPACQUISITIONID(String AMPACQUISITIONID) {
        this.AMPACQUISITIONID = AMPACQUISITIONID;
    }

    public String getCPSACQUISITIONTIMESTAMP() {
        return CPSACQUISITIONTIMESTAMP;
    }

    public void setCPSACQUISITIONTIMESTAMP(String CPSACQUISITIONTIMESTAMP) {
        this.CPSACQUISITIONTIMESTAMP = CPSACQUISITIONTIMESTAMP;
    }

    public String getCPSDELIVERYTIMESTAMP() {
        return CPSDELIVERYTIMESTAMP;
    }

    public void setCPSDELIVERYTIMESTAMP(String CPSDELIVERYTIMESTAMP) {
        this.CPSDELIVERYTIMESTAMP = CPSDELIVERYTIMESTAMP;
    }

    public String getFEEDTYPE() {
        return FEEDTYPE;
    }

    public void setFEEDTYPE(String FEEDTYPE) {
        this.FEEDTYPE = FEEDTYPE;
    }

    public String getCREATED_DATE() {
        return CREATED_DATE;
    }

    public void setCREATED_DATE(String CREATED_DATE) {
        this.CREATED_DATE = CREATED_DATE;
    }

    public String getMODIFIED_DATE() {
        return MODIFIED_DATE;
    }

    public void setMODIFIED_DATE(String MODIFIED_DATE) {
        this.MODIFIED_DATE = MODIFIED_DATE;
    }
    public List<String> getFields() {
        return Arrays.stream(ArticleMetaData.class.getDeclaredFields()).map(Field::getName).toList();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(ID).append(',');
        sb.append(CONTENT_PREP_ID).append(',');
        sb.append(JOURNAL_TITLE).append(',');
        sb.append(PUBLISHER_NAME).append(',');
        sb.append(VOLUME).append(',');
        sb.append(ISSUE).append(',');
        sb.append(YEAR).append(',');
        sb.append(SOURCE_URI).append(',');
        sb.append(FPAGE).append(',');
        sb.append(ARTICLEID).append(',');
        sb.append(PISSN).append(',');
        sb.append(EISSN).append(',');
        sb.append(INPUTBUNDLENAME).append(',');
        sb.append(OUTPUTBUNDLENAME).append(',');
        sb.append(CPSTIMESTAMP).append(',');
        sb.append(AMPACQUISITIONID).append(',');
        sb.append(CPSACQUISITIONTIMESTAMP).append(',');
        sb.append(CPSDELIVERYTIMESTAMP).append(',');
        sb.append(FEEDTYPE).append(',');
        sb.append(CREATED_DATE).append(',');
        sb.append(MODIFIED_DATE);
        return sb.toString();
    }

}
