package entity;

public class administer {
    private long aid;//15位
    private String aname;
    private String apwd;
    private String aquestion;
    private String aanswer;

    public administer(long aid, String aname, String apwd, String aquestion, String aanswer) {
        this.aid = aid;
        this.aname = aname;
        this.apwd = apwd;
        this.aquestion = aquestion;
    }
    public administer() {

    }

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public String getAquestion() {
        return aquestion;
    }

    public void setAquestion(String aquestion) {
        this.aquestion = aquestion;
    }

    public String getAanswer() {
        return aanswer;
    }

    public void setAanswer(String aanswer) {
        this.aanswer = aanswer;
    }


}
