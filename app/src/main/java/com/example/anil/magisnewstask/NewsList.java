
package com.example.anil.magisnewstask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewsList {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("sub-title")
    @Expose
    private String subTitle;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("writer")
    @Expose
    private String writer;

    public NewsList() {
    }

    /**
     * 
     * @param id
     * @param subTitle
     * @param title
     * @param image
     * @param writer
     */
    public NewsList(Integer id, String title, String subTitle, String image, String writer) {
        super();
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.image = image;
        this.writer = writer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

}
