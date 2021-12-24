package com.week2;

import java.time.Year;

public class SinhVien {
    private String code;
    private String fullName;
    private int birdYear;
    private int javaScore;

    public SinhVien() {
        this("","",0,0);
    }

    public SinhVien(String code, String fullName, int birdYear, int javaScore) {
        this.code = code;
        this.fullName = fullName;
        this.birdYear = birdYear;
        this.javaScore = javaScore;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirdYear() {
        return birdYear;
    }

    public void setBirdYear(int birdYear) {
        this.birdYear = birdYear;
    }

    public int getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(int javaScore) {
        this.javaScore = javaScore;
    }

    public int getAge(){
        return Year.now().getValue() - birdYear;
    }

    public String infomation(){
        return "Sinh vien " + fullName +", "+ getAge() + " tuổi, có mã sinh viên là " + code + " đạt "+ javaScore + " điểm java";
    }


}
