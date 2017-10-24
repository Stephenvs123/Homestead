package com.bbd;

@SuppressWarnings("DefaultFileTemplate")
class Nkandla extends Homestead{

    private SwimmingPool swimmingPool;
    private ChickenRun chickenRun;
    private Amphitheater amphitheater;

    public Nkandla(String name, String distict, String province, String country) {
        super(name, distict, province, country);
    }

    public void setAmphitheater(Amphitheater amphitheater) {
        this.amphitheater = amphitheater;
    }

    public void setChickenRun(ChickenRun chickenRun) {
        this.chickenRun = chickenRun;
    }

    public void setSwimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public SwimmingPool getSwimmingPool() {
        return swimmingPool;
    }

    public ChickenRun getChickenRun() {
        return chickenRun;
    }

    public Amphitheater getAmphitheater() {
        return amphitheater;
    }
}
