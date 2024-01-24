package softserve.academy.simplecrud.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import softserve.academy.simplecrud.model.request.NewProduct;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductServiceTest {
    private final ProductService service;

    @Autowired
    public ProductServiceTest(ProductService service) { this.service = service; }

    @Test
    @DisplayName("Checking the successful creation of the product.")
    void testCreateProductCorrect() {
        var expectedMessage = "Product added successfully.";

        var newProduct = new NewProduct("test", new BigDecimal(100));
        var result = service.create(newProduct);

        assertEquals(expectedMessage, result.message());
    }
}
