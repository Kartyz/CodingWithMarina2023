package UF4.HerenciaJerarquica;

public class Cat extends Animal{
    private void meow(){
        System.out.println("Cat"+ getId()+"is meow");
    }
        public void sound(){
        meow();
    }
}
