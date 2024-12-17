package entity;

public class driving {
 private long did;
 private String dtype;
 private String dtime;
 private int daddress;
 private long cid;

    public driving() {
    }

    public driving(long did, String dtype, String dtime, long cid, int daddress) {
        this.did = did;
        this.dtype = dtype;
        this.dtime = dtime;
        this.cid = cid;
        this.daddress = daddress;
    }


    public long getDid() {
        return did;
    }

    public void setDid(long did) {
        this.did = did;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getDtime() {
        return dtime;
    }

    public void setDtime(String dtime) {
        this.dtime = dtime;
    }

    public int getDaddress() {
        return daddress;
    }

    public void setDaddress(int daddress) {
        this.daddress = daddress;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }
}
