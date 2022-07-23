package day5;

public class Phone {
    public String brand;
    public String color;
    public int price;

    public void call(){
        System.out.println("一个价值"+price+"的"+color+brand+"手机正在打电话");
    }
    public void sendMessage(){
        System.out.println("一个价值"+price+"的"+color+brand+"手机正在发短信");
    }

}
