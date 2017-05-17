import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;

/**
 * Created by sukhi on 5/16/17.
 */
public class Application {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ApplicationModule());
        Chef chef = injector.getInstance(Key.get(Chef.class));
        chef.makeFortuneCookie();
    }
}
