package org.example.entity;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double width;
    private Double length;
    private Long population;
    @Embedded
    private National national;
    @OneToOne(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REMOVE,
            CascadeType.REFRESH})
    private Capital capital;

    public Country() {
    }

    public Country(String name, Double width, Double length, Long population) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.population = population;
    }

    public Country(String name,Long population) {
        this.name = name;
        this.population = population;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public National getNational() {
        return national;
    }
    public void setNational(National national) {
        this.national = national;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", population=" + population +
                ", national=" + national +
                ", capital=" + capital +
                '}';
    }
}
