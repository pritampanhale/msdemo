package com.productcatalog.publicis.entitiy;

import com.productcatalog.publicis.constants.SizeEnum;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private long productId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "colour", nullable = false)
    private String colour;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "size", nullable = false)
    private SizeEnum size;

    @Column(name = "qty")
    private Integer availableQty;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    public SizeEnum getSize() {
        return size;
    }

    public void setSize(SizeEnum size) {
        this.size = size;
    }

    public Integer getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(Integer availableQty) {
        this.availableQty = availableQty;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (productId != product.productId) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (colour != null ? !colour.equals(product.colour) : product.colour != null) return false;
        if (price != null ? !price.equals(product.price) : product.price != null) return false;
        if (size != product.size) return false;
        if (availableQty != null ? !availableQty.equals(product.availableQty) : product.availableQty != null)
            return false;
        if (category != null ? !category.equals(product.category) : product.category != null) return false;
        return brand != null ? brand.equals(product.brand) : product.brand == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (productId ^ (productId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (availableQty != null ? availableQty.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", availableQty=" + availableQty +
                ", category=" + category +
                ", brand=" + brand +
                '}';
    }
}
