package bee.hive;

public class Bij  {

    private String name;

     protected void fly(){

         System.out.println("Beezznizz");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString (){
         return "Bee: " + name;

    }

}
