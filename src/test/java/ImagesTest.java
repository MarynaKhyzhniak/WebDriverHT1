import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ImagesTest extends BaseTest {

    @Test
    public void checkImagesArePresentAfterSearching() {
        getHomePage().acceptAll();
        getHomePage().searchByKeyword("EPAM");
        getHomePage().clickImagesIcon();
        assertTrue(getImagesPage().getItemsCount() > 0);
    }
}
