package demoService;

import demoModel.HouseBill;
import reactor.core.publisher.Mono;

public class HouseBillServicempl implements HouseBillService{
    @Override
    public Mono<HouseBill> getHouseBill(String billId) {
        return null;
    }

    @Override
    public Mono<HouseBill> updateHouseBill(String billId) {
        return null;
    }

    @Override
    public Boolean deleteHouseBill(String billId) {
        return null;
    }
}
