import java.util.Scanner;

public class docsothanhchu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int so;
        System.out.println("Nhap so :");
        so=scanner.nextInt();
       if (so>=0 && so <10){
           switch (so)
           {
               case 0:
                   System.out.println("khong");
                   break;
               case 1:
                   System.out.println("Mot");
                   break;
               case 2:
                   System.out.println("Hai");
                   break;
               case 3:
                   System.out.println("Ba");
                   break;
               case 4:
                   System.out.println("Bon");
                   break;
               case 5:
                   System.out.println("Nam");
                   break;
               case 6:
                   System.out.println("Sau");
                   break;
               case 7:
                   System.out.println("Bay");
                   break;
               case 8:
                   System.out.println("Tam");
                   break;
               case 9:
                   System.out.println("9");
                   break;

           }
       }else if (so>=10 && so<20){
           int donvi;
           donvi=so%10;

           switch (donvi){
               case 0:
                   System.out.println("Muoi");
                   break;
               case 1:
                   System.out.println("Muoi mot");
                   break;
               case 2:
                   System.out.println("Muoi hai");
                   break;
               case 3:
                   System.out.println("Muoi ba");
                   break;
               case 4:
                   System.out.println("Muoi bon");
                   break;
               case 5:
                   System.out.println("Muoi nam");
                   break;
               case 6:
                   System.out.println("Muoi sau");
                   break;
               case 7:
                   System.out.println("Muoi bay");
                   break;
               case 8:
                   System.out.println("Muoi tam ");
                   break;
               case 9:
                   System.out.println("Muoi chin");
                   break;
           }
        }else if (so <100 && so >=20){
           int donvi;
           int chuc;
           donvi=so%10;
           so/=10;
           chuc=so%10;
           switch (chuc){
               case 2:
                   System.out.print("Hai muoi");
                   break;
               case 3:
                   System.out.print("Ba muoi");
                   break;
               case 4:
                   System.out.print("Bon muoi");
                   break;
               case 5:
                   System.out.print("Nam muoi");
                   break;
               case 6:
                   System.out.print("Sau muoi");
                   break;
               case 7:
                   System.out.print("Bay muoi");
                   break;
               case 8:
                   System.out.print("Tam muoi");
                   break;
               case 9:
                   System.out.print("Chin muoi");
                   break;

           }
          switch (donvi){
              case 0:
                  System.out.print(" ");
                  break;
              case 1:
                  System.out.print(" mot");
                  break;
              case 2:
                  System.out.print(" hai");
                  break;
              case 3:
                  System.out.print(" ba");
                  break;
              case 4:
                  System.out.print(" bon");
                  break;
              case 5:
                  System.out.print(" nam");
                  break;
              case 6:
                  System.out.print(" sau");
                  break;
              case 7:
                  System.out.print(" bay");
                  break;
              case 8:
                  System.out.print(" tam");
                  break;
              case 9:
                  System.out.print(" chin");
                  break;
          }

       }else if (so==100){
           System.out.println("Mot tram");
       }
       else if (so >100 && so<1000){
           int donvi;
           int chuc;
           int tram;
           donvi=so%10;
           so/=10;
           chuc=so%10;
           so/=10;
           tram=so%10;
           switch (tram){
               case 1:
                   System.out.print("Mot tram");
                   break;
               case 2:
                   System.out.print("Hai tram");
                   break;
               case 3:
                   System.out.print("Ba tram");
                   break;
               case 4:
                   System.out.print("Bon tram");
                   break;
               case 5:
                   System.out.print("Nam tram");
                   break;
               case 6:
                   System.out.print("Sau tram");
                   break;
               case 7:
                   System.out.print("Bay tram");
                   break;
               case 8:
                   System.out.print("Tam tram");
                   break;
               case 9:
                   System.out.print("Chin tram");
                   break;
           }
           switch (chuc){
                   case 0:
                       System.out.print(" linh");
                       break;
               case 1:
                   System.out.print(" muoi");
                   break;
               case 2:
                   System.out.print(" hai muoi");
                   break;
               case 3:
                   System.out.print(" ba muoi");
                   break;
               case 4:
                   System.out.print(" bon muoi");
                   break;
               case 5:
                   System.out.print(" nam muoi");
                   break;
               case 6:
                   System.out.print(" sau muoi");
                   break;
               case 7:
                   System.out.print(" bay muoi");
                   break;
               case 8:
                   System.out.print(" tam muoi");
                   break;
               case 9:
                   System.out.print(" Chin muoi");
                   break;
           }

           switch (donvi){
               case 0:
                   System.out.print(" ");
                   break;
               case 1:
                   System.out.print(" mot");
                   break;
               case 2:
                   System.out.print(" hai");
                   break;
               case 3:
                   System.out.print(" ba");
                   break;
               case 4:
                   System.out.print(" bon");
                   break;
               case 5:
                   System.out.print(" nam");
                   break;
               case 6:
                   System.out.print(" sau");
                   break;
               case 7:
                   System.out.print(" bay");
                   break;
               case 8:
                   System.out.print(" tam");
                   break;
               case 9:
                   System.out.print(" chin");
                   break;
           }
        }
    }
}
