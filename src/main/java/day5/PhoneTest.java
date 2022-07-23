package day5;

public class PhoneTest {
    public static void main(String[] args){
        Phone phone1=new Phone();
        phone1.color="红色";
        phone1.brand="HUAWEI";
        phone1.price=2000;

        phone1.call();
        phone1.sendMessage();
    }

}
