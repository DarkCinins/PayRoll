package Informations;

import Exceptions.ExceptionsAndGetString;

public class Addresses
{
    private String street;
    private String neighborhood;
    private int houseNumber;
    private String cep;

    public Addresses()
    {
        setStreet();
        setNeighborhood();
        setCep();
        setHouseNumber();
    }

    public void setStreet()
    {
        System.out.println("Rua:");
        this.street = ExceptionsAndGetString.getString();
    }

    public void setNeighborhood()
    {
        System.out.println("Bairro:");
        this.neighborhood = ExceptionsAndGetString.getString();
    }

    public void setCep()
    {
        System.out.println("CEP:");
        this.cep = ExceptionsAndGetString.getString();
    }

    public void setHouseNumber()
    {
        System.out.println("Número da casa:");
        this.houseNumber = ExceptionsAndGetString.tryingCatchInt();
    }

    @Override
    public String toString()
    {
        return "Endereço:" + "\n"
                + "Rua - " + this.street + "\n"
                + "Bairro - " + this.neighborhood + "\n"
                + "Número - " + this.houseNumber + "\n"
                + "CEP - " + this.cep + "\n";
    }
}
