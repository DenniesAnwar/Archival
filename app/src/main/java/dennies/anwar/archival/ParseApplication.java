package dennies.anwar.archival;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6i6aE9d0BNgU30v778FSzxsbw6R4wSoIQBxyDzWy")
                .clientKey("4pYAUWgPQYzegHE2UXE3Yb8YMBH6MDwE6F1ZMlBC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
