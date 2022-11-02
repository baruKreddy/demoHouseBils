package demoService;

import demoModel.HouseBill;
import reactor.core.publisher.Mono;

public interface HouseBillService {
    Mono<HouseBill> getHouseBill(String billId);

    public Mono<HouseBill> updateHouseBill();
    public Boolean   deleteHouseBill();
}
