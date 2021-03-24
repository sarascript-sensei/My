package interfaces;

public class Car {
    String carName;
    String carType;

        public Car(String name, String type) {
            this.carName = name;
            this.carType = type;
        }

        private String getCarName() {
            return this.carName;
        }
    class Engine {
        String engineType;
        void setEngine() {

            if(Car.this.carType == "4WD") {

                if (Car.this.getCarName() == "Crysler") {
                    this.engineType = "small engine";
                } else {
                    this.engineType = "big engine";
                }

            }else{
                this.engineType = "big engine";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}

