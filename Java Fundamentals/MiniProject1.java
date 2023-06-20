public class MiniProject1 {
    public static void main(String[] args) {
        String [][]emp1 = {{"1001","Ashish","1/4/2009","e","R&D","20000","8000","3000"},
                            {"1002","Sushma","23/8/2012","c","PM","3000","12000","9000"},
                            {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
                            {"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
                            {"1005","Ranjan","16/7/2005","m","Engg","50000","20000","20000"},
                            {"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
                            {"1007","Tanmay","12/6/2006","c","PM","29000","12000","10000"}};

        String [][]data2 = {{"e","Engineer","20000"},
                            {"c","Consultant","32000"},
                            {"k","Clerk","12000"},
                            {"r","Receptionist","15000"},
                            {"m","Manager","40000"}};

        int eno = Integer.parseInt(args[0]);
        int col=0;
        String empname=" ",Dcode=" ",Depart=" ",design=" ";
        int basic=0,hra=0,it=0,da=0;
        for(int i=0;i<emp1.length;i++)
        {
            if(eno==Integer.parseInt(emp1[i][col]))
            {
                
                
                    empname=emp1[i][col+1];
                    Dcode=emp1[i][col+3];
                    Depart=emp1[i][col+4];
                    basic=Integer.parseInt(emp1[i][col+5]);
                    hra=Integer.parseInt(emp1[i][col+6]);
                    it=Integer.parseInt(emp1[i][col+7]);
                }
        }

        // for(int i=0;i<data2.length;i++)
        // {
        //     if(Dcode.equals(data2[i][col]))
        //     {
        //         design=data2[i][col+1];
        //         da=Integer.parseInt(data2[i][col+2]);
        //     }
        // }

        switch(Dcode)
        {
            case "e":
                design="Engineer";
                da=Integer.parseInt(data2[0][2]);
                break;

            case "c":
                design="Consultant";
                da=Integer.parseInt(data2[1][2]);
                break;

            case "k":
                design="Clerk";
                da=Integer.parseInt(data2[2][2]);
                break;

            case "r":
                design="Receptionist";
                da=Integer.parseInt(data2[3][2]);
                break;

            case "m":
                design="Manager";
                da=Integer.parseInt(data2[4][2]);
                break;
        }

        int sal = basic+hra+da-it;
        System.out.println("Emp no"+"   "+"Emp Name"+"   "+"Department"+"   "+"Designation"+"   "+"Salary");
        System.out.println(eno+"     "+empname+"         "+Depart+"      "+design+"    "+sal);
        }
        
    }

