package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightDao {

    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String departureAirPort);
    Flight getFlightByDestinationAirPort(String destinationAirPort);
    void updateFlight(Flight flight);
}
