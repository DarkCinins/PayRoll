package Employees;

import Informations.Addresses;
import Informations.PaymentMethod;

/**
 * Created by alunoic on 24/08/18.
 */
public class Employee
{
    private String name;
    private String function;
    private Addresses address = new Addresses();
    private PaymentMethod paymentMethod;
    private boolean syndicate;
    private int syndicateValue;
}