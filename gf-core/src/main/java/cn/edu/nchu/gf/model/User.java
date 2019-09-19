package cn.edu.nchu.gf.model;

import javax.persistence.*;

public class User {
    @Id
    private String account;

    private String psd;

    /**
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return psd
     */
    public String getPsd() {
        return psd;
    }

    /**
     * @param psd
     */
    public void setPsd(String psd) {
        this.psd = psd;
    }
}