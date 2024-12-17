package entity;

public class healthy {
    private long cid;
    private char cgender;
    private String cblood;
    private double cheight;
    private double cveight;
    private int ccode;
    private int chandicapped;
    private String cdisease1;
    private String cdisease2;


    public healthy() {
    }

    public healthy(long cid, char cgender, String cblood, double cheight, double cveight, int ccode, int chandicapped, String cdisease1, String cdisease2) {
        this.cid = cid;
        this.cgender = cgender;
        this.cblood = cblood;
        this.cheight = cheight;
        this.cveight = cveight;
        this.ccode = ccode;
        this.chandicapped = chandicapped;
        this.cdisease1 = cdisease1;
        this.cdisease2 = cdisease2;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getCblood() {
        return cblood;
    }

    public void setCblood(String cblood) {
        this.cblood = cblood;
    }

    public char getCgender() {
        return cgender;
    }

    public void setCgender(char cgender) {
        this.cgender = cgender;
    }

    public double getCheight() {
        return cheight;
    }

    public void setCheight(double cheight) {
        this.cheight = cheight;
    }

    public double getCveight() {
        return cveight;
    }

    public void setCveight(double cveight) {
        this.cveight = cveight;
    }

    public int getCcode() {
        return ccode;
    }

    public void setCcode(int ccode) {
        this.ccode = ccode;
    }

    public int getChandicapped() {
        return chandicapped;
    }

    public void setChandicapped(int chandicapped) {
        this.chandicapped = chandicapped;
    }

    public String getCdisease1() {
        return cdisease1;
    }

    public void setCdisease1(String cdisease1) {
        this.cdisease1 = cdisease1;
    }

    public String getCdisease2() {
        return cdisease2;
    }

    public void setCdisease2(String cdisease2) {
        this.cdisease2 = cdisease2;
    }
}
