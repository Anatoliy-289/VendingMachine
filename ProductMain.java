package impl;

import java.time.LocalDate;

import impl.BottleOfWater;
import impl.HotDrink;

public class ProductMain {
    
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5);


        Product coffee1 = new HotDrink("Americano", 0.3, 98);

        Product coffee2 = new HotDrink("Cappuccino", 0.4, 95);

        Product coffee3 = new HotDrink("Latte", 0.4, 90);

        Product coffee4 = new HotDrink("Raf", 0.4, 95);


        VendingMachine vm = new WaterVendingMachine();

        VendingMachine vm_1 = new VendingMachineHotDrink();


        System.out.println(vm.getProducts());

        System.out.println(vm_1.getProducts());


        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        vm_1.addProducts(List.of(coffee1, coffee1, coffee1, coffee2, coffee2, coffee2,
                                coffee3, coffee3, coffee3, coffee4, coffee4, coffee4));


        System.out.println(vm.getProducts());

        System.out.println(vm_1.getProducts());


        vm.getProduct("Родники");

        vm_1.getProduct("Latte");


        System.out.println(vm.getProducts());
        System.out.println(vm_1.getProducts());
        
    }

}

