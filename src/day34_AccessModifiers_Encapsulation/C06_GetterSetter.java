package day34_AccessModifiers_Encapsulation;

public class C06_GetterSetter {
    static private String username;
    static private long TCKNo;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTCKNo(long TCKNo) {
        this.TCKNo = TCKNo;
    }

    public String getUsername() {
        return username;
    }

    public long getTCKNo() {
        return TCKNo;
    }
}
