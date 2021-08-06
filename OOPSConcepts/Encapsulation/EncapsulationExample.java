

class DataHiding {
    int id;
    String name;
    DataHiding(int id,String name){
        this.id = id;
        this.name = name;
    }

    void detailShown(){
        System.out.println("Your id : "+id+"\nYour name : "+name);
    }
}



public class EncapsulationExample {

    public static void main(String[] args) {

        DataHiding obj = new DataHiding(111246,"Hariharan");
        obj.detailShown();
    }
}
