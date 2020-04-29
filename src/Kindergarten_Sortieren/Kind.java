package Kindergarten_Sortieren;

public class Kind {
    private String vname;
    private String zname;
    private int alter;

    public Kind(String vname, String zname, int alter) {
        this.vname = vname;
        this.zname = zname;
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    @Override
    public String toString() {
        return "Kind{" +
                "vname='" + vname + '\'' +
                ", zname='" + zname + '\'' +
                ", alter=" + alter +
                '}';
    }
}
