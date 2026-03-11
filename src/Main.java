//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    float weightChebiliEarth=65.0f;
    float marsGravity=0.38f;
    float weightChebiliMars;
    double weightChebiliMarsDouble;
    int weightChebiliMarsInt;
    char weightChebiliMarsChar;
    int charwithOperation;

    //getting weight on Mars
    weightChebiliMars=weightChebiliEarth*marsGravity;
    System.out.println("Weight On Mars: "+weightChebiliMars);
    System.out.println("Hello Vistula");
    //converting float weight to double
    weightChebiliMarsDouble=weightChebiliMars;
    System.out.printf("Weight on Mars with 4 decimal %.4f\n",weightChebiliMarsDouble);

    //converting double weight to int
    weightChebiliMarsInt= (int)weightChebiliMarsDouble;
    System.out.println("Mars Weight in Int: "+weightChebiliMarsInt);

    //convert int to char
    weightChebiliMarsChar =(char) weightChebiliMarsInt;
    System.out.println("Mars weight in char: "+ weightChebiliMarsChar);


    //operation with char
    charwithOperation= weightChebiliMarsChar +5;
    System.out.println("Operation with char: "+charwithOperation);

}
