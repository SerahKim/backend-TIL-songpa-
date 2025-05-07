package com.chapter06_class_object.practice.problem3.run;

import com.chapter06_class_object.practice.problem3.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO employee = new EmployeeDTO();

        Scanner sc = new Scanner(System.in);

        System.out.println("직원의 번호를 입력해주세요 : ");
        int number = sc.nextInt();

        System.out.println("직원의 이름을 입력해주세요 : ");
        String name = sc.next();

        System.out.println("직원의 부서를 입력해주세요 : ");
        String dept = sc.next();

        System.out.println("직원의 직위를 입력해주세요 : ");
        String job = sc.next();

        System.out.println("직원의 나이를 입력해주세요 : ");
        int age = sc.nextInt();

        System.out.println("직원의 성별을 입력해주세요 : ");
        String gender = sc.next();

        System.out.println("직원의 월급을 입력해주세요 : ");
        int salary = sc.nextInt();

        System.out.println("직원의 보너스를 입력해주세요 : ");
        double bonusPoint = sc.nextDouble();

        System.out.println("직원의 전화번호를 입력해주세요 : ");
        String phone = sc.next();

        System.out.println("직원의 주소를 입력해주세요 : ");
        String address = sc.next();

        employee.setNumber(number);
        employee.setName(name);
        employee.setDept(dept);
        employee.setJob(job);
        employee.setAge(age);
        employee.setGender(gender.charAt(0));
        employee.setSalary(salary);
        employee.setBonusPoint(bonusPoint);
        employee.setPhone(phone);
        employee.setAddress(address);

        System.out.println(employee.getNumber());
        System.out.println(employee.getName());
        System.out.println(employee.getDept());
        System.out.println(employee.getJob());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBonusPoint());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAddress());

    }
}
