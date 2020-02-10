package com.productcatalog.publicis.entitiy;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private long categoryId;

    @Column(name = "type", nullable = false)
    private String type;

    public Category() {

    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category category = (Category) o;

        if (categoryId != category.categoryId) return false;
        return type != null ? type.equals(category.type) : category.type == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (categoryId ^ (categoryId >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", type='" + type + '\'' +
                '}';
    }
}
