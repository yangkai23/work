package com.cps.dbdetails.cpsdetails.dto;

import org.springframework.stereotype.Component;

@Component
public class ChubObject {
    private String docPguid;
    private String filePath;
    private String fileName;

    public String getDocPguid() {
        return docPguid;
    }

    public void setDocPguid(String docPguid) {
        this.docPguid = docPguid;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        StringBuilder path = new StringBuilder();
        path.append("clvt-chub-prod/").append(filePath).append('/');
        this.filePath = path.toString();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(docPguid).append(',');
        sb.append(filePath).append(fileName);
        return sb.toString();
    }
}
