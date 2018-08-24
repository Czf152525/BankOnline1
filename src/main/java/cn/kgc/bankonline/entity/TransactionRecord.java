package cn.kgc.bankonline.entity;

import java.util.Date;
    //交易记录
public class TransactionRecord {
    //id
    private Integer id;
    //卡号
    private String cardno;
    //交易日期   取系统时间
    private Date transaction_date;
    //支出的金额
    private Double expense;
    //存入的金额
    private Double income;
    //账户余额  交易完成时的余额
    private Double balance;
    //交易类型  存款，取款，消费
    private String transaction_type;
    //交易的备注
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Double getExpense() {
        return expense;
    }

    public void setExpense(Double expense) {
        this.expense = expense;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public TransactionRecord(Integer id, String cardno, Date transaction_date, Double expense, Double income, Double balance, String transaction_type, String remark) {
        this.id = id;
        this.cardno = cardno;
        this.transaction_date = transaction_date;
        this.expense = expense;
        this.income = income;
        this.balance = balance;
        this.transaction_type = transaction_type;
        this.remark = remark;
    }

    public TransactionRecord() {
    }

    @Override
    public String toString() {
        return "TransactionRecord{" +
                "id=" + id +
                ", cardno='" + cardno + '\'' +
                ", transaction_date=" + transaction_date +
                ", expense=" + expense +
                ", income=" + income +
                ", balance=" + balance +
                ", transaction_type='" + transaction_type + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
