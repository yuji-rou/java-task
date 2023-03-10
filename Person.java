public class Person {
  public enum Gender {MAN("man"),WOMAN("woman");

    private final String text;

    private Gender(final String text) {
        this.text = text;
    }

    public String getValue() {
        return this.text;
    }
  }

  private Gender gender; 

  public Person(Gender gender) {
    this.gender = gender;
  }

  public void speak() {  
    System.out.println("I'm a " + this.gender.getValue());
  }
 
 
 public static void main(String[] args){
  new Person(Gender.MAN).speak();
  new Person(Gender.WOMAN).speak();
 }
}