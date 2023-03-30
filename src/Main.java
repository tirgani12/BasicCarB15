public class Main {
    public static void main(String[] args) {
        BasicStructure audi =new BasicStructure();
        audi.color="balck";
        audi.model="A3";
        audi.power="5000cc";
        Engine x=new Engine();
        x.cylinder="0";
        x.size="1234";
        x.weight="6453k";
        System.out.println(x);

    }
}