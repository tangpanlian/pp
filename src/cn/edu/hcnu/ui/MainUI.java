package cn.edu.hcnu.ui;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.bll.impl.FlightServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUI {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入相应的数字进行操作：");

            System.out.println("按1,录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");
            System.out.println("按6，退出系统");

            int choice = sc.nextInt();

            if (choice == 1) {
                String id = UUID.randomUUID().toString().replace("-","");
                System.out.println("id:" + id);

                System.out.println("请输入航班编号：");
                String flightId = sc.next();
                System.out.print("请输入机型：");
                String planeType = sc.next();
                System.out.println("\n");
                System.out.print("请输座位数：");
                String currentSeatsNum = sc.next();
                System.out.print("请输入起飞机场：");
                String departureAirPort = sc.next();
                System.out.print("请输入目的机场：");
                String destinationAirport = sc.next();
                System.out.print("请输入起飞时间：");
                String departureTime = sc.next();

                Flight flight = new Flight(id, flightId, planeType, currentSeatsNum,
                        departureAirPort, destinationAirport, departureTime);

                IFlightService iFlightService = new FlightServiceImpl();
                iFlightService.insertFlight(flight);
            }
        }
    }
}
