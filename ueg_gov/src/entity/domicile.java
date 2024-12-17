package entity;

public class domicile {
    private long cid;
    private String cname;
    private String cgender;
    private String caddress;
    private int ccountry;
    private String cdegree;
    private String cdatetime;

    public domicile(){}

    public domicile(String cgender, String cdatetime, String cdegree, int ccountry, String caddress, String cname, long cid) {

        this.cgender = cgender;
        this.cdatetime = cdatetime;
        this.cdegree = cdegree;
        this.ccountry = ccountry;
        this.caddress = caddress;
        this.cname = cname;
        this.cid = cid;
    }

    public long cid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String cname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String cgender() {
        return cgender;
    }

    public void setCgender(String cgender) {
        this.cgender = cgender;
    }

    public String caddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public String cdegree() {
        return cdegree;
    }

    public void setCdegree(String cdegree) {
        this.cdegree = cdegree;
    }

    public int ccountry() {
        return ccountry;
    }

    public void setCcountry(int ccountry) {
        this.ccountry = ccountry;
    }

    public String cdatetime() {
        return cdatetime;
    }

    public void setCdatetime(String cdatetime) {
        this.cdatetime = cdatetime;
    }
}

