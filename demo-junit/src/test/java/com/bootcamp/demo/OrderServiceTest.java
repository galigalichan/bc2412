package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// ! mockito
@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
    @Mock // decouple all dependancies. OrderService doesn't concern the content inside paymentService. It just concerns its result.
    private PaymentService paymentService; // ! mock object (without real implementation)
    @Mock // decouple all dependancies. OrderService doesn't concern the content inside inventoryService. It just concerns its result.
    private InventoryService inventoryService; // ! mock object (without real implementation)
   
    @Test
    void testOrder_whenStockCountLargerThanZero() {
        // ! For this scenario, how do we perform Unit Test?
        // OrderService -> Inventory Service
        // -> Payment Service
        Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(10); // per method by default: reusable
        Mockito.when(this.inventoryService.deductStock()).thenReturn(true); // per metehod by default: reusable
        Mockito.when(this.paymentService.pay()).thenReturn(true); // per metehod by default: reusable

        OrderService os = new OrderService(this.paymentService, this.inventoryService);
        boolean orderResult = os.order();
        assertEquals(true, orderResult);

        verify(this.inventoryService, times(1)).checkAvailableStock(); // in case "when" returns true only after calling more than once
        verify(this.inventoryService, times(1)).deductStock(); // verify... times(1) makes sure the result is true after calling once
        verify(this.paymentService, times(1)).pay();

        assertDoesNotThrow(() -> os.order());
    }

    // assertThrow
    @Test
    void testOrder_whenStockCountIsZero() {
        Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(0);
        OrderService os =
            new OrderService(this.paymentService, this.inventoryService);
        assertThrows(IllegalStateException.class, () -> os.order());

        verify(this.inventoryService, times(1)).checkAvailableStock();
        verify(this.inventoryService, times(0)).deductStock();
        verify(this.paymentService, times(0)).pay();
    }
}
