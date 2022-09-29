package ru.mirea.task2;

public class Human {
    private final Head head;
    private final Leg leftLeg, rightLeg;
    private final Hand leftHand, rightHand;

    Human(){
        head = new Head();
        leftLeg = new Leg();
        rightLeg = new Leg();
        leftHand = new Hand();
        rightHand = new Hand();

        head.setEyeColor("grey");
        head.setHeight(20.0);
        head.setNoseType(1);
        head.setWidth(10.0);

        leftLeg.setHeight(1.0);
        rightLeg.setHeight(1.0);

        leftHand.setHeight(1.2);
        rightHand.setHeight(1.2);
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }
}
