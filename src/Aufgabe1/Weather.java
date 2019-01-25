package Aufgabe1;

import java.util.ArrayList;

public class Weather
{

    private Object coord;
    private ArrayList<Object> weather;
    private String base;
    private Object main;
    private int visibility;
    private Object wind;
    private Object clouds;
    private int dt;
    private Object sys;
    private int id;
    private String name;
    private int cod;

    public Object getCoord() {
        return coord;
    }

    public void setCoord(Object coord) {
        this.coord = coord;
    }

    public ArrayList<Object> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<Object> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Object getMain() {
        return main;
    }

    public void setMain(Object main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Object getWind() {
        return wind;
    }

    public void setWind(Object wind) {
        this.wind = wind;
    }

    public Object getClouds() {
        return clouds;
    }

    public void setClouds(Object clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Object getSys() {
        return sys;
    }

    public void setSys(Object sys) {
        this.sys = sys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

}
