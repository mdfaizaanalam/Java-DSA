import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String fruit = input.next();
//------------------------------------------------------------------------------------------------------
// 1st way
        // switch (fruit) {
        //     case "Mango":
        //     System.out.println("King of fruits");
        //     break;

        //     case "Apple":
        //     System.out.println("A red fruit");
        //     break;

        //     case "Banana":
        //     System.out.println("A yellow fruit");
        //     break;

        //     default:
        //     System.out.println("Invalid fruit"); 
        // }

//--------------------------------------------------------------------------------------------------
// 2nd way
        // switch (fruit) {
        //     case "Mango" -> System.out.println("King of fruits");
        //     case "Apple" -> System.out.println("A red fruit");
        //     case "Banana" -> System.out.println("A yellow fruit");
        //     default -> System.out.println("Invalid fruit");
        // }

//-------------------------------------------------------------------------------------------------
        // int dAY = input.nextInt();
        // switch (dAY) {
        //     case 1 :
        //     case 2 :
        //     case 3 :
        //     case 4 :
        //     case 5 :
        //     System.out.println("Weekday");
        //     break;
        //     case 6 :
        //     case 7 : 
        //     System.out.println("Weekend");
        //     break;
        //     default : 
        //     System.out.println("Invalid day");
        // }

//-----------------------------------------------------------------------------------------------------

        // int dAY = input.nextInt();
        // switch (dAY) {
        //     case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
        //     case 6, 7 -> System.out.println("Weekend");
        //     default -> System.out.println("Invalid day");
        // }

//----------------------------------------------------------------------------------------------------

        int empID = input.nextInt();
        String department = input.next();
        // switch (empID) {
        //     case 1 :
        //     System.out.println("Md Faizaan");
        //     break;

        //     case 2:
        //     System.out.println("Ilma Khan");
        //     break;

        //     case 3:
        //     System.out.println("Emp Number 3");
        //     switch (department) {
        //         case "IT":
        //         System.out.println("IT Department");
        //         break;

        //         case "Management" :
        //         System.out.println("Department Management");
        //         break;

        //         default:
        //         System.out.println("Invalid department");
            
        //     }
        //     break;
        //     default:
        //     System.out.println("Invalid employee ID");
        // }



        switch (empID) {
            case 1 -> System.out.println("Md Faizaan");

            case 2 -> System.out.println("Ilma Khan");

            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                        
                    case "Management" -> System.out.println("Department Management");
                        
                    default -> System.out.println("Invalid department");    
                }
            }
            default -> System.out.println("Invalid employee ID");
        
        }
    }
}
