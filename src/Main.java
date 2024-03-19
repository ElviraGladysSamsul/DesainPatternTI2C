//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //Duck duck1 = new Duck();                 //contoh salah karena parent class nya ga bisa di buat objek, karna dia abstrak class
        MallardDuck bebek1 = new MallardDuck();
        bebek1.swim();

        RubberDuck bebek2 = new RubberDuck();
        bebek2.fly();


    }
}