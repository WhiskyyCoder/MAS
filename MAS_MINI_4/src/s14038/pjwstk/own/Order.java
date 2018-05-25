package s14038.pjwstk.own;

public class Order {
   private String id;

   public Order(){
   }

   //Id O-XXXX-XXX
    public Order setId(String id) throws Exception {
        if(!id.matches("O-[0-8]{4}-[a-z]{3}"))
            throw new Exception("Zly format id: O-XXXX-XXX");
        this.id=id;
        return this;
    }


}
