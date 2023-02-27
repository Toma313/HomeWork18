package rest;

public enum CurrencyEnam {
    DOLLAR("USD"),
    CANDOLLAR("CAD"),
    YAN("CNY"),
    CRONA("CZK"),
    DANCRONA("DKK"),
    GDOL("HKD");
    private String currencTOStr;

    CurrencyEnam(String currEnam) {
        this.currencTOStr = currEnam;
    }
    public String getCurr() {
        return currencTOStr;
    }
}
