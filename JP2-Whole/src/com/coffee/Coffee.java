package com.coffee;

class Coffee {
    Name name;
    Size size;
    double price;
    CaffeineContent caffeineContent;
    MilkType milkType;
    Sugar sugar;
    Temperature temperature;

    public Coffee(Name name, Size size, double price, CaffeineContent caffeineContent, MilkType milkType, Sugar sugar, Temperature temperature) {
        setName(name);
        setSize(size);
        setPrice(price);
        setCaffeineContent(caffeineContent);
        setMilkType(milkType);
        setSugar(sugar);
        setTemperature(temperature);
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CaffeineContent getCaffeineContent() {
        return caffeineContent;
    }

    public void setCaffeineContent(CaffeineContent caffeineContent) {
        this.caffeineContent = caffeineContent;
    }

    public MilkType getMilkType() {
        return milkType;
    }

    public void setMilkType(MilkType milkType) {
        this.milkType = milkType;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s name='%s', size='%s', price=%s, caffeineContent=%d, milkType='%s', sugar=%d, " +
                "temperature=%d", getName(), getSize(), getPrice(), getCaffeineContent(), getMilkType(), getSugar(), getTemperature());
    }
}