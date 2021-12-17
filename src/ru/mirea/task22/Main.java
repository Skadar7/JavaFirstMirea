package ru.mirea.task22;

enum ChairType {
    VICTORIAN,
    MULTIFUNC,
    MAGIC
}

interface Chair {
    public void SetMaterial();
};

class ChairFactory {
    public Chair createChair(ChairType type){
        Chair chair = null;
        switch (type){
            case VICTORIAN:
                chair = new Vic_Chair();
                break;
            case MULTIFUNC:
                chair = new Mul_Chair();
                break;
            case MAGIC:
                chair = new Mag_Chair();
                break;
        }
        chair.SetMaterial();
        return chair;
    }
}

class Vic_Chair implements Chair {
    private String material;

    @Override
    public void SetMaterial() { this.material = "wood"; }
}

class Mul_Chair implements Chair {
    private String material;

    @Override
    public void SetMaterial() { this.material = "aluminium"; }
}

class Mag_Chair implements Chair {
    private String material;

    @Override
    public void SetMaterial() { this.material = "diamond"; }
}

class Client {
    private boolean sit = false;
    private Chair chair;

    public void sit(Chair chair) {
        if (sit) System.out.println("I'm sitting on the another chair!");
        else {
            System.out.println("I've sat down on the chair!");
            this.chair = chair;
            sit = true;
        }
    }

    public void stand()  {
        if (!sit) System.out.println("I've already stood up!");
        else {
            System.out.println("I've stood up from the chair!");
            this.sit = false;
        }
    }
}


public class Main {

    private ChairFactory chairFactory;

    public void createChairs(){
        Client cl = new Client();
        this.chairFactory = new ChairFactory();

        Chair chair1 = chairFactory.createChair(ChairType.VICTORIAN);
        Chair chair2 = chairFactory.createChair(ChairType.MULTIFUNC);
        Chair chair3 = chairFactory.createChair(ChairType.MAGIC);

        cl.sit(chair1);
        cl.sit(chair2);
        cl.stand();
        cl.sit(chair2);
        cl.stand();
        cl.stand();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.createChairs();
    }
}