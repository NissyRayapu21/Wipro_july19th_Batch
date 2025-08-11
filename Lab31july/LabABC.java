package Lab31july;

public class LabABC {

	public static void main(String[] args) {
		   
        String input = "a2b3c4";
        String output = " ";

        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i); // character (like 'a')
            int count = Character.getNumericValue((input.charAt(i + 1))); // digit (like 2)

            for (int j = 0; j < count; j++) {
                output = output + ch; // append character repeatedly
            }
        }

        System.out.println(output); 
    }


}

