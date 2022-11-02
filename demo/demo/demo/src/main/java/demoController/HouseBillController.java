package demoController;

import demoModel.HouseBill;
import demoService.HouseBillServicempl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/demo")
@AllArgsConstructor
public class HouseBillController {

    private final HouseBillServicempl houseBillServicempl;

    @GetMapping("/getByHouseBillId/{BillId}")
    public Mono<HouseBill> getHouseBill(@PathVariable String billId){
        return houseBillServicempl.getHouseBill(billId);
    }
    
}
