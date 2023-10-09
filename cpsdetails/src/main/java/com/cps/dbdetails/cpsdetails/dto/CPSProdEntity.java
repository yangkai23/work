package com.cps.dbdetails.cpsdetails.dto;

import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@Component
public class CPSProdEntity {
    private String name;
    private String receiptId;
    private String prepId;
    private String workflowId;
    private String fileName;
    private String contentInfo;
    private String createdDate;
    private String modifiedDate;
    private String pguid;
    private String responseCode;
    private String responseMessage;
    private String acqStatus;
    private String status;
    private String count;
    private String probotId;
    private String deliveryFileName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getPrepId() {
        return prepId;
    }

    public void setPrepId(String prepId) {
        this.prepId = prepId;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentInfo() {
        return contentInfo;
    }

    public void setContentInfo(String contentInfo) {
        this.contentInfo = contentInfo;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getPguid() {
        return pguid;
    }

    public void setPguid(String pguid) {
        this.pguid = pguid;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getAcqStatus() {
        return acqStatus;
    }

    public void setAcqStatus(String acqStatus) {
        this.acqStatus = acqStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getProbotId() {
        return probotId;
    }

    public void setProbotId(String probotId) {
        this.probotId = probotId;
    }

    public String getDeliveryFileName() {
        return deliveryFileName;
    }

    public void setDeliveryFileName(String deliveryFileName) {
        this.deliveryFileName = deliveryFileName;
    }

    @Override
    public String toString() {
        return name + "," + receiptId + "," + prepId + "," + workflowId + "," + fileName + "," + contentInfo + "," + createdDate + "," + modifiedDate + "," + pguid + "," + responseCode + "," + responseMessage + "," + acqStatus + "," + status + "," + count + "," + probotId + "," + deliveryFileName;
    }

    public List<String> getFields() {
        return Arrays.stream(CPSProdEntity.class.getDeclaredFields()).map(Field::getName).toList();
    }

}
