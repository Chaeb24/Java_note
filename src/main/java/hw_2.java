class Car{
    String carName;
    int gas;

    Car(String carNames,int gas){
        this.carName = carNames;
        this.gas = 0;
    }

    void setGas(int gas){this.gas = gas;};
    int getGas(){return gas;};

    void setCarName(String carNames) {carName = carNames;}
    String getCarName(){return carName;}

    int move(int gas){
        if(gas<=this.gas){
            this.gas -= gas;
            return gas;}
        else {return gas;}
    };
    int refuel(int amount){
        this.gas += amount;
        return gas;
    };
}

class Main{
    public static void main(String[] args) {
       Car[] cars = new Car[4];
       String[]carNames = {"kia","ferrari","bmw","toyota"};
       int[] carGas = {10,20,15,17};

       for(int i=0;i<cars.length;i++){
           cars[i] = new Car(carNames[i],carGas[i]);
       }

       for(int i = 0;i<7;i++){
           for(Car car:cars){
               if(car.getGas()){

               }
               System.out.println();
           }
       }
   }
}