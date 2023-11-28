import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class Insurance_loan {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter vehicle number : ");
        String vno = scn.next();
        System.out.print("Enter vehicle name : ");
        String vnm = scn.next();
        System.out.print("Enter vehicle type : ");
        String vtyp = scn.next();
        System.out.print("Enter vehicle price : ");
        float price = scn.nextFloat();

        Logic lg = new Logic();
        lg.setter(vno,vnm,vtyp,price);
        lg.loan();
        lg.insurance();
    }
}

class Logic{
    protected String VehicleNo="";
    protected String VehicleName="";
    protected String VehicleType="";
    protected float VehiclePrice;

    public void setter(String vno,String vnm,String vtyp,float price){
        VehicleNo = vno;
        VehicleName = vnm;
        VehicleType = vtyp;
        VehiclePrice = price;
    }

    public void loan(){
        switch(VehicleType){
            case "2wheeler":
            float Loan2= (VehiclePrice*50)/100;
            System.out.println("Loan : "+Loan2);
            break;
            case "3wheeler":
            float Loan3= (VehiclePrice*75)/100;
            System.out.println("Loan : "+Loan3);
            break;
            case "4wheeler":
            float Loan4= (VehiclePrice*80)/100;
            System.out.println("Loan : "+Loan4);
            break;

        }


        }
        public void insurance(){
            if(VehiclePrice<=150000) System.out.println("Insurace amount : 3500rs"); 
            else if(VehiclePrice>150000 && VehiclePrice==300000) System.out.println("Insurace amount : 4000rs");
            else if(VehiclePrice>300000) System.out.println("Insurace amount : 5000rs");
        }

    }
