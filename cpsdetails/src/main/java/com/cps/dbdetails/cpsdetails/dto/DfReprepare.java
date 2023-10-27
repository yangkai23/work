package com.cps.dbdetails.cpsdetails.dto;

import org.springframework.stereotype.Component;

@Component
public class DfReprepare {
    private String name;
    private String filename;
    private String contentInfo;
    private String dfname;
    private String pguid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContentInfo() {
        return contentInfo;
    }

    public void setContentInfo(String contentInfo) {
        this.contentInfo = contentInfo;
    }

    public String getDfname() {
        return dfname;
    }

    public String getPguid() {
        return pguid;
    }

    public void setPguid(String pguid) {
        this.pguid = pguid;
    }

    public void setDfname(String dfname) {
        this.dfname = dfname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(name).append(',');
        sb.append(filename).append(',');
        sb.append(contentInfo).append(',');
        sb.append(dfname).append(',');
        sb.append(pguid);
        return sb.toString();
    }
}
