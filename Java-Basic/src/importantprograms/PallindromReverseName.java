package importantprograms;

public class PallindromReverseName {


public static void main(String[] args) {
	String str ="kanak";
    String rev = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        rev = rev + str.charAt(i);
	
	
}
    if (str.equalsIgnoreCase(rev)) {
	System.out.println("Is Pallindrom "+rev);
}else {
	System.out.println("Not Pallindrom");
}
}


}
