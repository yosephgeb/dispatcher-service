package com.polarbookshop.dispatcherservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.function.context.FunctionCatalog;
import org.springframework.cloud.function.context.test.FunctionalSpringBootTest;

@FunctionalSpringBootTest
public class DispatchingFunctionsIntegrationTests {

    @Autowired
    private FunctionCatalog catalog;

  /**  @Test
    void packAndLabelOrder() {
        Function<OrderAcceptedMessage, Flux<OrderDispatchedMessage>>
                packAndLabel = catalog.lookup(
                Function.class,
                "pack|label");
        long orderId = 121;

        StepVerifier.create(packAndLabel.apply(
                        new OrderAcceptedMessage(orderId)
                ))
                .expectNextMatches(dispatchedOrder ->
                        dispatchedOrder.equals(new OrderDispatchedMessage(orderId)))
                .verifyComplete();
    } **/
}
