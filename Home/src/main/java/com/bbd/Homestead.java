package com.bbd;

public class Homestead {
    private String name;
    private String District;
    private String Province;
    private String Country;

    @Override
    public String toString() {
        return "Homestead{" +
                "Name='" + name + '\'' +
                ", District='" + District + '\'' +
                ", Province='" + Province + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }

    public Homestead(String name, String district, String province, String country) {
        this.name = name;
        District = district;
        Province = province;
        Country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void accept(IVisitor visitor) {
            if (visitor != null)
                visitor.visit(this);
            else throw new RuntimeException("Fail");
    }
}
