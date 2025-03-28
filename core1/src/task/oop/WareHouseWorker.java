package task.oop;

public  class WareHouseWorker extends Employee {
    private String shift;

    public WareHouseWorker(String name, int age, String shift) {
        super(name, age);
        this.shift = shift;
    }
    @Override
    public void work() {
        System.out.println(name+"Возраст"+age+" отвечает за "+shift);
    }
    public String getShift(){
        return shift;
    }
}