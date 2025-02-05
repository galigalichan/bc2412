package com.bootcamp.demo;

// Singleton Pattern (Coding Pattern)
public class InventoryService {
    private static InventoryService uniqueInstance = new InventoryService();
    private int stockCount;

    public static InventoryService getInstance() {
        return uniqueInstance;
    }

    public static int getInventoryStockCount() {
        return uniqueInstance.getStockCount();
    }

    public static boolean deductInventoryStockCount() {
        return uniqueInstance.deductStock();
    }

    public int getStockCount() {
        return this.stockCount;
    }

    public int checkAvailableStock() {
        return 10;
    }

    public boolean deductStock() {
        this.stockCount--;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(InventoryService.getInventoryStockCount());
        InventoryService.deductInventoryStockCount();
    }
}
