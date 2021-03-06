package pl.marcinbialecki.learning.builder.concretebuilder;

import pl.marcinbialecki.learning.builder.IProductBuilder;
import pl.marcinbialecki.learning.builder.model.Color;
import pl.marcinbialecki.learning.builder.model.Product;

/**
 * Implementation of builder.
 */
public class YellowProductBuilder implements IProductBuilder {

    /**
     * Product to build.
     */
    private Product product;

    /**
     * Constructor.
     */
    public YellowProductBuilder() {
        this.product = new Product();
    }

    public void setName() {
        this.product.setName("yellowProduct");
    }

    public void addColor() {
        this.product.setColor(Color.YELLOW);
    }

    public Product build() {
        return product;
    }

}