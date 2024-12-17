package entity;

public class visa {
    private long cid;
    private int vname;
    private long vid;
    private String vsdate;
    private String vedate;
    private int vstate;

    public visa() {}

    public visa(long cid, int vname, long vid, String vedate, String vsdate, int vstate) {
        this.cid = cid;
        this.vname = vname;
        this.vid = vid;
        this.vedate = vedate;
        this.vsdate = vsdate;
        this.vstate = vstate;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public int getVname() {
        return vname;
    }

    public void setVname(int vname) {
        this.vname = vname;
    }

    public long getVid() {
        return vid;
    }

    public void setVid(long vid) {
        this.vid = vid;
    }

    public String getVsdate() {
        return vsdate;
    }

    public void setVsdate(String vsdate) {
        this.vsdate = vsdate;
    }

    public String getVedate() {
        return vedate;
    }

    public void setVedate(String vedate) {
        this.vedate = vedate;
    }

    public int getVstate() {
        return vstate;
    }

    public void setVstate(int vstate) {
        this.vstate = vstate;
    }
}
