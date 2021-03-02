package com.champion.pojo;

import lombok.Data;

/**
 * @author shulinYuan
 */

@Data
public class UploadFileVO {

    private String src;

    private String title;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
