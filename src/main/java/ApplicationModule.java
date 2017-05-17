import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

/**
 * Created by sukhi on 5/16/17.
 */
public class ApplicationModule extends AbstractModule {
    @Override
    protected void configure() {
        //bind(FortuneService.class).to(FortuneServiceImpl.class);
        bind(FortuneService.class).annotatedWith(Fortune.class).to(FortuneServiceImpl.class).in(Scopes.SINGLETON);
    }
}
