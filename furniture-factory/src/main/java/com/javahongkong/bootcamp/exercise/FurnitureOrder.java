package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;
    

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        
        
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        this.type = type;
        this.furnitureCount = furnitureCount;
        ;
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return null;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method

        return -1.0f;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        for (HashMap<Furniture, Integer> f : ordersOfFurnitures)
        return this.ordersOfFurnitures.get
        return -1;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if (type == Furniture.CHAIR) {
            return 100.0f;}
        else if (type == Furniture.TABLE) {
            return 250.0f;}
        else if (type == Furniture.COUCH) {
            return 500.0f; 
        } else {
        return -1.0f;}
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method

        return -1;
    }
} 