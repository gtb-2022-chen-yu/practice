package ass.Demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AppTest {
    @Test
    void should_list_existing_tasks() {
        final var result = new App().run();
        Assertions.assertEquals(List.of(
                "# To be done",
                "1 Task 01",
                "2 Task 02"), result);
    }//不择手段实现1
}
