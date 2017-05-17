import javax.inject.Inject;

/**
 * Created by sukhi on 5/16/17.
 */
public class Chef {
    private final FortuneService fortuneService;

    @Inject
    public Chef(@Fortune FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public void makeFortuneCookie(){
        FortuneCookie fortuneCookie = new FortuneCookie(fortuneService.randomFortune());
        System.out.println(fortuneCookie.fortune);

    }
}
