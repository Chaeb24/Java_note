// 아직 문제 해결은 못했지만 한 거까지 풀어봤어요.

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

    void move(int gas){
        if(gas<=this.gas){
            this.gas -= gas;
            System.out.println(carName + "move, resume gas : " + this.gas);}
        else {
            System.out.println(carName + "move, resume gas: " + this.gas);}
    }
    void refuel(int amount){
        this.gas += amount;
        System.out.println("fuel amount: " + this.gas +", resume fuel: " + amount);
    }
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
            for(Car a:cars) {
                if (a.getGas() >= 5) {
                    a.move(5);
                } else {
                    a.move(5);
                    a.refuel(10);
                }
            }
            System.out.println();
        }
    }
}
