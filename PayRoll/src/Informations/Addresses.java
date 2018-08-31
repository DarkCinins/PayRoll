package Informations;

import java.util.Scanner;

/**
 * Created by alunoic on 24/08/18.
 */
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
    }

    private String getString()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void setStreet()
    {
        System.out.println("Rua:");
        this.street = getString();
    }

    public void setNeighborhood()
    {
        System.out.println("Bairro:");
        this.neighborhood = getString();
    }

    public void setCep()
    {
        System.out.println("CEP:");
        this.cep = getString();
    }

    public void setHouseNumber()
    {
        System.out.println("Número da casa:");
        //this.houseNumber =
    }
}
