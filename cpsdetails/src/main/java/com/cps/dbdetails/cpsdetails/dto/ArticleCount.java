package com.cps.dbdetails.cpsdetails.dto;

import org.springframework.stereotype.Component;

@Component
public class ArticleCount {
    private String OUTPUTBUNDLENAME;
    private String ArticleCount;

    public String getOUTPUTBUNDLENAME() {
        return OUTPUTBUNDLENAME;
    }

    public void setOUTPUTBUNDLENAME(String OUTPUTBUNDLENAME) {
        this.OUTPUTBUNDLENAME = OUTPUTBUNDLENAME;
    }

    public String getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(String articleCount) {
        ArticleCount = articleCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(OUTPUTBUNDLENAME).append(',');
        sb.append(ArticleCount);
        return sb.toString();
    }
}
