package entity;

public class citizen {
    private long cid;//20位
    private String cname;
    private String cpwd;
    private String cquestion;
    private String canswer;

    public citizen(long cid, String cname, String cpwd, String cquestion, String canswer) {
        this.cid = cid;
        this.cname = cname;
        this.cpwd = cpwd;
        this.cquestion = cquestion;
        this.canswer = canswer;
    }
    public citizen(){}

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

    public String getCpwd() {
        return cpwd;
    }

    public void setCpwd(String cpwd) {
        this.cpwd = cpwd;
    }

    public String getCquestion() {
        return cquestion;
    }

    public void setCquestion(String cquestion) {
        this.cquestion = cquestion;
    }

    public String getCanswer() {
        return canswer;
    }

    public void setCanswer(String canswer) {
        this.canswer = canswer;
    }
}
