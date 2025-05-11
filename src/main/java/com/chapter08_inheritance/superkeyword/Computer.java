package com.chapter08_inheritance.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String operatingSystem;

    public Computer() {
        System.out.println("Computer 기본 생성자 호출함.");
    }

    /* 모든 필드를 초기화하는 생성자 */
    public Computer(String cpu, int hdd, int ram, String operatingSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;

        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    /* 부모의 필드도 모두 초기화하는 생성자 */
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operatingSystem) {
        /* 부모가 가진 필드를 초기화할 값 전달 */
        super(code, brand, name, price, manufacturingDate);
//        this(cpu, hdd, ram, operatingSystem); // 부모 클래스 (super)가 있을 떄는 this를 사용할 수 없다.

        /* 나머지 필드를 초기화 */
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;

        System.out.println("Computer 클래스의 부모 필드를 초기화하는 생성자 호출함...");
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getCpu() {
        return cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public int getRam() {
        return ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String getInformation() {
        return super.getInformation()
                + " Computer ["
                + "cpu = " + this.cpu
                + ", hdd = " + this.hdd
                + ", ram = " + this.ram
                + ", operatingSystem = " + this.operatingSystem
                + "]";
    }
}
