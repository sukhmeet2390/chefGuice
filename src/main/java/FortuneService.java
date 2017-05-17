import com.google.inject.ImplementedBy;

/**
 * Created by sukhi on 5/16/17.
 */
@ImplementedBy(FortuneServiceImpl.class)
public interface FortuneService {
    String randomFortune();
}
