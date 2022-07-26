package com.appoiments.dto;

import java.util.Date;

public class AppoimentDto {

    private int id;
    private Date dateAppoiment;
    private Date hourAppoiment;
    private TestDto idTest;
    private AffiliateDto idAffiliate;

    public AppoimentDto() {
    }

    public AppoimentDto(int id, Date dateAppoiment, Date hourAppoiment, TestDto idTest, AffiliateDto idAffiliate) {
        this.id = id;
        this.dateAppoiment = dateAppoiment;
        this.hourAppoiment = hourAppoiment;
        this.idTest = idTest;
        this.idAffiliate = idAffiliate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateAppoiment() {
        return dateAppoiment;
    }

    public void setDateAppoiment(Date dateAppoiment) {
        this.dateAppoiment = dateAppoiment;
    }

    public Date getHourAppoiment() {
        return hourAppoiment;
    }

    public void setHourAppoiment(Date hourAppoiment) {
        this.hourAppoiment = hourAppoiment;
    }

    public TestDto getIdTest() {
        return idTest;
    }

    public void setIdTest(TestDto idTest) {
        this.idTest = idTest;
    }

    public AffiliateDto getIdAffiliate() {
        return idAffiliate;
    }

    public void setIdAffiliate(AffiliateDto idAffiliate) {
        this.idAffiliate = idAffiliate;
    }
}
