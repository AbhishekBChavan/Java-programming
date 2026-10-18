class Father{
    void property()  {
        System.out.println("Father's Property");
    }
}
class Mother{
    void jewelry(){
        System.out.println("Mother's Jewelry");
    }
}
// This is NOT allowed in Java
class ChildH extends Father, Mother {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.property();
        obj.jewelry();
    }
}
