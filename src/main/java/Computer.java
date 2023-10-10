public class Computer {
    private int storage;
    private String model;


   public Computer(int inputStorage){
       this.storage = inputStorage;
       this.model = "";
   }

   public int getStorage(){
       return this.storage;
   }
   
   public int addStorage(int extraStorage){
       return this.storage+= extraStorage;
   }
    
   public void setModel(String newModel){
       this.model = newModel;
   }
   
   public String getModel(){
       return this.model;
   }
      



} 
