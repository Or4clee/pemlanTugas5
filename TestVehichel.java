package pemlanTugas5;


public class TestVehichel {
        public static void main(String[] args){
        System.out.println("Creating a vehicle with a 10,000 kg maximumload.");
        
        Vehicle1 mobil1 = new Vehicle1();
        
        System.out.println("Add box #1 (500kg) : " + mobil1.addBox(500));

        System.out.println("Add box #2 (250kg) : " + mobil1.addBox(250));
        
        System.out.println("Add box #3 (5000kg) : " + mobil1.addBox(5000));
        
        System.out.println("Add box #4 (4000kg) : " + mobil1.addBox(4000));
        
        System.out.println("Add box #5 (300kg) : " + mobil1.addBox(250));
        
        System.out.println("mobil1 load is " + mobil1.getLoad() + "kg");
        
    }
}
