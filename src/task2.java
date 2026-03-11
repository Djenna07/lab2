
    public void main(String[] args){
        //get subclass from Random class
        Random random=new  Random();
        //get random number
        int randomNum=random.nextInt(100);
        if (randomNum%2==0){
            System.out.println("Even: "+randomNum);
        }else {
            System.out.println("Odd:  "+randomNum);
        }

    }
