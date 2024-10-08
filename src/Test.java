public class Test {
    int i;
    Test(int i){
        this.i = 12;
        i=15;
    }
    void i(){
        Test i = new Test(3);
        System.out.println(i.i);
        i.i();
    }

    public static void main(String[] args) {
        Test i = new Test(34);
        i.i();
    }
}
