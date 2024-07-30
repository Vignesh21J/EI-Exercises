class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, Here the Welcome to Single Instance...!");
    }
}

public class exercise2 {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();
        singletonInstance.showMessage();
    }
}
