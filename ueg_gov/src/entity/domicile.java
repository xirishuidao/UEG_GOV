package entity;

import java.sql.Date;

public class domicile {
    private long cid;
    private String cname;
    private String cgender;
    private String caddress;
    private int ccountry;
    private String cdegree;
    private Date cdatetime;

    public domicile(){}

    public domicile(String cgender, Date cdatetime, String cdegree, int ccountry, String caddress, String cname, long cid) {

        this.cgender = cgender;
        this.cdatetime = cdatetime;
        this.cdegree = cdegree;
        this.ccountry = ccountry;
        this.caddress = caddress;
        this.cname = cname;
        this.cid = cid;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCgender() {
        return cgender;
    }

    public void setCgender(String cgender) {
        this.cgender = cgender;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public int getCcountry() {
        return ccountry;
    }

    public void setCcountry(int ccountry) {
        this.ccountry = ccountry;
    }

    public String getCdegree() {
        return cdegree;
    }

    public void setCdegree(String cdegree) {
        this.cdegree = cdegree;
    }

    public Date getCdatetime() {
        return cdatetime;
    }

    public void setCdatetime(Date cdatetime) {
        this.cdatetime = cdatetime;
    }
}

