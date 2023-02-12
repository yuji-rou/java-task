public class Person {
  public enum Gender {MAN("man"),WOMAN("woman");

    //文字列を保持するフィールド
    private final String text;

    //コンストラクタ
    private Gender(final String text) {
        this.text = text;
    }

    //文字列取得用メソッド
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