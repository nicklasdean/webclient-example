package com.example.webclient.DTO;

public class CatFactDTO {
    private String fact;
    private int length;

    public CatFactDTO() { }

    public CatFactDTO(String fact, int length) {
        this.fact = fact;
        this.length = length;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "CatFactDTO{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }
}