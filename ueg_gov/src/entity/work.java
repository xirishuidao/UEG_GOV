package entity;

public class work {
    private long cid;
    private String wname;
    private String wlevel;
    private String waddress;
    private String wcompany;

    public work() {
    }

    public work(long cid, String wname, String wlevel, String waddress, String wcompany) {
        this.cid = cid;
        this.wname = wname;
        this.wlevel = wlevel;
        this.waddress = waddress;
        this.wcompany = wcompany;
    }


    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getWlevel() {
        return wlevel;
    }

    public void setWlevel(String wlevel) {
        this.wlevel = wlevel;
    }

    public String getWaddress() {
        return waddress;
    }

    public void setWaddress(String waddress) {
        this.waddress = waddress;
    }

    public String getWcompany() {
        return wcompany;
    }

    public void setWcompany(String wcompany) {
        this.wcompany = wcompany;
    }
}
