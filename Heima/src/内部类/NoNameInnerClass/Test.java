package 内部类.NoNameInnerClass;

public class Test {
    public static void main(String[] args) {
        new Inter(){
          @Override
          public void swim(){
                System.out.println("游泳");
            }
        };

    }
}
