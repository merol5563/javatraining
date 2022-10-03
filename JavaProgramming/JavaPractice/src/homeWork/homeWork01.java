package homeWork;

public class homeWork01 {

    public static void main(String[] args) {


        String brandName = "Mac";
        String operatingSystem;

        if (brandName == "Mac") {
            operatingSystem = "MacOS";
        } else if (brandName == "Lenova") {
            operatingSystem = "Windows";

        } else if (brandName == "Iphone") {
            operatingSystem = "IOS";

        } else if (brandName == "Samsung") {
            operatingSystem = "Android";
        } else {
            operatingSystem = "invalid";
        }

        System.out.println(operatingSystem);
    }
}



