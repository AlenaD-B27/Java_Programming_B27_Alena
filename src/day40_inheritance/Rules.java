package day40_inheritance;

public class Rules {
}
class A{
    public int getNum() {
        return 5;
    }

    String getName(){ //default access
        return "James";
    }

    public A get(){ // A is the return type, the method should return an A object;
        return null; //  return new A();
    } // this method created new A object;
}




class B extends A {
    @Override // cannot change name or parameters AND cannot add more parameters, adding more parameters is overLOADING
    public int getNum(){
        return 5;
    }
}


class C extends A {
 @Override // we are able to change access mod to more accessible, here we do public -> protected
    public String getName(){
     return "James";
 }
}

class D extends A{
    @Override
    public D get(){  // you can keep the return type the same || change to covariant: sub class of that return type
        return null; // return new D();
    }










}