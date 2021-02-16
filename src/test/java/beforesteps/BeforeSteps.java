package beforesteps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.provider.*;

import static com.codeborne.selenide.Selenide.open;

public class BeforeSteps {
    @BeforeEach
    @ValueSource(strings = {"iOS", "Android", "Web"})
    public void getPlatform(String platform) {
        open(platform);
    }
}
