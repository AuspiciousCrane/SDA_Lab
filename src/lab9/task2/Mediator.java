// package SDA_LAB.src.lab9.task2;

public class Mediator {
    Buyer swedishBuyer;
    Buyer frenchBuyer;
    AmericanSeller americanSeller;
    DollarConverter dollarConverter;


    public void registerSwedishBuyer(SwedishBuyer buyer){
        this.swedishBuyer = buyer;
    }
    public void registerFrenchBuyer(FrenchBuyer buyer){
        this.frenchBuyer = buyer;
    }
    public void registerAmericanSeller(AmericanSeller seller){
        this.americanSeller = seller;
    }
    public boolean placeBid(float bid, String unitOfCurrency){
        float dollar = dollarConverter.convertCurrencyToDollars(bid, unitOfCurrency);
        return americanSeller.isBidAccepted(dollar);
    }
    public void registerDollarConverter(DollarConverter converter){
        this.dollarConverter = converter;
    }
}
