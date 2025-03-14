package feb.ex_05032025_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception {

//        if(!bankName.currency.equalsIgnoreCase("INR")){
//            try {
//                throw new Exception("Currency Mismatch, Can't give total");
//            } catch (Exception e) {
//                System.out.println("Currency Mismatch");
//            }
//        }
        if(!bankName.currency.equalsIgnoreCase("INR")){
            throw new Exception("Currency Mismatch, Can't give total");
        }
        return bankName.amount + this.amount;
    }
}
