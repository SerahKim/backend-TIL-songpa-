package com.chapter06_class_object.practice.problem1;

public class MemberDTO {
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public MemberDTO() {} // 기본 생성자

    // setter
    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // getter
    public String getId () {
        return id;
    }

    public String getPwd () {
        return pwd;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public char getGender () {
        return gender;
    }

    public String getPhone () {
        return phone;
    }

    public String getEmail () {
        return email;
    }
}
