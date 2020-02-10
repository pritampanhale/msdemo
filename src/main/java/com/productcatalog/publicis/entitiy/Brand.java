package com.productcatalog.publicis.entitiy;

import javax.persistence.*;

@Entity
public class Brand {

    public Brand() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brand_id")
    private long brandId;

    @Column(name = "name", nullable = false)
    private String name;

    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Brand)) return false;

        Brand brand = (Brand) o;

        if (brandId != brand.brandId) return false;
        return name != null ? name.equals(brand.name) : brand.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (brandId ^ (brandId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", name='" + name + '\'' +
                '}';
    }
}
