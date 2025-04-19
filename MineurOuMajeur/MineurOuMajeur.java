public class MineurOuMajeur {
    public static void main(String[] arg) {
        int age = 10;

        if(age < 18){
            System.out.println("elle est mineur.");
        }else if(age >= 18 && age <= 60){
            System.out.println("elle est majeur");
        }else{
            System.out.println("elle vieux");
        }
       

    }
}