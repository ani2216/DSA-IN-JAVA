package string;

public class StringReversal {

	public static void main(String[] args) {
		String s = "My name is   Aniket Dwivedi  ";
		
		String str[] = s.split(" ");
		String new_s = "";
		
		for(int i = str.length-1; i>=0;i--) {
			if(str[i] == " ") continue;
			new_s += str[i];
			if(i!=0){
                new_s += " ";
            }
		}
		
		System.out.println(s.length());
		System.out.println(new_s.length());

	}

}
