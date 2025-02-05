package com.bootcamp.demo;

// Person has name and age (bundled together, inseparable)
// But OrderService can associate freely. Different OrderService can reuse the same paymentService varaible.
public class OrderService {
    private PaymentService paymentService;
    private InventoryService inventoryService;

    // Dependency Injection (Spring)
    public OrderService(PaymentService paymentsService, InventoryService inventoryService) {
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
    }

    // ! Unit Test
    // 1. stock <= 0 -> throw
    // 2. pay() -> true, deductStock() -> true
    // 3. pay() -> false,  deductStock() -> true
    // 4. pay() -> true,  deductStock() -> false
    // 5. pay() -> false,  deductStock() -> false
    public boolean order() {
        if (this.inventoryService.checkAvailableStock() <= 0)
            throw new IllegalStateException();
        return this.paymentService.pay() //
            && this.inventoryService.deductStock();
    }

    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        InventoryService is = InventoryService.getInstance();
        OrderService os1 = new OrderService(ps, is);
        OrderService os2 = new OrderService(ps, is);
    }
}
