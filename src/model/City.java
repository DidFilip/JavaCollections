package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    private Long id;
    private String name;
    private Double population, area;


    Map<String, String> names = new HashMap<>();
    Map<String, Double> populations = new HashMap<>();
    Map<String, Double> areas = new HashMap<>();

    List<Map> city = new ArrayList<>();

    public City(String name, Double population, Double area) {
        this.name = name;
        this.population = population;
        this.area = area;
        // przypisanie wartosci do map
        names.put("name", name);
        populations.put("population", population);
        areas.put("area", area);
        // wprowadzanie map do listy map
        city.add(names);
        city.add(populations);
        city.add(areas);
    }

    @Override
    public String toString() {
        return String.format("| %20s | %20.f | 20.2f |", name, population, area);
    }

    public List<Map> getCity() {
        return city;
    }

    public void setCity(List<Map> city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
