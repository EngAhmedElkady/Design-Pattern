// date: 13/2/2023
// author: Ahmed Elkady
// class factory_method
// Description: This class implements the factory method pattern

class Car{
    public Car(){
    }
}

class Sedan extends Car{
    public Sedan(){
    }
}
class SUV extends Car{
    public SUV(){
    }
}
class Hatchback extends Car{
    public Hatchback(){
    }
}

interface Car_Factory{
    public String print();
    public Car creatCar(String carType);
}


class Car_Factory_Implementation implements Car_Factory{
    public String print(){
        return "This is a car factory";
    }
    public Car creatCar(String carType){
        if(carType.equals("Sedan")){
            return new Sedan();
        }
        else if(carType.equals("SUV")){
            return new SUV();
        }
        else if(carType.equals("Hatchback")){
            return new Hatchback();
        }
        else{
            return null;
        }
    }
}

class Main{

    public void main(String[] args){
        Car_Factory carFactory = new Car_Factory_Implementation();
        Car car = carFactory.creatCar("Sedan");
        System.out.println(car);    }
}