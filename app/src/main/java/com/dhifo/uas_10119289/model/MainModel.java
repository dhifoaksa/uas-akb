package com.dhifo.uas_10119289.model;

public class MainModel {
    private String txtName;
    private int imgSrc;

    public MainModel(String txtName, int imgSrc) {
        this.txtName = txtName;
        this.imgSrc = imgSrc;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }
}
