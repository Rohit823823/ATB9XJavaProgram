package Nov.ex_12112024;

public class Tesla extends Engine {
    @Override
    void startEngine() {
        System.out.println("Starting at the Electric Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping at the Electric Engine");

    }

    void drive() {
        startEngine();
        stopEngine();
    }
}
