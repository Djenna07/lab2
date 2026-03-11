void main() {

    BigDecimal netPrice=new BigDecimal("9.99");
    BigDecimal vat=new BigDecimal("0.23");
    BigDecimal grossPrice=netPrice.multiply(BigDecimal.ONE.add(vat));
    BigDecimal totalGrossValueSold=grossPrice.multiply(BigDecimal.valueOf(10000));
    BigDecimal totalNetValueSold=totalGrossValueSold.divide(BigDecimal.ONE.add(vat));


    System.out.println("Gross Price: "+grossPrice);
    System.out.println("Total Value of Sold with gross Price: "+totalGrossValueSold);
    System.out.println("Total Value of Sold with net Price: "+totalNetValueSold);
}