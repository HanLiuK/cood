package test;

import java.util.UUID;

public class Test2 {
public static void main(String[] args) {
	UUID uuid=UUID.randomUUID();
    String str = uuid.toString(); 
    String uuidStr=str.replace("-", "");
    System.out.println(uuidStr);
}
}
