package pers.han.DDrent;

public class Trunk extends Cars{
    Trunk(int num,String name,int personCap,double goodsCap,double price) {
        this.num = num;
        this.name = name;
        this.personCap = personCap;
        this.goodsCap = goodsCap;
        this.price = price;
    }
    void show() {
        System.out.println(" "+num+"\t\t"+name+"\t"+personCap+"\t\t\t"+goodsCap+"\t\t\t"+price);
    }

}
