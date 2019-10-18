package webservices;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectToJson {

  public static void main(String[] args) {

    ObjectMapper mapper = new ObjectMapper();

    MyPet myPet = new MyPet();

    try {

      // Java objects to JSON file
      mapper.writeValue(new File("c:\\webdriver\\mypet.json"), myPet);

      // Java objects to JSON string - compact-print
      String jsonString = mapper.writeValueAsString(myPet);

      MyPet pet = mapper.readValue(jsonString, MyPet.class);

      System.out.println(pet);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
