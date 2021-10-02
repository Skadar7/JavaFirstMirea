package ru.mirea.task3;

public class Human {
    private final class Head {
        private String hairColor;
        private String eyeColor;

        private boolean areEyesOpen = true;

        public void setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
        }

        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }

        void closeEyes() {
            areEyesOpen = false;
        }
    }
    private final class Hand {
        final int fingersNum = 5;

        void raise(){
            System.out.println("Hi");
        }
    }
    private final class Leg {
        double lengthInCm;

        public void setLengthInCm(double lengthInCm) {
            this.lengthInCm = lengthInCm;
        }
    }

    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;

    public Human() {
        head = new Head();
        leftHand = new Hand();
        rightHand = new Hand();
        leftLeg = new Leg();
        rightLeg = new Leg();
    }

    public void setBlackHairColor() {
        head.setEyeColor("Black");
    }

    public void setStandartLegsLen() {
        leftLeg.setLengthInCm(90);
        rightLeg.setLengthInCm(90);
    }

    public void sayHello(){
        rightHand.raise();
    }
}
