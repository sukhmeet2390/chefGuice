import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by sukhi on 5/16/17.
 */
public class FortuneServiceImpl implements FortuneService {
    private static final List<String> MESSAGES =
            Arrays.asList(
                    "Today you will have some refreshing juice.",
                    "Larry just bought your company."
            );

    public String randomFortune() {
        return MESSAGES.get(new Random().nextInt(MESSAGES.size()));
    }
}
