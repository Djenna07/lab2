void main() {
    Random random=new Random();

    int randomNumber=(int) (Math.random()*51)+50;
    int randomOddnumber=1;
    int randomIndex=random.nextInt(3);
    int[] evennumbers={6,8,10};
    int randomEvenNumber=evennumbers[randomIndex];



    if (randomNumber%2!=0){
        randomOddnumber=randomNumber;
    }
    int fullcontainers=randomOddnumber/randomEvenNumber;
    int totalContainers;
    if(randomOddnumber%randomEvenNumber==0){
        totalContainers=fullcontainers;
    }
    else {
        totalContainers=fullcontainers+1;
    }
    System.out.println("Random ODD number: " +randomOddnumber);
    System.out.println("Random Even Number: "+randomEvenNumber);
    System.out.println("Full Container: "+fullcontainers);
    System.out.println("Total Containers: "+totalContainers);

}
