package DZSel2;


import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenDZ2 {
    @BeforeAll
    static void config() {
        Configuration.browserSize = "1920x1080";
    }

        @Test
        void Plans() {
            open("https://github.com/");
            $(".HeaderMenu").$(byText("Pricing")).hover();
            $(byText("Compare plans")).click();
            $("div h1").shouldHave(text("Choose the plan that’s right for you."));
        }
    }

