package interfaces;

public class CPU {
    protected class Processor {
        void processorCall() {
            System.out.println("Вызов процессора");
        }
    }

        protected class RAM {
            void ramCall() {
                System.out.println("Вызов оперативной памяти");
            }
        }
    }

