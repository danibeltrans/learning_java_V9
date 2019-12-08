package example.javamodularity;

public interface PricedObject {

    /*
    void normalInterfaceMethod();

    default void interfaceMethodWithDefault() {  init(); }

    default void anotherDefaultMethod() { init(); }

    private void init() { System.out.println("Initializing"); }
    */

    Double getPrice();

    default double getPriceWithTax(){
        return getPriceReturnTax();
    }

    default double getOfferPrice (double discount) {
        return  getPriceReturnTax() * discount;
    }

    private double getPriceReturnTax(){
        return getPrice() * 1.17;
    }

    //How can we handle the code duplicated?
}
