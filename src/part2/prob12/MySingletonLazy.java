package lab9.part2.prob12;

import java.util.Optional;

public class MySingletonLazy {
    private static MySingletonLazy instance = null;
    private String  name;
    private MySingletonLazy(){}
    public static MySingletonLazy getInstance(){
        instance = Optional.ofNullable(instance).orElse(new MySingletonLazy());
        return instance;
    }

    public static void main(String[] args){
        System.out.println("before creating instance: " + MySingletonLazy.instance);
        MySingletonLazy singleton1 = MySingletonLazy.getInstance();
        MySingletonLazy singleton2 = MySingletonLazy.getInstance();
        System.out.println("singleton1 = " + singleton1 + "\nsingleton2 = " + singleton2);
        System.out.println("Both variables singleton1 and singleton2 point at  the same memory address,\n" +
                "so that's means the instance of our class can created only once");

    }
}
