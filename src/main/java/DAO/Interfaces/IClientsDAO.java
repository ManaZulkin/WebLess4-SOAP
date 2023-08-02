package DAO.Interfaces;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface IClientsDAO {
    @WebMethod
    String getAll();
}
