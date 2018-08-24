package cn.kgc.bankonline.entity;
    //账户信息
public class Account {
    //卡号
    private String cardno;
    //6位数字的密码
    private String password;
    //账户余额
    private Double balance;
    //1为正常，0为冻结
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public String getCardno() {
        return cardno;
    }

    public String getPassword() {
        return password;
    }

    public Double getBalance() {
        return balance;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Account(String cardno, String password, Double balance, Integer status) {

        this.cardno = cardno;
        this.password = password;
        this.balance = balance;
        this.status = status;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardno='" + cardno + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", status=" + status +
                '}';
    }
}
