package conflict_branch;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class conflict_branch {
    @Test
    void googleTest() {
        open("https://google.com");
        sleep(5000);
    }
}


