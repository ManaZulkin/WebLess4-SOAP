package DAO.Interfaces;

import DAO.CarsDAO;
import DAO.ClientsDAO;
import DAO.MarksDAO;
import DAO.OrdersDAO;

public interface IDAOFactory {

    public CarsDAO getCarsDAO();
    public ClientsDAO getClientsDAO();
    public MarksDAO getMarksDAO();
    public OrdersDAO getOrdersDAO();

}
