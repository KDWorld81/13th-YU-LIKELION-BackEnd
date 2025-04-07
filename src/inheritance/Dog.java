package inheritance;

public class Dog extends Animal {
    @Override //메소드 오버라이딩을 하고있는 메소드를 나타내는표시
    public void sound() {
        super.sound();
        System.out.println("멍!");
    }
}
