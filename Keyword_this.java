public class Keyword_this
{
  String name;
  int roll;
  public Keyword_this (String n){
    this();
    name  = n;
    System.out.println("Name is "+name);
  }
  public Keyword_this()
  {
    System.out.println("Information about you!!");
  }

  Keyword_this(int i)
  {
    this("Jarvis");
    roll = i;
    System.out.println("Roll number is "+roll);
  }
  public static void main(String args[])
  {
    Keyword_this obj = new Keyword_this(1);
    System.out.println(obj.name+"\t"+obj.roll);
  }
}
