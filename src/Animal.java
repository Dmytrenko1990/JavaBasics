
     class Animal{
               String type;
               Animal(String type){
                    this.type=type;
               }
               public void eat(){System.out.println("Animal can eat");}
               public void sleep(){System.out.println("Animal can sleep");}

          }
          class Cat extends Animal{
              Cat(String type) {
                  super(type);

              }
              public void  eat(){
                  System.out.println(type+" eats");
              };
              public void sleep(){System.out.println(type+" sleeps a lot");}
          }
          class Kitten1 extends Cat{
              Kitten1(String type) {
                  super(type);
              }

              public void eat(){System.out.println(type+" eats milk");}
          }
          class Kitten2 extends Cat{
              Kitten2(String type) {
                  super(type);
              }

              public void eat(){System.out.println(type+" eats snacks");}
          }
          class Kitten3 extends Cat{
              Kitten3(String type) {
                  super(type);
              }

              public void eat(){System.out.println(type+" eats everything");}
          }

    class Test{
        public static void main(String[] args) {
            Cat cat=new Cat("Cat");
            cat.eat();
            cat.sleep();
            Kitten1 kitten1=new Kitten1("kitten1");
            kitten1.eat();
            kitten1.sleep();
            Kitten2 kitten2=new Kitten2("kitten2");
            kitten2.eat();
            kitten2.sleep();
            Kitten3 kitten3=new Kitten3("kitten3");
            kitten3.eat();
            kitten3.sleep();
        }
    }