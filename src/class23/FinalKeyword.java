package class23;

public final class FinalKeyword {
    final double gravity=9.8;
    final double PI=3.14;
    final double lightSpeed=299979458;

   final void tryChangeGravity(){
       // gravity=1.6; //we got an error because this variable is marked final
    }
}
/*class Child extends FinalKeyword{
    void tryChangeGravity(){
        // gravity=1.6; //we got an error because this method is marked final
    }
}*/  //we got an error because class is marked final
